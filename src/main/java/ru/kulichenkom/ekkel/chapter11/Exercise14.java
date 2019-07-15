//Ch11Ex14 Создайте пустой контейнер LinkedList<Integer>. Используя итератор ListIterator,
//добавьте в List значения Integer. Все операции вставки должны осуществляться в
//середине списка
package ru.kulichenkom.ekkel.chapter11;

import java.util.LinkedList;
import java.util.ListIterator;

public class Exercise14 {
    private static ListIterator<Integer> getIterator(LinkedList<Integer> integers) {
        return integers.listIterator(integers.size() / 2);
    }

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        getIterator(integers).add(1);
        getIterator(integers).add(2);
        getIterator(integers).add(3);
        getIterator(integers).add(4);
        getIterator(integers).add(5);
        System.out.println(integers);
    }
}
