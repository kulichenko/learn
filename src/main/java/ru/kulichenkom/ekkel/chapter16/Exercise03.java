/*Ch16Ex03
Напишите метод, который создает и инициализирует двумерный массив double. Размер массива определяется
аргументами метода, а значения инициализации лежат в диапазоне, определяемом начальным и конечным индексами,
также передаваемыми в аргументах метода.
Создайте второй метод для вывода массива, сгенерированного первым методом. */
package ru.kulichenkom.ekkel.chapter16;

import java.util.Arrays;

public class Exercise03 {
    public static double[][] createTwoDirectionArray(int sizeX, int sizeY, double startIndex, double stopIndex) {
        double[][] doubleArray = new double[sizeY][sizeX];
        if (!(startIndex < stopIndex)) {
            System.out.println("Start must be less than end");
            return null;
        }
        if ((sizeX < 1) || (sizeY < 1)) {
            System.out.println("Size must be > 0");
            return null;
        }
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                doubleArray[i][j] = startIndex + (stopIndex - startIndex) / ((i * j) + 1);
            }
        }
        return doubleArray;
    }

    static void printArray(double[][] da) {
        System.out.println(Arrays.deepToString(da));
    }

    public static void main(String[] args) {
        printArray(createTwoDirectionArray(3, 4, 3.1, 4.2));
        printArray(createTwoDirectionArray(2, 2, 1.1, 1.2));
    }
}
