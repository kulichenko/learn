//Ch12Ex25 Создайте трехуровневую иерархию исключений. Сделайте базовый класс A с методом, к-й возб. искл-е,
//являющ-ся основой иерархии. Унаследуйте класс B от A и переопределите метод так, чтобы он возбуждал исключение из
//второго уровня иерархии. Аналогично поступите с при наследовании класса С от В.
//В методе main() создайте объект класса С, проведите восходящее преобразование к классу А а затем вызовите метод.

package ru.kulichenkom.ekkel.chapter12;

class FirstLevelException extends Exception {
}

class SecondLevelException extends FirstLevelException {
}

class ThirdLevelException extends SecondLevelException {
}

class A {
    void throwException() throws FirstLevelException {
        throw new FirstLevelException();
    }
}

class B extends A {
    @Override
    void throwException() throws SecondLevelException {
        throw new SecondLevelException();
    }
}

class C extends B {
    @Override
    void throwException() throws ThirdLevelException {
        throw new ThirdLevelException();
    }
}

public class Exercise25 {
    public static void main(String[] args) {
        A a = new C();
        try {
            a.throwException();
        } catch (FirstLevelException e) {
            e.printStackTrace();
        }
    }
}