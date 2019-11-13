//Ch15Ex26 Продемонстрируйте ковариантность массивов на примере Number и Integer.
package ru.kulichenkom.ekkel.chapter15;

public class Exercise26 {
    public static void main(String[] args) {
        Number[] numbers = new Integer[3];
        numbers[0] = 5;
        numbers[1] = 15;
        numbers[2] = 16;
        try {
            numbers[1] = 1.250; //позволяет добавлять тип, производные от Number/ Runtime - ArrayStockException, поскольку тип Double
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            numbers[2] = 5.524f; //позволяет добавлять тип, производные от Number/ Runtime - ArrayStockException, поскольку тип Float
        } catch (Exception e) {
            System.out.println(e);
        }
        for (Number n : numbers) {
            System.out.println(n);
        }
        for (Number n : numbers) {
            System.out.println(n.getClass().getSimpleName());
        }
//        Integer[] integers = numbers; Incompatible types
    }
}//Output:
//java.lang.ArrayStoreException: java.lang.Double
//java.lang.ArrayStoreException: java.lang.Float
//5
//15
//16
//Integer
//Integer
//Integer