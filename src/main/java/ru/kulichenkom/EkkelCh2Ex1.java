//Создайте класс с полями int и char, которые не инициализируются в программе.
//Выведи их значения, чтобы убедиться, что java выполняет инициализацию по умолчанию.
package ru.kulichenkom;

public class EkkelCh2Ex1 {
    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    private int i;
    private char ch;

    public static void main(String[] arg) {
        EkkelCh2Ex1 testObject = new EkkelCh2Ex1();
        System.out.println("integer is :" + testObject.getI());
        System.out.println("Char is: " + testObject.getCh());
    }
}
