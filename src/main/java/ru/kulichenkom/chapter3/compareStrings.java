//Ch3Ex14 Напишите метод, который получает 2 аргумента String,
//выполняет с ними все операции логических сравнений и выводит результаты.
// Для операций == и != так же выполните проверку методом equals(). Вызовите
// свой метод из main() для нескольких разных объектов String
package ru.kulichenkom.chapter3;

public class compareStrings {
    static void f(boolean b) {
    }

    static void stringTest(String s1, String s2) {
        f(s1 == s2);
        f(s1 != s2);
        f(s1.equals(s2));
        f(s2.equals(s1));
    }

    public static void main(String[] args) {
        String s1 = "Hello!";
        String s2 = "Good buy!";
        stringTest(s1, s2);
    }
}