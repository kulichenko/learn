//Ch13Ex17 Напишите программу, которая читает файл с исходным кодоми Java (имя файла передеается в командной строке)
//и выводит все комментарии, содержащиеся в файле
// {Args: src/main/java/ru/kulichenkom/ekkel/chapter13/Exercise6.java}
package ru.kulichenkom.ekkel.chapter13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadJavaFileAndShowAllComments17 {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("(\\/\\/\\w*.*$)");
        Matcher matcher = pattern.matcher("");
        Matcher matcher1 = Pattern.compile("\\/\\*.*").matcher("");
        Matcher matcher2 = Pattern.compile(".*\\*\\/").matcher("");
        Path path = Paths.get(args[0]);
        List<String> lines = Files.readAllLines(path);
        int index = 0;
        for (String line : lines) {
            matcher.reset(line);
            while (matcher.find()) {
                System.out.println(index++ + ": " + matcher.group());
            }
        }
        for (int i = 0; i < lines.size(); i++) {
            matcher1.reset(lines.get(i));
            if (matcher1.find()) {
                while (!matcher2.find()) {
                    matcher2.reset(lines.get(i));
                    System.out.println(index++ + ": " + lines.get(i));
                    i++;
                    if (matcher2.find()) {
                        break;
                    }
                }
            }
        }
    }
}

