//Ch3Ex7 Напишите программу, моделирующую бросок монетки
package ru.kulichenkom.ekkel.ch3operastors;

import java.util.Random;

public class Coin {

    public static void main(String[] args) {
        Random rand = new Random();
        boolean coinSideH = rand.nextBoolean();
        if (coinSideH) {
            System.out.println("Решка");
        } else System.out.println("Орел");
    }
}
