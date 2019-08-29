//Ch12Ex4 Создайте свой собственный класс исключения. Напишите конструктор, получающий строковый аргумент,
//и сохраните этот аргумент внутри объекта по ссылке на String. Напишите метод, который выводит эту строку.
//Подсоедините новый блок try-catch, чтобы проверить нов искл-е.
package ru.kulichenkom.ekkel.chapter12;

public class MyException extends Exception {
    private String description;

    public MyException(String description) {
        super(description);
        this.description = description;
    }

    void show() {
        System.out.println("Исключение MyException: " + description);
    }
}

class Checker {
    static void getNewException() throws MyException {
        System.out.println("getNewException()");
        throw new MyException(" Возбуждение исключения из getNewException() ");
    }

    public static void main(String[] args) {
        try {
            getNewException();
        } catch (MyException e) {
            e.printStackTrace();
            e.show();
        }
    }
}