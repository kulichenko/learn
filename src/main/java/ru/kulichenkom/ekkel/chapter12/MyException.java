package ru.kulichenkom.ekkel.chapter12;

public class MyException extends Exception {
    private String description;

    public MyException(String description) {
        super(description);
        System.out.println(" MyException()");
        this.description = description;
    }

    void show() {
        System.out.println("Description from MyException: " + description);
    }
}
