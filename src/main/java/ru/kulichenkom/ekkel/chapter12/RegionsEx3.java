//Ch12Ex7Измените упражнение 3 так, чтобы информация об исключении выводилась в блоке catch
//Ch12Ex3 Напишите код, который генерирует и перехватывает исключение
//ArrayIndexOutOfBoundsException.
package ru.kulichenkom.ekkel.chapter12;

public class RegionsEx3 {
    static int[] numberOfRegions = new int[89];

    public static void main(String[] args) {
        RegionsEx3 regions = new RegionsEx3();
        for (int i = 0; i < numberOfRegions.length; i++) {
            numberOfRegions[i] = i + 1;
        }
        try {
            System.out.println(regions.getNumberOfRegions(numberOfRegions[numberOfRegions.length]));
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("Массив не содержит числа с индексом " + numberOfRegions.length);
        }
    }

    public int getNumberOfRegions(int i) {
        return numberOfRegions[i];
    }
}