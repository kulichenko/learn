//Ch16Ex01 (2) Create a method that takes an array of BerylliumSphere as an argument.
// Call the method, creating the argument dynamically. Demonstrate that ordinary
// aggregate array initialization doesn’t work in this case. Discover the only
// situations where ordinary aggregate array initialization works, and where dynamic
// aggregate initialization is redundant (излишне).
package ru.kulichenkom.ekkel.chapter16;

class BerylliumSphere {
    private static long counter;
    private final long id = counter++;

    public String toString() {
        return "Sphere " + id;
    }
}

public class Exercise01 {
    public static void main(String[] args) {
        Exercise01 exercise01 = new Exercise01();
        // Call the method, creating the argument dynamically.
        exercise01.takesAnArrayOfBerylliumSphere(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()});
//      exercise01.takesAnArrayOfBerylliumSphere({new BerylliumSphere(), new BerylliumSphere()});// Demonstrate that ordinary aggregate array initialization doesn’t work in this case.
        BerylliumSphere[] beryllium1 = {new BerylliumSphere(), new BerylliumSphere()};
        exercise01.takesAnArrayOfBerylliumSphere(beryllium1);
        BerylliumSphere[] beryllium12 = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere(),};
        exercise01.takesAnArrayOfBerylliumSphere(beryllium12);
    }

    public void takesAnArrayOfBerylliumSphere(BerylliumSphere[] berylliumSpheres) {
        for (BerylliumSphere b : berylliumSpheres) {
            System.out.println(b);
        }
    }
}