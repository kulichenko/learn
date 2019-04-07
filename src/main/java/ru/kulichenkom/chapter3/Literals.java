//Покажите, что 16-тиричная и 8-иричная записис могут использоваться с типом Long.
// Для вывода результата используйте метод Long.toBinaryString().
package ru.kulichenkom.chapter3;

public class Literals {
    public static void main(String[] args) {
        long n1 = 2000L;
        System.out.println(Long.toBinaryString(n1));
    }
}
