//Ch13Ex10 Определите, будет ли найдено в строке "Java now has regular expressions"
//совпадение для следующих выражений:
//^Java
// \Breg.*
// n.w\s+h(a|i)s
// s?
// s*
// s+
// s{4}
// s{1}.
// s{0,3}
package ru.kulichenkom.ekkel.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise10 {

    public static void checkerForMatching(String text, String[] regularEx) {
        for (int i = 0; i < regularEx.length; i++) {
            Pattern pattern = Pattern.compile(regularEx[i]);
            System.out.println("Regular expression: \"" + regularEx[i] + "\"");
            Matcher matcher = pattern.matcher(text);
            if (!matcher.find())
                System.out.println("No match found for " + "\"" + regularEx[i] + "\"");
            matcher.reset();
            while (matcher.find()) {
                System.out.println("Match \"" + matcher.group() + "\" at positions " +
                        matcher.start() + "-" + (matcher.end() - 1));
            }
        }
    }

    public static void main(String[] args) {
        String text = "Java now has regular expressions";
        String[] regularEx = new String[]{"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}.", "s{0,3}"};
        checkerForMatching(text, regularEx);
    }
}