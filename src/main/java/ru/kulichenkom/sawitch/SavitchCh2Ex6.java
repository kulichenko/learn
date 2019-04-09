//Пользователь 8 раз подбрасывает монету и сообщает результат (h или t)
//после этого программа выводит общее количество и процент каждого выпадания
package ru.kulichenkom.sawitch;

import java.util.Scanner;

public class SavitchCh2Ex6 {
    public static void main(String[] args) {
        double h = 0, t = 0;
        System.out.println("For each toss, enter h or t \n" +
                "First toss:");
        Scanner in = new Scanner(System.in);
        String toss = in.nextLine();
        if (toss.equals("h")) h++;
        if (toss.equals("t")) t++;
        System.out.println("Second toss:");
        toss = in.nextLine();
        if (toss.equals("h")) h++;
        if (toss.equals("t")) t++;
        System.out.println("Third toss:");
        toss = in.nextLine();
        if (toss.equals("h")) h++;
        if (toss.equals("t")) t++;
        System.out.println("Forth toss:");
        toss = in.nextLine();
        if (toss.equals("h")) h++;
        if (toss.equals("t")) t++;
        System.out.println("Fifth toss:");
        toss = in.nextLine();
        if (toss.equals("h")) h++;
        if (toss.equals("t")) t++;
        System.out.println("Sixth toss:");
        toss = in.nextLine();
        if (toss.equals("h")) h++;
        if (toss.equals("t")) t++;
        System.out.println("Seventh toss:");
        toss = in.nextLine();
        if (toss.equals("h")) h++;
        if (toss.equals("t")) t++;
        System.out.println("Eighth toss:");
        toss = in.nextLine();
        if (toss.equals("h")) h++;
        if (toss.equals("t")) t++;
        in.close();
        double percentH, percentT;
        percentH = h / 8 * 100;
        percentT = t / 8 * 100;
        System.out.println("You tossed coins like this: h=" + h + ", " + "t=" + t);
        System.out.println("The percent loss of the hand1 H:" + percentH);
        System.out.println("The percent loss of the hand1 T:" + percentT);
    }
}

