//Ch11Ex2 Измените пример SimpleCollection.java так,
// чтобы в качестве контейнера использовалось множество (Set).

package ru.kulichenkom.ekkel.chapter11;

import java.util.*;

public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> collection = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            collection.add(i);
        }
        for (Integer i : collection) {
            System.out.print(i + ", ");
        }
    }
}
