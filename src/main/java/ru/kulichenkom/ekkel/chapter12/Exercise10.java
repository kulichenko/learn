//Ch12Ex10Создайте класс с двумя методами f() и g(). В методе g() возбудите исключение того типа, которое вы определили
//ранее. В методе f() вызовите g(), перехватите исключение и в предложении catch возбудите новое исключение (второй тип
//который вам необходимо определить). Проверьте этот код в методе main().
package ru.kulichenkom.ekkel.chapter12;

public class Exercise10 {
    public static void f() {
        try {
            try {
                g();
            } catch (MyFirstException e) {
                System.out.println("Пойманное MyFirstException во внутреннем try метода f()");
                e.printStackTrace(System.out);
                throw new MySecondException("Возбуждаем исключение в f(), внутренний try");
            }
        } catch (MySecondException e) {
            System.out.println("Пойманное MySecondException во внешнем try метода f()");
            e.printStackTrace(System.out);
        }

    }

    public static void g() throws MyFirstException {
        throw new MyFirstException("Возбуждаем исключение в g()");
    }

    public static void main(String[] args) {
        f();
    }
}