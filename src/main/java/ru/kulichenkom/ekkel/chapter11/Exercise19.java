//Ch11Ex19 Повторите предыдущее упражнение с HashSet и LinkedHashSet.
//Ch11Ex18 Заполните контейнер HashMap парами "ключ-значение". Выведите результаты,
//чтобы продемонстрировать упорядочение по хеш коду. Извлеките пары, отсортируйте по ключу
//и поместите результат в LinkedHashMap. Покажите, что элементы хранятся в порядке вставки.
package ru.kulichenkom.ekkel.chapter11;

import java.util.*;

public class Exercise19 {
    public static void main(String[] args) {
        Set<String> capitals = new HashSet<>();
        Collections.addAll(capitals, "Moscow", "Washington", "Paris", "Berlin", "Amsterdam");
        System.out.println("HashSet: " + capitals);
        Iterator<String> iteratorCapitals = capitals.iterator();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        while (iteratorCapitals.hasNext()) {
            String capital = iteratorCapitals.next();
            treeSet.add(capital);
        }
        Iterator<String> linkedCapitals = treeSet.iterator();
        while (linkedCapitals.hasNext()) {
            String capit = linkedCapitals.next();
            linkedHashSet.add(capit);
        }
        System.out.println("Sorting by keys. Used TreeSet: " + treeSet);
        System.out.println("Put TreeSet into LinkedHashSet: " + linkedHashSet);
    }
}
