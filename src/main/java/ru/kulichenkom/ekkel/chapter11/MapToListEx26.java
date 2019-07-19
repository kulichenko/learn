//Ch11Ex26 Возьмите контейнер Map из предыдущего упражнения и воссоздайте порядок слов в исходном файле.
package ru.kulichenkom.ekkel.chapter11;

import ru.kulichenkom.utils.TextFile;

import java.util.*;

public class MapToListEx26 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("src/main/java" +
                "/ru/kulichenkom/ekkel/chapter11/Text.txt", "\\W+"));
        Map<String, ArrayList<Integer>> countedWords = new LinkedHashMap<>();
        int count = 0;
        for (String word : words) {
            count++;
            if (countedWords.keySet().contains(word)) {
                countedWords.get(word).add(count);
                countedWords.put(word, countedWords.get(word));
            } else {
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(0, count);
                countedWords.put(word, tempList);
            }
        }
        System.out.println(countedWords);
        Map<Integer, String> sortByOriginalPosition = new TreeMap<>();
        Iterator<Map.Entry<String, ArrayList<Integer>>> iterator = countedWords.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, ArrayList<Integer>> mapEntry = iterator.next();
            for (int i = 0; i < mapEntry.getValue().size(); i++) {
                sortByOriginalPosition.put(mapEntry.getValue().get(i), mapEntry.getKey());
            }
        }
        System.out.println(sortByOriginalPosition.values());
    }
}
