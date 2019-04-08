//Ch3Ex11 Start with a number that has a binary one in the most significant
// position (hint: Use a hexadecimal constant). Using the signed right-shift operator,
// right shift it all the way through all of its binary positions, each time displaying
// the result using Integer.toBinaryString( ).
package ru.kulichenkom.chapter3;

public class ShiftOperators {
    public static void main(String[] args) {
        //int i = 1 + 4 + 16 + 64 + 256 + 1024 + 4096 + 16384;
        int j = 2 + 8 + 32 + 128 + 512 + 2048 + 8192 + 32768;
        //System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("j >> 1 = " + Integer.toBinaryString(j >> 1));
        System.out.println("j >> 2 = " + Integer.toBinaryString(j >> 2));
        System.out.println("j >> 3 = " + Integer.toBinaryString(j >> 3));
        System.out.println("j >> 4 = " + Integer.toBinaryString(j >> 4));
        System.out.println("j >> 5 = " + Integer.toBinaryString(j >> 5));
        System.out.println("j >> 6 = " + Integer.toBinaryString(j >> 6));
        System.out.println("j >> 7 = " + Integer.toBinaryString(j >> 7));
        System.out.println("j >> 8 = " + Integer.toBinaryString(j >> 8));
        System.out.println("j >> 10 = " + Integer.toBinaryString(j >> 10));
        System.out.println("j >> 12 = " + Integer.toBinaryString(j >> 12));
        System.out.println("j >> 14 = " + Integer.toBinaryString(j >> 14));
        System.out.println("j >> 16 = " + Integer.toBinaryString(j >> 16));
    }
}
