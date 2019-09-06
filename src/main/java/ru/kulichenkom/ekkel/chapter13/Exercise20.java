//Ch13Exercise 20: (2) Create a class that contains int,
// long, float and double and String fields. Create a
// constructor for this class that takes a single String argument,
// and scans that string into the various fields. Add a toString( )
// method and demonstrate that your class works correctly.
package ru.kulichenkom.ekkel.chapter13;

import java.util.Scanner;

public class Exercise20 {
    private int i;
    private long l;
    private float f;
    private double d;
    private String s;

    public Exercise20(String s) {
        Scanner scanner = new Scanner(s);
        i = scanner.nextInt();
        l = scanner.nextLong();
        f = scanner.nextFloat();
        d = scanner.nextDouble();
        this.s = scanner.next();
    }

    public static void main(String[] args) {
        Exercise20 exercise20 = new Exercise20("175 459889 2,17 3,15468 hello");
        System.out.println(exercise20);
    }

    @Override
    public String toString() {
        return i + " " + l + " " + f + " " + d + " " + s;
    }
}