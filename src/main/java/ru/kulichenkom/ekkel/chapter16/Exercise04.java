//Ch16Ex04
package ru.kulichenkom.ekkel.chapter16;

import java.util.Arrays;

public class Exercise04 {
    public static double[][][] createThreeDirectionArray(int sizeX, int sizeY, int sizeZ, double startIndex, double stopIndex) {
        double[][][] doubleArray = new double[sizeX][sizeY][sizeZ];
        if (!(startIndex < stopIndex)) {
            System.out.println("Start must be less than end");
            return null;
        }
        if ((sizeX < 1) || (sizeY < 1) || (sizeZ < 1)) {
            System.out.println("Size must be > 0");
            return null;
        }
        for (int i = 0; i < sizeX; i++) {
            for (int j = 0; j < sizeY; j++) {
                for (int k = 0; k < sizeZ; k++) {
                    doubleArray[i][j][k] = startIndex + (stopIndex - startIndex) / ((i + j + k) + 1);
                }
            }
        }
        return doubleArray;
    }

    static void printArray(double[][][] da) {
        System.out.println(Arrays.deepToString(da));
    }

    public static void main(String[] args) {
        printArray(createThreeDirectionArray(5, 4, 4, 3, 4));
        printArray(createThreeDirectionArray(2, 2, 2, 1, 2));
    }
}
