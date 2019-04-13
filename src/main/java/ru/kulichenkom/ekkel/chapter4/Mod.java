//Ch4Ex4 Напишите программу, использующую два вложенных цикла for и оператор
//остатка (%) для поиска и вывода простых чисел (не делящихся нацело ни на какое другое число кроме себя и 1).
package ru.kulichenkom.ekkel.chapter4;

public class Mod {
    public static void main(String[] args) {
        for (int number = 2; number < 100; number++) {
            int j = 0;
            for (int divider = 1; divider <= number; divider++) {
                if (number % divider == 0)
                    j++;
            }
            if (j <= 2)
                System.out.println(number);
        }
    }
}
