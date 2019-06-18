//Ch10Ex21 Создайте интерфейс U с тремя методами. Создайте класс А с методом, который
//создает ссылку на U посредством построения анонимного внутреннего класса.
//Создайте второй класс В, который содержит массив U. Класс В содержит один метод,
//который получает и сохраняет ссылку на U в массиве, второй метод, который сбрасывает
//ссылку в массиве (определяемую аргументом метода) в состояние null; и третий метод,
//который перебирает элементы массива и вызывает методы U. В методе main() создайте
//группу объектов A и один объект В. Заполните объект B ссылками U, произведенными
//объектами А. Используйте В для выполнения обратных вызовов по всем объектам А.
//Удалите некоторые ссылки из U на В.
package ru.kulichenkom.ekkel.chapter10;

interface U {
    void first();

    void second();

    String toString();
}

class A {
    U makeU() {
        return new U() {
            @Override
            public void first() {
                System.out.println("first()");
            }

            @Override
            public void second() {
                System.out.println("second()");
            }

            @Override
            public String toString() {
                return "This is U";
            }
        };
    }
}

class B {
    private U[] arrayU;

    B(int i) {
        arrayU = new U[i];
    }

    void addU(U u, int i) {
        arrayU[i] = u;
    }

    void clearU(int i) {
        arrayU[i] = null;
    }

    void testArrayU() {
        for (U u : arrayU) {
            u.first();
            u.second();
            u.toString();
        }
    }

    void showArrayU() {
        for (U u : arrayU) {
            if (u != null) {
                System.out.println(u.toString());
            } else System.out.println("I'm null");
        }
    }
}

public class Exercise21 {

    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new A();
        A a2 = new A();
        B b = new B(3);
        b.addU(a0.makeU(), 0);
        b.addU(a1.makeU(), 1);
        b.addU(a2.makeU(), 2);
        b.showArrayU();
        b.testArrayU();
        b.clearU(0);
        b.clearU(1);
        b.showArrayU();
    }
}
