//Ch11Ex12 Создайте контейнер List<Integer>. Создайте второй контейнер List<Integer> того же размера.
//Используйте итераторы ListIterator для чтения элементов из первого контейнера List
//и вставки их во второй контейнер в обратном порядке.
package ru.kulichenkom.ekkel.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Exercise12 {
    public static void main(String[] args) {
        List<Integer> firstContainer = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Integer> secondContainer = new ArrayList<>(Arrays.asList(5, 6, 7, 8, 9));
        ListIterator<Integer> iterator = firstContainer.listIterator(5);
        ListIterator<Integer> iterat = secondContainer.listIterator();
        System.out.println("firstContainer: " + firstContainer);
        System.out.println("secondContainer: " + secondContainer);
//        while (iterator.hasNext()){ //перемещение в конец List, в случае, когда итератор не установлен по индексу сразу в конец
//            iterator.next();
//        }
        while (iterat.hasNext()) {
            iterat.next();
            iterat.set(iterator.previous());
        }
        System.out.println("firstContainer: " + firstContainer);
        System.out.println("secondContainer: " + secondContainer);
    }
}
