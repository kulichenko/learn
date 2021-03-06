//Пример из книги:
//: strings/TestRegularExpression.java
// Allows you to easily try out regular expressions.
// {Args: abcabcabcdefabc "abc+" "(abc)+" "(abc){2,}" }

package ru.kulichenkom.ekkel.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage:\njava TestRegularExpression " + "characterSequence regularExpression+");
            System.exit(0);
        }
        System.out.println("Input: \"" + args[0] + "\""); //Input: "abcabcabcdefabc"
        for (String arg : args) {
            System.out.println("Regular expression: \"" + arg + "\""); //Regular expression: "abcabcabcdefabc"
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(args[0]);
            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at positions " +
                        m.start() + "-" + (m.end() - 1));
            }
        }
    }
}
//Input: "abcabcabcdefabc"
//Regular expression: "abcabcabcdefabc"
//Match "abcabcabcdefabc" at positions 0-14
//Regular expression: "abc+"
//Match "abc" at positions 0-2
//Match "abc" at positions 3-5
//Match "abc" at positions 6-8
//Match "abc" at positions 12-14
//Regular expression: "(abc)+"
//Match "abcabcabc" at positions 0-8
//Match "abc" at positions 12-14
//Regular expression: "(abc){2,}"
//Match "abcabcabc" at positions 0-8
