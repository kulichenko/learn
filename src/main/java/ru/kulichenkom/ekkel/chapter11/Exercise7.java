//Ch11Ex7 Создайте класс, затем создайте инициализированный массив объектов этого класса.
//Заполните контейнер List Данными массива. Создайте подмножество List методом subList(),
//после чего удалите это подмножество из вашего контейнера List.
package ru.kulichenkom.ekkel.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Part {
    private static int counter = 1;
    private int boxNum;

    Part() {
        boxNum = counter;
        System.out.println("The part num is " + counter++);
    }

    @Override
    public String toString() {
        return "Box # " + boxNum;
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        Part[] parts = new Part[5];
        for (int i = 0; i < parts.length; i++) {
            parts[i] = new Part();
        }
        List<Part> partList = Arrays.asList(parts);
        System.out.println("Полный список: " + partList);
        List<Part> sub = partList.subList(2, 4);
        System.out.println("Частичный список: " + sub);
        List<Part> copy = new ArrayList<>(partList);
        copy.removeAll(sub);
        partList = copy;
        System.out.println("Полный список после удаления: " + partList);
    }
}
