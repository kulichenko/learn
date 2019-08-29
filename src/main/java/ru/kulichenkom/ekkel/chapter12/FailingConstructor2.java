//Ch12Ex23 На базе примера из книги.
// Добавьте в предыдущее упражнение класс с методом dispose(). Измените класс FailingConstructor так,
//чтобы конструктор создавал один из таких объектов в поле класса; далее конструктор может выдавать исключение, после чего
// создает второй объект с необходимостью вызова dispose(). Напишите код для защиты от ошибок; в методе main() убедитесь
// в том, что защита распространяется на все возможные ситуации с ошибками  *
//
package ru.kulichenkom.ekkel.chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class NeedsCleanup {
    private static int counter = 1;
    private int id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanup " + id + " освобожден");
    }
}

public class FailingConstructor2 {
    private BufferedReader in;
    NeedsCleanup nc1;
    NeedsCleanup nc2;

    public FailingConstructor2(String fileName) throws Exception {
        nc1 = new NeedsCleanup();

        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + " не обнаружен");
            throw e;
        } catch (Exception ex) {
            in.close();
            System.out.println("in.close() неуспешен");
            throw ex;
        }
        nc2 = new NeedsCleanup();
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() неуспешен");
        }
        return s;
    }

    public static void main(String[] args) throws Exception {
        try {
            FailingConstructor2 failingConstructor2 = new FailingConstructor2("src/main/resources/TextForExercises.txt");
            try {
                String s;
                int i = 1;
                while ((s = failingConstructor2.getLine()) != null) {
                    System.out.println(i + ": " + s);
                    i++;
                }
            } catch (Exception e) {
                System.out.println("Exception пойман в main()");
                e.printStackTrace(System.out);
            } finally {
                failingConstructor2.nc2.dispose();
                failingConstructor2.nc1.dispose();
            }
        } catch (Exception e) {
            System.out.println("Конструктор FailingConstructor2 не сработал");
        }
    }
}