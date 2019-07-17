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

import ru.kulichenkom.utils.TextFile;

import java.util.*;

public class Exercise21 {
    public static String wordsCounter(List<String> allWordsFromFile, Set<String> uniqueWordsFromFile) {
        Set<String> numbers = new HashSet<>();
        Collections.addAll(numbers, "0 1 2 3 4 5 6 7 8 9".split(" "));
        allWordsFromFile.removeAll(numbers);
        uniqueWordsFromFile.removeAll(numbers);
        Map<String, Integer> wordCounter = new TreeMap<>();
        Iterator<String> iterator = uniqueWordsFromFile.iterator();
        while (iterator.hasNext()) {
            int countWordInputs = 0;
            String word = iterator.next();
            Iterator<String> wordsIterator = allWordsFromFile.iterator();
            while (wordsIterator.hasNext()) {
                String words = wordsIterator.next();
                if (words.equals(word)) {
                    countWordInputs++;
                }
            }
            wordCounter.put(word, countWordInputs);
        }
        return "" + wordCounter;
    }

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(new TextFile("src/main/java" +
                "/ru/kulichenkom/ekkel/chapter11/SimpleCollection.java", "\\W+"));
        Set<String> wordsSet = new TreeSet<>(new TextFile("src/main/java" +
                "/ru/kulichenkom/ekkel/chapter11/SimpleCollection.java", "\\W+"));
        System.out.println(wordsCounter(words, wordsSet));
    }
}
