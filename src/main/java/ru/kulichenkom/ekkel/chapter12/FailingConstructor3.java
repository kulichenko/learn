//Ch12Ex24 на базе примера из книги InputFile.java
// Добавьте в класс FailingConstructor метод dispose(). Напишите код, для правильного
//использования этого класса.
package ru.kulichenkom.ekkel.chapter12;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FailingConstructor3 {
    private BufferedReader in;

    public FailingConstructor3(String fileName) throws Exception {
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

    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() сработал корректно");
        } catch (IOException e2) {
            throw new RuntimeException("in.close() провален");
        }
    }

    public static void main(String[] args) throws Exception {
        try {
            FailingConstructor3 failingConstructor = new FailingConstructor3("src/main/resources/TextForExercises.txt");
            try {
                String s;
                int i = 1;
                while ((s = failingConstructor.getLine()) != null) {
                    System.out.println(i + ": " + s);
                    i++;
                }
            } catch (Exception e) {
                System.out.println("Exception пойман в main()");
            } finally {
                failingConstructor.dispose();
            }
        } catch (Exception e) {
            System.out.println("Конструктор FailingConstructor не сработал");
        }
    }
}