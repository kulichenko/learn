//Ch11Ex11 Напишите метод, который использует Iterator для перебора Collection
// и выводит результат вызова toString() для каждого объекта в контейнере.
//Заполните объектами разные типы Collection и примените свой метод к каждому контейнеру.

package ru.kulichenkom.ekkel.chapter11;

import java.util.*;

public class Exercise11 {

    public static void display(Collection collection) {
        Iterator iter = collection.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> arrayInt = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4));
        List<Float> linkFloat = new LinkedList<>(Arrays.asList(0.02f, 1.12f, 2.153f, 3.84f, 4.199f));
        Set<String> hashSetString = new HashSet<>(Arrays.asList("first string", "second string", "third string"));
        display(arrayInt);
        display(linkFloat);
        display(hashSetString);
    }
}
