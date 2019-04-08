//Ch3Ex10 Поразрядные операторы. С 16-тиричными числами не разобрался, решение задачи нашел в инете,
// Поразрядный оператор И (&) заносит 1 в выходной бит, в случае, если оба входных бита были равны 1,
//в противном случае результат = 0, поэтому в первом примере (i & j) = 0. Оператор ИЛИ (|) заносит 1 в выходной бит
//если хотя бы один из битов операндов = 1, если оба бита 0, тогда выходной бит = 0.
// Второй пример i | j = 11111111, поскольку в каждой паре входных битов была 1.
// Оператор ИСКЛЮЧАЮЩЕЕ ИЛИ (XOR, ^) имеет результатом 1, когда один или другой из входных битов = 1,
// но не оба вместе, поэтому i ^ j = 11111111, так как каждая пара входных битов имела только 1 единицу.
//Оператор НЕ (~) производит бит противоположный исходному. В примере все 0, которые не отображались заполнились 1,
// единицы стали нулями  ~i = 11111111111111111111111110101010  ~j = 11111111111111111111111101010101
// Write a program with two constant values, one with alternating binary ones and
//zeroes, with a zero in the least-significant digit, and the second, also
//alternating, with a one in the least-significant digit (hint: It's easiest to
//use hexadecimal constants for this). Take these two values and combine them in
//all possible ways using the bitwise operators, and display the results using
//Integer.toBinaryString().
//

package ru.kulichenkom.chapter3;

public class BitwiseOperators {
    public static void main(String[] args) {
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("i & j = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));
    }
}
