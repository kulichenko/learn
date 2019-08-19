//Ch12Ex6 Создайте два класса исключения, каждый из которых автоматически выводит информацию о себе.
//Продемон-те, что эти классы работают.
package ru.kulichenkom.ekkel.chapter12;

class MyException3 extends Exception {
    public MyException3(String message) {
        super(message);
    }

    public String getMessage() {
        return "Подробное сообщение: " + super.getMessage();
    }
}

class MyException4 extends Exception {
    public MyException4(String message) {
        super(message);
    }

    public String getMessage() {
        return "Подробное сообщение: " + super.getMessage();
    }
}

public class Exercise6 {
    public static void main(String[] args) {
        try {
            throw new MyException3("Выброшено исключение 1");
        } catch (MyException3 e) {
            e.printStackTrace(System.out);
        }
        try {
            throw new MyException4("Выброшено исключение 2");
        } catch (MyException4 e) {
            e.printStackTrace(System.out);
        }
    }
}