//Ch11Ex25 Создайте контейнер Map<String, ArrayList<Integer>>.
//Используя net.mindview.TextFile, откройте текстовый файл и прочитайте его по словам.
//Подсчитывайте слова в процессе чтения; для каждого слова в файле сохраните в ArrayList<Integer>
//счетчик слов, связанный с этим словом (то есть фактически позицию слова в файле)
package ru.kulichenkom.ekkel.chapter11;

import ru.kulichenkom.utils.TextFile;

import java.util.*;
import java.util.List;

public class ReadAndCountEx25 {
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
    }
}