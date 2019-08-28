//Ch13Ex6 Создайте класс с полями int, long, float, double. Создайте для этого класса метод toString,
//использующий String.format() и продемонстрируйте, что ваш класс работает правильно
package ru.kulichenkom.ekkel.chapter13;

public class Exercise6 {
    private int i;
    private long l;
    private float f;
    private double d;

    public Exercise6(int i, long l, float f, double d) {
        this.i = i;
        this.l = l;
        this.f = f;
        this.d = d;
    }

    @Override
    public String toString() {
        return String.format("int: %d \nlong: %d \nfloat: %.01f \ndouble: %.02f", i, l, f, d);
    }

    public static void main(String[] args) {
        Exercise6 example = new Exercise6(12, 15000000L, 165.154151f, 54.1564651);
        System.out.println(example);
    }
}