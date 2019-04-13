//Ch4Ex3 Измените упр 3 так, чтобы код выполнялся в бесконечном цикле while.
package ru.kulichenkom.ekkel.chapter4;

import java.util.Random;

public class RandGenerator2 {
    public static void main(String[] args) {
        int randPrev = 0;
        while (true) {
            Random value = new Random();
            int rand = value.nextInt();
            System.out.println(rand);
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
