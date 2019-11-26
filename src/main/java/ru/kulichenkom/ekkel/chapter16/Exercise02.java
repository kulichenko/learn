//Ch16Ex02 (1) Write a method that takes
// an int argument and returns an array of that size, filled with BerylliumSphere objects.
package ru.kulichenkom.ekkel.chapter16;

import java.util.Arrays;

public class Exercise02 {
    public static void main(String[] args) {
        Exercise02 exercise02 = new Exercise02();
        exercise02.createBerylliumSphereArray(10);
        System.out.println(Arrays.asList(exercise02.createBerylliumSphereArray(10)));
    }

    public BerylliumSphere[] createBerylliumSphereArray(int size) {
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[size];
        for (int i = 0; i < berylliumSpheres.length; i++) {
            berylliumSpheres[i] = new BerylliumSphere();
        }
        for (BerylliumSphere berylliumSphere : berylliumSpheres) {
            System.out.println(berylliumSphere);
        }
        return berylliumSpheres;
    }
}