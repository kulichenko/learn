/*
Ch16Ex18 (3) Create and fill an array of BerylliumSphere.
Copy this array to a new array and show that it’s a shallow copy.
 */
package ru.kulichenkom.ekkel.chapter16;

import java.util.Arrays;

public class Exercise18 {
    public static void main(String[] args) {
        BerylliumSphere[] berylliumSpheres1 = new BerylliumSphere[5];
        Arrays.fill(berylliumSpheres1, new BerylliumSphere());
        System.out.println(Arrays.toString(berylliumSpheres1));
        BerylliumSphere[] berylliumSpheres2 = new BerylliumSphere[7];
        for (int i = 0; i < berylliumSpheres2.length; i++) {
            berylliumSpheres2[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(berylliumSpheres2));
        System.arraycopy(berylliumSpheres1, 0, berylliumSpheres2, 0, berylliumSpheres1.length);
        System.out.println(Arrays.toString(berylliumSpheres2));//Нет новых BerylliumSphere()
    }
}
