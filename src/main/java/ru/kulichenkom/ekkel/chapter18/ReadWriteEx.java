package ru.kulichenkom.ekkel.chapter18;

import java.io.*;

public class ReadWriteEx<T> {
    private File file = null;
    private FileWriter fileWriter = null;
    private FileInputStream fileInputStream = null;
    private InputStreamReader inputStreamReader = null;
    private FileOutputStream fileOutputStream;

    public static void main(String[] args) throws IOException {
        ReadWriteEx readWriteEx = new ReadWriteEx();
        readWriteEx.writeInformationToFile("/home/maxim/IdeaProjects/learn/src/main/resources/2.txt", "\nИ вам в ответ привет!!!");
        readWriteEx.readInformationFromFile("/home/maxim/IdeaProjects/learn/src/main/resources/2.txt");
        readWriteEx.copyInformationFromFileToOtherFile("/home/maxim/IdeaProjects/learn/src/main/resources/2.txt",
                "/home/maxim/IdeaProjects/learn/src/main/resources/3.txt");
    }

    public void writeInformationToFile(String filename, String text) {
        file = new File(filename);
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void readInformationFromFile(String filename) {
        file = new File(filename);
        int b;
        try {
            fileInputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(fileInputStream);
            while ((b = inputStreamReader.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyInformationFromFileToOtherFile(String sourceFile, String destinationFile) {
        File sourceF = new File(sourceFile);
        File destF = new File(destinationFile);
        int b;
        try {
            fileInputStream = new FileInputStream(sourceF);
            fileOutputStream = new FileOutputStream(destF);
            while ((b = fileInputStream.read()) != -1) {
                fileOutputStream.write(b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}