//Ch11Ex18 Заполните контейнер HashMap парами "ключ-значение". Выведите результаты,
//чтобы продемонстрировать упорядочение по хеш коду. Извлеките пары, отсортируйте по ключу
//и поместите результат в LinkedHashMap. Покажите, что элементы хранятся в порядке вставки.
package ru.kulichenkom.ekkel.chapter11;

import java.util.*;

public class Exercise18 {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Moscow", "Russia");
        capitals.put("Washington", "USA");
        capitals.put("Paris", "France");
        capitals.put("Berlin", "Germany");
        capitals.put("Amsterdam", "Netherlands");
        System.out.println("HashMap: " + capitals);
        Iterator<String> iteratorCapitals = capitals.keySet().iterator();
        Iterator<String> iteratorCountries = capitals.values().iterator();
        Map<String, String> sortMap = new TreeMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        while (iteratorCapitals.hasNext()) {
            String capital = iteratorCapitals.next();
            String country = iteratorCountries.next();
            sortMap.put(capital, country);
        }
        Iterator<String> linkedCapitals = sortMap.keySet().iterator();
        Iterator<String> linkedCounties = sortMap.values().iterator();
        while (linkedCapitals.hasNext()) {
            String capit = linkedCapitals.next();
            String countr = linkedCounties.next();
            linkedHashMap.put(capit, countr);
        }
        System.out.println("Sorting by keys. Used TreeMap: " + sortMap);
        System.out.println("Put TreeMap into LinkedHashMap: " + linkedHashMap);
    }
}
