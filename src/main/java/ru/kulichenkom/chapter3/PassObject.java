//Ch3Ex2 Создайте класс с полем float. Используйте его для демонстрации совмещения имен при вызове метода
package ru.kulichenkom.chapter3;

public class PassObject {
    float field;

    static void method(PassObject secondLink) {
        secondLink.field = 2.356f;
        secondLink.field = secondLink.field + 125.0f;
    }

    public static void main(String[] args) {
        PassObject firstLink = new PassObject();
        firstLink.field = 0.231f;
        System.out.println(firstLink.field);
        method(firstLink);
        System.out.println(firstLink.field);
    }
}
