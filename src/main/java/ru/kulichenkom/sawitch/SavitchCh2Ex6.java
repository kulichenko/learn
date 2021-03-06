//Пользователь 8 раз подбрасывает монету и сообщает результат (h или t)
//после этого программа выводит общее количество и процент каждого выпадания
package ru.kulichenkom.sawitch;

import java.util.Scanner;

public class SavitchCh2Ex6 {
    private static double h = 0, t = 0;

    private static void increment(String line) {
        if (line.equals("h"))
            h++;
        else if (line.equals("t"))
            t++;
    }

    public static void main(String[] args) {
        System.out.println("For each toss, enter h or t");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.println((i + 1) + " toss:");
            increment(in.nextLine());
        }
        in.close();
        double percentH, percentT;
        percentH = h / (h + t) * 100;
        percentT = t / (h + t) * 100;
        System.out.println("You tossed coins like this: h=" + h + ", " + "t=" + t);
        System.out.println("The percent loss of the hand1 H:" + percentH);
        System.out.println("The percent loss of the hand1 T:" + percentT);
    }
}

