//Ch12Ex3 Напишите код, который генерирует и перехватывает исключение
//ArrayIndexOutOfBoundsException.
package ru.kulichenkom.ekkel.chapter12;

public class RegionsEx3 {
    int[] numberOfRegions = new int[89];

    public static void main(String[] args) {
        RegionsEx3 regions = new RegionsEx3();
        System.out.println(regions.getNumberOfRegions(89));
    }

    public int getNumberOfRegions(int i) {
        return numberOfRegions[i];
    }
}