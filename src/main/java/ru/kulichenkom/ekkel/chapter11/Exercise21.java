//Ch11Ex21 используя контейнер Map <String, Integer> создайте по образцу UniqueWords.java
//программу для подсчета вхождения слов в файле. Отсортируйте результаты методом Collections.sort()
//со вторым аргументом String.CASE_INSENSITIVE_ORDER (для получения алфавитной сортировки) и выведите
//результат.
////: holding/UniqueWords.java
//import java.util.*;
//import net.mindview.util.*;
//
//public class UniqueWords {
//  public static void main(String[] args) {
//    Set<String> words = new TreeSet<String>(
//      new TextFile("SetOperations.java", "\\W+"));
//    System.out.println(words);
//  }
//}

package ru.kulichenkom.ekkel.chapter11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Exercise21 {
    public static String wordsCounter(List<String> allWordsFromFile, Set<String> uniqueWordsFromFile) {
        Set<String> numbers = new HashSet<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        allWordsFromFile.removeAll(numbers);
        Collections.sort(allWordsFromFile, String.CASE_INSENSITIVE_ORDER);
        uniqueWordsFromFile.removeAll(numbers);
        Map<String, Integer> wordCounter = new TreeMap<>();
        for (String word : uniqueWordsFromFile) {
            int countWordInputs = 0;
            for (String words : allWordsFromFile) {
                if (words.equals(word)) {
                    countWordInputs++;
                }
            }
            wordCounter.put(word, countWordInputs);
        }
        return "" + wordCounter;
    }

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/TextForExercises.txt");
        String text = String.valueOf(Files.readAllLines(path));
        List<String> words = new ArrayList<>(Arrays.asList(text.split("\\W+")));
        Set<String> wordsSet = new TreeSet<>();
        for (String s : words) {
            wordsSet.add(s);
        }
        System.out.print(wordsCounter(words, wordsSet));
    }
}
