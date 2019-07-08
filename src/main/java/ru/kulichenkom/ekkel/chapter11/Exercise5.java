//Ch11Ex5 Измените пример ListFeatures.java
// так, чтобы использовался Integers (remember autoboxing!) вместо Pets, объясните
// различия в результатах.
package ru.kulichenkom.ekkel.chapter11;

import java.util.*;

public class Exercise5 {
    public static List<Integer> randomIntegersToList(int last) {
        Random rand = new Random();
        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < last; i++) {
            intList.add(rand.nextInt(100));
        }
        return intList;
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        List<Integer> integerList = randomIntegersToList(10);
        System.out.println("1: " + integerList);
        Integer h = 5;
        integerList.add(h); // Automatically resizes
        System.out.println("2: " + integerList);
        System.out.println("3: " + integerList.contains(h));
        integerList.remove(h); // Remove by object
        Integer p = integerList.get(2);
        System.out.println("4: " + p + " " + integerList.indexOf(p));
        Integer cymric = 2;
        System.out.println("5: " + integerList.indexOf(cymric));
        System.out.println("6: " + integerList.remove(cymric));
// Must be the exact object:
        System.out.println("7: " + integerList.remove(p));
        System.out.println("8: " + integerList);
        integerList.add(3, 10); // Insert at an index
        System.out.println("9: " + integerList);
        List<Integer> sub = integerList.subList(1, 4);
        System.out.println("Частичный список: " + sub);
        System.out.println("10: " + integerList.containsAll(sub));
        Collections.sort(sub); // Сортировка на месте
        System.out.println("После сортировки частичного списка: " + sub);
// Order is not important in containsAll():
        System.out.println("11: " + integerList.containsAll(sub));
        Collections.shuffle(sub, rand); // Перемешивание
        System.out.println("После перемешивания: " + sub);
        System.out.println("12: " + integerList.containsAll(sub));
        List<Integer> copy = new ArrayList<>(integerList);
        sub = Arrays.asList(integerList.get(1), integerList.get(4));
        System.out.println("sub: " + sub);
        copy.retainAll(sub);
        System.out.println("13: " + copy);
        copy = new ArrayList<Integer>(integerList); // Get a fresh copy
        copy.remove(2); // Remove by index
        System.out.println("14: " + copy);
        copy.removeAll(sub); // Only removes exact objects
        System.out.println("15: " + copy);
        copy.set(1, 98); // Replace an element
        System.out.println("16: " + copy);
        copy.addAll(2, sub); // Insert a list in the middle
        System.out.println("17: " + copy);
        System.out.println("18: " + integerList.isEmpty());
        integerList.clear(); // Remove all elements
        System.out.println("19: " + integerList);
        System.out.println("20: " + integerList.isEmpty());
        integerList.addAll(randomIntegersToList(4));
        System.out.println("21: " + integerList);
        Object[] o = integerList.toArray();
        System.out.println("22: " + o[3]);
        Integer[] pa = integerList.toArray(new Integer[0]);
        System.out.println("23: " + pa[2]);
    }
}
