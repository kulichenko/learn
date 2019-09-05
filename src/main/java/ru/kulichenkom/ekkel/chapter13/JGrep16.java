//Ch13Ex16 Измените пример JGrep.java, чтобы в аргументе ему можно было передавать имя каталога
//или файла (при передаче каталога в поиск должны включаться все файлы. находящиеся в указанном каталоге).
//Подсказка: список имен файлов можно построить командой
//File[] files = new File(".").listFiles();
//Args: {src/main/resources/TextForExercises.txt "\b[Ssct]\w+"}, либо {C:\Windows\Fonts "\b[Sldg]\w+"}
package ru.kulichenkom.ekkel.chapter13;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrep16 {

    public static void main(String[] args) throws IOException {
        Pattern pattern = Pattern.compile("\\\\\\w+[^.][^w]$");
        Matcher matcher = pattern.matcher(args[0]);
        if (matcher.find()) {
            File[] files = new File(args[0]).listFiles();
            for (int i = 0; i < files.length; i++) {
                Matcher checkFiles = Pattern.compile(args[1]).matcher(String.valueOf(files[i]));
                if (checkFiles.find()) {
                    System.out.println(i + ": " + files[i]);
                }
            }
        } else {
            Pattern pattern1 = Pattern.compile("\\w+\\.{1}\\w+");
            Matcher matcher1 = pattern1.matcher(args[0]);
            if (matcher1.find()) {
                Pattern p = Pattern.compile(args[1]);
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
            } else
                System.out.println("Кажется что-то пошло не так. По шаблону не удалось опознать содержимое аргумента");
        }
    }
}