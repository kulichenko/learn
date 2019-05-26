package ru.kulichenkom.ekkel.chapter9.game;

import ru.kulichenkom.ekkel.chapter9.game.interfaces.Game;

import java.util.Scanner;

public class CoinGame implements Game {
    private int h = 0, t = 0;

    @Override
    public void tossUp() {
        System.out.println("Подбрось монетку три раза. Введи значение t, если выпал орел, h, если решка:");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String toss = in.nextLine();
            if (toss.equals("h"))
                h++;
            else if (toss.equals("t"))
                t++;
        }
        if (t > h) {
            System.out.println("Орел победил \n Соотношение бросков орел/решка: " + t + "/" + h);
        } else if (h > t) {
            System.out.println("Решка победила \n Соотношение бросков орел/решка: " + t + "/" + h);
        } else System.out.println("Похоже вы ввели что-то не то");
    }
}
