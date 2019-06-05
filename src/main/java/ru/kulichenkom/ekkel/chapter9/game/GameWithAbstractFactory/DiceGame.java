package ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory;

import java.util.Scanner;

public class DiceGame implements Game {
    private int firstDice = 0, secondDice = 0;

    @Override
    public void tossUp() {
        System.out.println("Подбрось кубики и запиши оба значения через enter:");
        Scanner in = new Scanner(System.in);
        firstDice = in.nextInt();
        secondDice = in.nextInt();
        System.out.println("Сумма вашего броска: " + (firstDice + secondDice));
    }
}
