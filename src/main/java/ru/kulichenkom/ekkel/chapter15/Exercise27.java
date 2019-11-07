//Ch15Ex27 Покажите, что ковариантность не работает с List на примере Number и Integer. Затем добавьте маски.
//Exercise 27: (2) Show that covariance doesn’t work with Lists, using Numbers and Integers, then introduce wildcards.
package ru.kulichenkom.ekkel.chapter15;

import java.util.ArrayList;
import java.util.List;

public class Exercise27 {
    public static void main(String[] args) {
        // Compile Error: incompatible types:
//        List<Number> numberList = new ArrayList<Integer>();
        // Wildcards allow covariance:
        List<? extends Number> numbers = new ArrayList<Integer>();
        // Compile Error: can’t add any type of object:
//        numbers.add(5);
//        numbers.add(1.250);
//        numbers.add(2.52414f);
        numbers.add(null);
        Number number = numbers.get(0);
        System.out.println(numbers);
    }
}