//Ch4Ex10 Напишите метод, который возвращает целочисленный аргумент и выводит
// указанное количество чисел Фибоначчи. Например, при запуске командой java Fibonacci 5
//должна выводиться последовательность 1, 1, 2, 3, 5

package ru.kulichenkom.ekkel.chapter4;

public class Fibonacci {
    private static void fibonacci(int number) {
        int prevNumber = 0;
        int currentNumber = prevNumber + 1;
        System.out.print(1 + ", ");
        for (int i = 0; i < number - 1; i++) {
            int nextNumber = currentNumber + prevNumber;
            System.out.print(nextNumber + ", ");
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }
    }

    public static void main(String[] args) {
        fibonacci(5);
    }
}
