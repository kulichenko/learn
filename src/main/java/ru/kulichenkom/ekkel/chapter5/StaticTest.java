//Ch5Ex14: Create a class with a static String field that is initialized at the point of definition,
// and another one that is initialized by the static block. Add a static method that prints both fields and
// demonstrates that they are both initialized before they are used.
package ru.kulichenkom.ekkel.chapter5;

public class StaticTest {
    static String firstName = "Tom";
    static String lastName;

    static {
        lastName = "Sawyer";
    }

    static void fullName() {
        System.out.println("Writer " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        StaticTest writer = new StaticTest();
        fullName();
    }
}
