//Ch11Ex26 Возьмите контейнер Map из предыдущего упражнения и воссоздайте порядок слов в исходном файле.
package ru.kulichenkom.ekkel.chapter11;

import ru.kulichenkom.utils.TextFile;

import java.util.*;

public class MapToListEx26 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("src/main/resources/TextForExercises.txt", "\\W+"));
        Map<String, List<Integer>> countedWords = new LinkedHashMap<>();
        int count = 0;
        for (String word : words) {
            count++;
            if (countedWords.keySet().contains(word)) {
                countedWords.get(word).add(count);//Изменяет ArrayList (который является значением), добавляя к нему очередной count (порядковый номер, где встретилось слово)
                countedWords.put(word, countedWords.get(word));//Изменяет Map, добавляя туда слово (key) и ArrayList (value)
            } else {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(count);
                countedWords.put(word, tempList);
            }
        }
        System.out.println(countedWords);
        Map<Integer, String> sortByOriginalPosition = new TreeMap<>();
        for (Map.Entry<String, List<Integer>> entry : countedWords.entrySet()) {
            for (int i = 0; i < entry.getValue().size(); i++) {
                sortByOriginalPosition.put(entry.getValue().get(i), entry.getKey());
            }
        }
        System.out.println(sortByOriginalPosition.values());
    }
}
