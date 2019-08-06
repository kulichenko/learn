//Ch11Ex25 Создайте контейнер Map<String, ArrayList<Integer>>.
//Используя net.mindview.TextFile, откройте текстовый файл и прочитайте его по словам.
//Подсчитывайте слова в процессе чтения; для каждого слова в файле сохраните в ArrayList<Integer>
//счетчик слов, связанный с этим словом (то есть фактически позицию слова в файле)
package ru.kulichenkom.ekkel.chapter11;

import ru.kulichenkom.utils.TextFile;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReadAndCountEx25 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>(new TextFile("src/main/resources/TextForExercises.txt", "\\W+"));
        Map<String, List<Integer>> countedWords = new LinkedHashMap<>(); // Map в который сохраняется слово как ключ и ArrayList (как значение), в который записывается порядковый номер, где было найдено слово.
        int count = 0;
        for (String word : words) {
            count++;
            if (countedWords.keySet().contains(word)) { //Если в Map уже есть такой ключ (слово), запускаем if
                countedWords.get(word).add(count); //Изменяет ArrayList (который является значением), добавляя к нему очередной count (порядковый номер, где встретилось слово)
                countedWords.put(word, countedWords.get(word)); //Изменяет Map, добавляя туда слово (key) и ArrayList (value)
            } else {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(count);
                countedWords.put(word, tempList);
            }
        }
        System.out.println(countedWords);
    }
}