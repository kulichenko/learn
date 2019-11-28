/*Ch16Ec19 (2) Create a class with an int field that’s initialized from a constructor argument.
 Create two arrays of these objects, using identical initialization values for each array, and
 show that Arrays.equals( ) says that they are unequal. Add an equals( ) method to your class
 to fix the problem.
 */
package ru.kulichenkom.ekkel.chapter16;

import java.util.Arrays;

class Num {
    private int number;

    public Num(int number) {
        this.number = number;
    }
}

public class Exercise19 {
    public static void main(String[] args) {
        Num[] nums1 = new Num[5];
        Num[] nums2 = new Num[5];
        Arrays.fill(nums1, new Num(4));
        Arrays.fill(nums2, new Num(4));
        System.out.println(Arrays.equals(nums1, nums2));
    }
}
