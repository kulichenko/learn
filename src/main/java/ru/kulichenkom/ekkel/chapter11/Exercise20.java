//Ch11Ex20 Измените упр 16 так, чтобы в контейнере хранилось количество вхождений каждой гласной.
//Ch11Ex16 Создайте контейнер Set со всеми гласными буквами. Подсичтайте и выведите количество
//гласных букв в каждом входном слове, а так же выведите общее количесво гласных во входном файле.

package ru.kulichenkom.ekkel.chapter11;

import ru.kulichenkom.utils.TextFile;

import java.util.*;

public class Exercise20 {
    public static String vowelCounter(Set<String> setString) {
        Set<Character> vowelLetters = new HashSet<>();
        Collections.addAll(vowelLetters, 'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y');
        Set<String> numbers = new HashSet<>();
        Collections.addAll(numbers, "0 1 2 3 4 5 6 7 8 9".split(" "));
        setString.removeAll(numbers);
        Map<Character, Integer> eachVowelCounter = new TreeMap<>();
        Iterator<Character> iterator = vowelLetters.iterator();
        while (iterator.hasNext()) {
            int countVowels = 0;
            Character ch = iterator.next();
            Iterator<String> wordsIterator = setString.iterator();
            while (wordsIterator.hasNext()) {
                String words = wordsIterator.next();
                for (Character cha : words.toCharArray()) {
                    if (ch.equals(cha)) {
                        countVowels++;
                    }
                }
            }
            eachVowelCounter.put(ch, countVowels);
        }
        System.out.println(eachVowelCounter);
        int totalVowels = 0;
        for (String s : setString) {
            int count = 0;
            for (Character v : s.toCharArray()) {
                if (vowelLetters.contains(v)) {
                    count++;
                    totalVowels++;
                }
            }
            System.out.print(s + ": " + count + ", ");
        }
        System.out.println();
        return "Total vowels: " + totalVowels;
    }

    public static void main(String[] args) {

        Set<String> words = new TreeSet<>(new TextFile("src/main/java" +
                "/ru/kulichenkom/ekkel/chapter11/Gerbil.java", "\\W+"));
        System.out.println(words);
        System.out.println(vowelCounter(words));
    }
}
