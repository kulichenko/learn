//Ch17Ex04 Создайте инициализатор Collection, который открывает файл и разбивает его на слова при помощи TextFile,
//после чего использует слова как источник данных для Collection. Покажите, что ваше решение работает.
package ru.kulichenkom.ekkel.chapter17;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Exercise04 {

    public static void main(String[] args) {
        Exercise04 exercise04 = new Exercise04();
        System.out.println(exercise04.getTextFromFile("/home/maxim/IdeaProjects/learn/src/main/resources/Chapter17.txt"));
    }

    public Collection<String> getTextFromFile(String pathToFile) {
        try {
            File file = new File(pathToFile);
            FileReader reader = new FileReader(file);
            BufferedReader textBuffer = new BufferedReader(reader);
            String line = textBuffer.readLine();
            List<String> bufferList = new ArrayList<>();
            while (line != null) {
                bufferList.addAll(Arrays.asList(line.split(" ")));
                line = textBuffer.readLine();
            }
            return bufferList;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}