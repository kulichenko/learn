//Ch13Ex8 Разбейте строку Splitting.knights по словам the или you.
package ru.kulichenkom.ekkel.chapter13;

import java.util.*;

public class Splitting {
    public static String knights =
            "Then when you have found the shrubbery you must " +
                    "cut down the mightiest tree in the forest... " +
                    "with... a herring!";

    public static void split(String regex) {
        System.out.println(
                Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
//        split(" "); // Doesn't have to contain regex chars
//        split("\\W+"); // Non-word characters
//        split("n\\W+"); // 'n' followed by non-word characters
        split("the\\W+|you\\W+");
    }
}