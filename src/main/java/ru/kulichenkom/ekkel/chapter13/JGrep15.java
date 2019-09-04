//Ch13Ex15 Измените пример JGrep.java, так, чтобы в его аргументах могли передаваться флаги
//(например Pattern.CASE_INSENSITIVE, Pattern.MULTILINE)
// {Args: src/main/resources/TextForExercises.txt "\b[sct]\w+"}
package ru.kulichenkom.ekkel.chapter13;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep15 {
    public static int getFlagFromArgumentForPattern(String arg) {
        int flag = 0;
        switch (arg) {
            case "Pattern.CASE_INSENSITIVE":
                flag = Pattern.CASE_INSENSITIVE;
                break;
            case "Pattern.CANON_EQ":
                flag = Pattern.CANON_EQ;
                break;
            case "Pattern.COMMENTS":
                flag = Pattern.COMMENTS;
                break;
            case "Pattern.DOTALL":
                flag = Pattern.DOTALL;
                break;
            case "Pattern.LITERAL":
                flag = Pattern.LITERAL;
                break;
            case "Pattern.MULTILINE":
                flag = Pattern.MULTILINE;
                break;
            case "Pattern.UNICODE_CASE":
                flag = Pattern.UNICODE_CASE;
                break;
            case "Pattern.UNIX_LINES":
                flag = Pattern.UNIX_LINES;
                break;
        }
        return flag;
    }

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        String flag = args[2];
        Pattern p = Pattern.compile(args[1], getFlagFromArgumentForPattern(flag));
        int index = 0;
        Matcher m = p.matcher("");
        Path path = Paths.get(args[0]);
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
    }
}