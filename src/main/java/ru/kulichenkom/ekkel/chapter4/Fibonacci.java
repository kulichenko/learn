//Ch4Ex10 Напишите метод, который возвращает целочисленный аргумент и выводит
// указанное количество чисел Фибоначчи. Например, при запуске командой java Fibonacci 5
//должна выводиться последовательность 1, 1, 2, 3, 5

package ru.kulichenkom.ekkel.chapter4;

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.fibonacci(5));
    }

    public String fibonacci(int count) {
        int prevNumber = 0;
        int currentNumber = 1;
        String result = null;
        for (int i = 0; i < count - 1; i++) {
            if (i == 0) {
                result = currentNumber + ", ";
            }
            int nextNumber = currentNumber + prevNumber;
            if (i == count - 2) {
                result = result + nextNumber;
            } else
                result = result + nextNumber + ", ";
            prevNumber = currentNumber;
            currentNumber = nextNumber;
        }
        return result;
    }
}
