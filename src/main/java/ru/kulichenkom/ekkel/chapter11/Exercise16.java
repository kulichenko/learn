//Ch11Ex16 Создайте контейнер Set со всеми гласными буквами. Подсичтайте и выведите количество
//гласных букв в каждом входном слове, а так же выведите общее количесво гласных во входном файле.

package ru.kulichenkom.ekkel.chapter11;

import ru.kulichenkom.utils.TextFile;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise16 {
    public static String vowelCounter(Set<String> setString) {
        Set<Character> vowelLetters = new HashSet<>();
        Collections.addAll(vowelLetters, 'A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y');
        Set<String> numbers = new HashSet<>();
        Collections.addAll(numbers, "0 1 2 3 4 5 6 7 8 9".split(" "));
        setString.removeAll(numbers);
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
