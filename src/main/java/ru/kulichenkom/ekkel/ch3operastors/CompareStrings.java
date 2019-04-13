//Ch3Ex14 Напишите метод, который получает 2 аргумента String,
//выполняет с ними все операции логических сравнений и выводит результаты.
// Для операций == и != так же выполните проверку методом equals(). Вызовите
// свой метод из main() для нескольких разных объектов String
package ru.kulichenkom.ekkel.ch3operastors;

public class CompareStrings {
    static void stringTest(String s1, String s2) {
        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s1));
    }

    public static void main(String[] args) {
        String s1 = "Hello!";
        String s2 = "Good buy!";
        stringTest(s1, s2);
    }
}
