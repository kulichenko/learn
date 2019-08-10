//Ch12Ex8 Напишите класс с методом, которое возбуждает исключение, созданное вами.
//Протестируйте свой класс и его исключение внутри блока try-catch.
package ru.kulichenkom.ekkel.chapter12;

public class Exception1 {
    public static void method1() throws MyException {
        System.out.println("возбуждаем MyException в методе method1");
        throw new MyException("Создано в method1");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (MyException e) {
            System.err.println("Исключение MyException ");
            e.printStackTrace();
            e.show();
        }
    }
}
