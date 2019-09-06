//Ch13Ex8 Разбейте строку Splitting.knights по словам the или you.
//Ch13Ex9 Замените все глассные в Splitting.knights подчеркиваниями.
package ru.kulichenkom.ekkel.chapter13;

import java.util.*;

public class Splitting {
    private static final String VOWELS = "[AaEeIiOoUuYy]";
    public static String knights =
            "Then when you have found the shrubbery you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }

    public static void replace(String regex, String replacer) {
        System.out.println(Arrays.toString(new String[]{knights.replaceAll(regex, replacer)}));
    }

    public static void main(String[] args) {
        System.out.println(knights);
//        split(" "); // Doesn't have to contain regex chars
//        split("\\W+"); // Non-word characters
//        split("n\\W+"); // 'n' followed by non-word characters
        split("the\\W+|you\\W+");
        replace(VOWELS, "_");
    }
}