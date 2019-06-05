package ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory;
import java.util.Scanner;

public class GamePlay {
    public static AbstractGameFactory getFactoryByString(String inputString) {
        switch (TypeOfGame.valueOf(inputString)) {
            case COIN:
                return new CoinGameFactory();
            case DICE:
                return new DiceGameFactory();
            default:
                throw new IllegalArgumentException("This game does not exist: " + inputString);
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите название игры: COIN или DICE ");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine().toUpperCase();
        AbstractGameFactory gameFactory = getFactoryByString(inputString);
        Game game = gameFactory.getGame();
        game.tossUp();
    }

    enum TypeOfGame {DICE, COIN, CHESS}
}

