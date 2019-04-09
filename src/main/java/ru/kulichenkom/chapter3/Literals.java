//Покажите, что 16-тиричная и 8-иричная записис могут использоваться с типом Long.
// Для вывода результата используйте метод Long.toBinaryString().
package ru.kulichenkom.chapter3;

public class Literals {
    public static void main(String[] args) {
        long n1 = 020001;
        long n2 = 0x212f;
        System.out.println(Long.toBinaryString(n1));
        System.out.println(Long.toBinaryString(n2));
    }
}
