package ru.kulichenkom.ekkel.chapter16;

import ru.kulichenkom.utils.ConvertTo;
import ru.kulichenkom.utils.Generated;
import ru.kulichenkom.utils.Generator;
import ru.kulichenkom.utils.RandomGenerator;

import java.util.Arrays;

public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> integerGenerator = new RandomGenerator.Integer(1000);
        int[] generatedArray = ConvertTo.primitive(Generated.array(new Integer[25], integerGenerator));
        Arrays.sort(generatedArray);
        System.out.println("Sorted Array: " + Arrays.toString(generatedArray));
        while (true) {
            int r = integerGenerator.next();
            int location = Arrays.binarySearch(generatedArray, r);
            if (location > 0) {
                System.out.println("Location of " + r + " is " + location);
                break;
            }
        }
    }
}