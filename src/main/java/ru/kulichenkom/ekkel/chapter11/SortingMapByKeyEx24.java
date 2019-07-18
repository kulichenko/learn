//Ch11Ex24 Заполните карту LinkedHashMap строковыми ключами и такими же значениями.
//взятыми по вашему усмотрению. После этого извлеките пары, отсортируйте их по ключам
// и заново вставьте в карту.
package ru.kulichenkom.ekkel.chapter11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SortingMapByKeyEx24<T> {
    public static void main(String[] args) {
        Map<String, String> animals = new LinkedHashMap<>();
        animals.put("Hamster", "Pit");
        animals.put("Dog", "May");
        animals.put("Cat", "Mew");
        animals.put("Gerbil", "Tony");
        animals.put("Duck", "Donald");
        animals.put("Mouse", "Chip");
        SortingMapByKeyEx24 map = new SortingMapByKeyEx24();
        map.sortMapByKey(animals);
    }

    public void sortMapByKey(Map<T, T> sortedMap) {
        System.out.println("The Map<k, v> before sorting: " + sortedMap);
        Set<T> tempSet = new TreeSet<>(sortedMap.keySet());
        Map<T, T> mapsAfterSort = new LinkedHashMap<>();
        for (T tempKey : tempSet) {
            T newValue = sortedMap.get(tempKey);
            mapsAfterSort.put(tempKey, newValue);
        }
        tempSet.clear();
        System.out.println("The Map<k, v> after sorting: " + mapsAfterSort);
    }
}