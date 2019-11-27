/*Ch16Ex05
(1) Demonstrate that multidimensional arrays of nonprimitive types are automatically initialized to null.
 */
package ru.kulichenkom.ekkel.chapter16;

import java.util.Arrays;

class Airplane {
}

public class Exercise05 {
    public static void main(String[] args) {
        Airplane[][] boing = new Airplane[2][3];
        System.out.println(Arrays.deepToString(boing));
    }
}