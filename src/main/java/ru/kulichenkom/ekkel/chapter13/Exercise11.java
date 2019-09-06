//Ch13Ex11 Примените регулярное выражение
// (?i)((^[aeiou])|(\s+[aeiou]))\w+?[aeiou]\b к строке
// "Arline ate eight apples and one orange while Anita hadn’t any"
package ru.kulichenkom.ekkel.chapter13;

public class Exercise11 {
    public static void main(String[] args) {
        String text = "Arline ate eight apples and one orange while Anita hadn’t any";
        String[] regularEx = {"(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b"};
        Exercise10.checkerForMatching(text, regularEx);
    }
}
