//Ch5Ex3 Create a class with a default constructor
//(one that takes no arguments) that prints a message. Create an object of this class.
package ru.kulichenkom.ekkel.chapter5;

public class DefoltConstructor {
    String message;

    public DefoltConstructor() {
    }

    public String getMessage() {
        return message;
    }

    public static void main(String[] args) {
        DefoltConstructor sayIt = new DefoltConstructor();
        sayIt.message = "Это конструктор по умолчанию";
        System.out.println(sayIt.message);
    }
}
