//Ch11Ex22 Измените предыдущее упражнение так, чтобы для хранения слов в нем использовался класс
//с объектом String и полем счетчика. Для хранения списка слов должен использоваться контейнер Set
//содержащий такие объекты.
package ru.kulichenkom.ekkel.chapter11;

import ru.kulichenkom.utils.TextFile;

import java.util.*;

class Word {
    private String word;
    private int count;

    Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String toString() {
        return word + ": " + count;
    }
}

public class Exercise22 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(new TextFile("src/main/resources/TextForExercises.txt", "\\W+"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Words to count, sorted: " + words);
        Set<Word> wordObjects = new HashSet<>();
        Set<String> wordSet = new TreeSet<>(new TextFile("src/main/resources/TextForExercises.txt", "\\W+"));
        for (String word : wordSet) {
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                if (word.equals(words.get(i))) {
                    count++;
                }
            }
            Word w = new Word(word, count);
            wordObjects.add(w);
        }
        System.out.println("Word count: " + wordObjects);
    }
}
