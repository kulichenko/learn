//Ch5Ex16 создайте массив объектов String. Присвойте объект String каждому элементу.
//Выведите содержимое массива в циклу for.
package ru.kulichenkom.ekkel.chapter5;

public class StringArray {
    private String[] trees = {"Oak, ", "Pine, ", "Birch"};

    public static void main(String[] args) {
        StringArray arrayOfTrees = new StringArray();
        for (int i = 0; i < arrayOfTrees.trees.length; i++) {
            System.out.print(arrayOfTrees.trees[i]);
        }
    }
}
