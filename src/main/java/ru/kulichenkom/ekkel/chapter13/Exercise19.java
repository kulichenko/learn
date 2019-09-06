//Ch13Ex19 На основе двух последних упражнений напишите программу которая анализирует
//исходный код Java и выдаст список всех имен классов, использованных в программе
package ru.kulichenkom.ekkel.chapter13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise19 {
    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("class \\w+\\s+");
        Matcher m = pattern.matcher("");
        Path path = Paths.get("src/main/java/ru/kulichenkom/ekkel/chapter13/Exercise6.java");
        List<String> lines = Files.readAllLines(path);
        int index = 0;
        for (String line : lines) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
            }
        }
    }
}