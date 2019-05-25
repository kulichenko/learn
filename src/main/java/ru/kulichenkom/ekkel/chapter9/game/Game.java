//Ch9Ex19 Создайте на базе паттерна "Фабричный метод" программную среду,
//моделирующую броски монет и броски кубиков.
package ru.kulichenkom.ekkel.chapter9.game;

import java.util.Scanner;

interface Game {
    void tossUp();
}

interface GameFactory {
    Game makeGame();
}

class CoinGame implements Game {
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

class DiceGame implements Game {
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

class CoinGameMaker implements GameFactory {

    @Override
    public Game makeGame() {
        return new CoinGame();
    }
}

class DiceGameMaker implements GameFactory {

    @Override
    public Game makeGame() {
        return new DiceGame();
    }
}
