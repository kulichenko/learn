//Ch12Ex22 Создайте класс FailingConstructor с конструктором, во время выполнения которого может произойти ошибка,
//приводящая к выдаче исключения. В методе main() напишите код, который защищает программу от таких сбоев.
//на базе примера из книги InputFile.java
package ru.kulichenkom.ekkel.chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FailingConstructor {
    private BufferedReader in;

    public FailingConstructor(String fileName) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + " не обнаружен");
            throw e;
        } catch (Exception ex) {
            in.close();
            System.out.println("in.close() неуспешен");
            throw ex;
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("readLine() неуспешен");
        }
        return s;
    }

    public static void main(String[] args) throws Exception {
        try {
            FailingConstructor failingConstructor = new FailingConstructor("src/main/resources/TextForExercises.txt");
            try {
                String s;
                int i = 1;
                while ((s = failingConstructor.getLine()) != null) {
                    System.out.println(i + ": " + s);
                    i++;
                }
            } catch (Exception e) {
                System.out.println("Exception пойман в main()");
            }
        } catch (Exception e) {
            System.out.println("Конструктор FailingConstructor не сработал");
        }
    }
}