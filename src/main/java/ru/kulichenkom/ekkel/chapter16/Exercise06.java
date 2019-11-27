/*Ch16Ex06 (1) Write a method that takes two int arguments, indicating the two sizes of a 2-D array.
The method should create and fill a 2-D array of BerylliumSphere according to the size arguments.
 */
package ru.kulichenkom.ekkel.chapter16;

import java.util.Arrays;

public class Exercise06 {
    public static BerylliumSphere[][] fillArray(int size1, int size2) {
        BerylliumSphere[][] berylliumSpheres = new BerylliumSphere[size1][size2];
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                berylliumSpheres[i][j] = new BerylliumSphere();
            }
        }
        System.out.println(Arrays.deepToString(berylliumSpheres));
        return berylliumSpheres;
    }

    public static void main(String[] args) {
        fillArray(5, 2);
    }
}
