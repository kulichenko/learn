//Ch13Ex18 Напишите программу, которая читает файл с исходным кодоми Java
// (имя файла передеается в командной строке)
//и выводит все строковые литералы, содержащиеся в файле
// {Args: src/main/java/ru/kulichenkom/ekkel/chapter13/Exercise6.java}
package ru.kulichenkom.ekkel.chapter13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadJavaFileAndShowStringLiteral18 {

    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("\".*\"");
        int index = 0;
        Matcher m = p.matcher("");
        Path path = Paths.get(args[0]);
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
            }
        }
    }
}