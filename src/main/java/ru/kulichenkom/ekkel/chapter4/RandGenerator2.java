//Ch4Ex3 Измените упр 3 так, чтобы код выполнялся в бесконечном цикле while.
package ru.kulichenkom.ekkel.chapter4;

import java.util.Random;

public class RandGenerator2 {
    public static void main(String[] args) {
        int randPrev = 0;
        int i = 1;
        while (i > 0) {
            Random value = new Random();
            int rand = value.nextInt();
            System.out.println(i + "-ое число: " + rand);
            if (randPrev < rand)
                System.out.println(randPrev + "<" + rand);
            else if (randPrev > rand)
                System.out.println(randPrev + ">" + rand);
            else
                System.out.println(randPrev + "=" + rand);
            randPrev = rand;
            i++;
        }
    }
}
