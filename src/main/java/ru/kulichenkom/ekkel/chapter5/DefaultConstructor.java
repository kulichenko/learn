//Ch5Ex3 Create a class with a default constructor
//(one that takes no arguments) that prints a message. Create an object of this class.
package ru.kulichenkom.ekkel.chapter5;

public class DefaultConstructor {
    String message;

    private DefaultConstructor() {
    }

    public static void main(String[] args) {
        DefaultConstructor sayIt = new DefaultConstructor();
        sayIt.setMessage("Это конструктор по умолчанию");
        System.out.println(sayIt.getMessage());
    }

    private String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}
