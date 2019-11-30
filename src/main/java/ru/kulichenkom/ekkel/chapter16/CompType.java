package ru.kulichenkom.ekkel.chapter16;

import ru.kulichenkom.utils.Generated;
import ru.kulichenkom.utils.Generator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CompType implements Comparable<CompType> {
    private static int count = 1;
    private static Random r = new Random(47);
    int i;
    int j;

    public CompType(int n1, int n2) {
        i = n1;
        j = n2;
    }

    public static Generator<CompType> generator() {
        return new Generator<CompType>() {
            public CompType next() {
                return new CompType(r.nextInt(100), r.nextInt(100));
            }
        };
    }

    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], generator());
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
    }

    @Override
    public String toString() {
        String result = "[i = " + i + ", j = " + j + "]";
        if (count++ % 3 == 0) {
            result += "\n";
        }
        return result;
    }

    @Override
    public int compareTo(CompType rv) {
        //Тернарный оператор или условный оператор (?:)
        //переменная x = (выражение) ? значение if true : значение if false
        return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
    }
}

//: arrays/Reverse.java
// The Collections.reverseOrder() Comparator


class Reverse {
    public static void main(String[] args) {
        CompType[] a = Generated.array(new CompType[12], CompType.generator());
        System.out.println("before sorting:");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("after sorting:");
        System.out.println(Arrays.toString(a));
    }
}