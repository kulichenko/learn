//Ch3Ex12 (3) Start with a number that is all binary ones.
// Left shift it, then use the unsigned right-shift operator to
// right shift through all of itits binary positions, each time displaying
// the result using Integer.toBinaryString( ).
package ru.kulichenkom.chapter3;

public class ShiftOperators2 {
    public static void main(String[] args) {
        int h = -1;
        System.out.println(Integer.toBinaryString(h));
        h <<= 12;
        System.out.println(Integer.toBinaryString(h));
        for (int i = 0; i < 32; i++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }
    }
}