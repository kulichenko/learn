//Ch15Ex29 Создайте обобщенный метод, который получает аргумент Holder<List<?>>.
//Определите какие методы могут или не могут вызываться для Holder и для List.
//Повоторите для аргумента List<Holder<?>>
package ru.kulichenkom.ekkel.chapter15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise29 {
    public static void method1(Holder<List<?>> listHolder) {
        System.out.println("Вызов методов для Holder");
        System.out.println(listHolder.get());
        listHolder.set(Arrays.asList(1, 2, 3));
        System.out.println(listHolder.get());
        int[] i = {1, 2, 3};
        System.out.println("listHolder.equals(i): " + listHolder.equals(i));
        List iList = Arrays.asList(i);
        System.out.println("listHolder.equals(iList): " + listHolder.equals(iList));
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println("listHolder.equals(integerList): " + listHolder.equals(integerList));
        System.out.println("Вызов методов для List");
//        List<? extends Integer> list = listHolder.get(); // Incompatible types
        List<?> list = listHolder.get();
        System.out.println("list: " + list);
        //....................................................................
    }

    public static void main(String[] args) {
        method1(new Holder<List<?>>());
    }
}