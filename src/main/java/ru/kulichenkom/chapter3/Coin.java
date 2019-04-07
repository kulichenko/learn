//Ch3Ex7 Напишите программу, моделирующую бросок монетки
package ru.kulichenkom.chapter3;

import java.util.Random;

public class Coin {

    public static void main(String[] args) {
        Random rand = new Random();
        boolean coinSideH = rand.nextBoolean();
        if (coinSideH == true) {
            System.out.println("Решка");
        } else System.out.println("Орел");
    }
}
