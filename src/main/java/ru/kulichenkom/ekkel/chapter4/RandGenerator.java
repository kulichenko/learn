//Ch4Ex2 Напишите программу, которая генерирует 25 случайных значений типа int. Для каждого значения команда if-else
//сообщает в каком отношении оно находится с другим случайно сгенерированным числом (>,< или =)
package ru.kulichenkom.ekkel.chapter4;

import java.util.Random;

public class RandGenerator {
    public static void main(String[] args) {
        int randPrev = 0;
        for (int i = 0; i < 25; i++) {
            Random value = new Random();
            int rand = value.nextInt();
            System.out.println((i + 1) + "-ое число: " + rand);
            if (randPrev < rand)
                System.out.println(randPrev + "<" + rand);
            else if (randPrev > rand)
                System.out.println(randPrev + ">" + rand);
            else
                System.out.println(randPrev + "=" + rand);
            randPrev = rand;
        }
    }
}
