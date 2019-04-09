//Ch3Ex13 Напишите мемтод для вывода char в двоичном представлении. Продемонстрируйте его работу на нескольких
//разных символах
package ru.kulichenkom.ekkel.ch3operastors;

public class BinnaryChar {
    public static void main(String[] args) {
        char a = 'a';
        char b = 'b';
        char c = 'c';
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
    }
}
