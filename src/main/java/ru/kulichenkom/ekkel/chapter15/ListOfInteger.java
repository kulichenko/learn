//:generics/ListOfInteger.java - пример из книги
//Примитивы не могут исп-ся как параметры-типы. ПРоблема реш-ся исп-ем классов оберток.
//
package ru.kulichenkom.ekkel.chapter15;

import ru.kulichenkom.utils.Generator;
import ru.kulichenkom.utils.RandomGenerator;

import java.util.*;

public class ListOfInteger {
    public static void main(String[] args) {
        List<Integer> listI = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listI.add(i);
        }
        for (int i : listI) {
            System.out.print(i + " ");
        }
    }
}
//Ниже представлено др-е решение, в которой создется множество элементов Byte:

//::generics/ByteSet.java
class ByteSet {
    Byte[] possibles = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    Set<Byte> mySet = new HashSet<>(Arrays.asList(possibles));
    //но такая запись невозможна
//    Set<Byte> mySet2 = new HashSet<Byte>(Arrays.asList(1,2,3,4,5,6,7,8,9));
}

//Автоматическая упаковка решает некоторые проблемы, но не все.

//: generics/PrimitiveGenericTest.java
// Fill an array using a generator:
class FArray {
    public static <T> T[] fill(T[] a, Generator<T> gen) {
        for (int i = 0; i < a.length; i++) {
            a[i] = gen.next();
        }
        return a;
    }
}

class PrimitiveGenericTest {
    public static void main(String[] args) {
        String[] strings = FArray.fill(new String[7], new RandomGenerator.String(10));
        for (String s : strings) {
            System.out.println(s);
        }
        Integer[] integers = FArray.fill(new Integer[7], new RandomGenerator.Integer());
        for (int i : integers) {
            System.out.println(i);
        }
        // Autoboxing won't save you here. This won't compile:
//         int[] b = FArray.fill(new int[7], new RandIntGenerator());
        //Эккель: Так как RandomGenerator.Integer реализует Generator<Integer>,
        //я надеялся, что автоматическая упаковка преобразует значение next() из Integer
        //в int. Однако, автоматич упаковка не применяется к массивам, поэтому решение не работает.
    }
}