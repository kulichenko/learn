//Ch15Ex36 Добавьте в класс Processor второе параметризированное исключение
//и продемонстрируйте возможность независимого изменения исключений
package ru.kulichenkom.ekkel.chapter15;
//: generics/ThrowGenericException.java
//github.com/BruceEckel/TIJ4-code/blob/master/examples/generics/ThrowGenericException.java

import java.util.ArrayList;
import java.util.List;

//интерфейс Processor выполняет process() и может возбудить исключение типа E.
//Результат process сохраняется в List<T> resultCollector.
interface Processor<T, E extends Exception, F extends Exception> {
    void process(List<T> resultCollector) throws E, F;
}

//ProcessRunner содержит метод processAll(), который выполняет каждый содержащийся в нем объект
//Process и возвращает resultCollector.
class ProcessRunner<T, E extends Exception, F extends Exception> extends ArrayList<Processor<T, E, F>> {
    List<T> processAll() throws E, F {
        List<T> resultCollector = new ArrayList<>();
        for (Processor<T, E, F> processor : this) {
            processor.process(resultCollector);
        }
        return resultCollector;
    }
}

class Failure1 extends Exception {
}

class Failure2 extends Exception {
}

class Processor1 implements Processor<String, Failure1, Failure2> {
    static int count = 3;

    public void process(List<String> resultCollector) throws Failure1, Failure2 {
        if (count-- > 1) {
            resultCollector.add("Hep!");
        } else {
            resultCollector.add("Ho!");
        }
        if (count < 0) {
            throw new Failure1();
        }
        if (count == 0) {
            throw new Failure2();
        }
    }
}


class Processor2 implements Processor<Integer, Failure1, Failure2> {
    static int count = 2;

    public void process(List<Integer> resultCollector) throws Failure1, Failure2 {
        if (count-- == 0) {
            resultCollector.add(47);
        } else {
            resultCollector.add(11);
        }
        if (count < 0) {
            throw new Failure2();
        }
        if (count == 0) {
            throw new Failure1();
        }
    }
}

public class ThrowGenericException {
    public static void main(String[] args) {
        ProcessRunner<String, Failure1, Failure2> runner = new ProcessRunner<>();
        for (int i = 0; i < 3; i++) {
            runner.add(new Processor1());
        }
        try {
            System.out.println(runner.processAll());
        } catch (Failure1 e) {
            System.out.println(e);
        } catch (Failure2 failure2) {
            System.out.println(failure2);
        }

        ProcessRunner<Integer, Failure1, Failure2> runner2 = new ProcessRunner<>();
        for (int i = 0; i < 3; i++) {
            runner2.add(new Processor2());
        }
        try {
            System.out.println(runner2.processAll());
        } catch (Failure2 e) {
            System.out.println(e);
        } catch (Failure1 failure1) {
            System.out.println(failure1);
        }
    }
} ///:~