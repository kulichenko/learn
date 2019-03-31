//Создайте класс с полями int и char, которые не инициализируются в программе.
//Выведи их значения, чтобы убедиться, что java выполняет инициализацию по умолчанию.
package ru.kulichenkom;

public class EkkelCh2Ex1 {
    private int i;
    private char ch;

    public static void main(String[] arg) {
        EkkelCh2Ex1 testObject = new EkkelCh2Ex1();
        System.out.println("integer is :" + testObject.i);
        System.out.println("Char is: " + testObject.ch);
    }
}
