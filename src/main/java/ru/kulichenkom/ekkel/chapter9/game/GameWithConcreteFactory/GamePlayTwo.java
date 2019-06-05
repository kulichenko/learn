package ru.kulichenkom.ekkel.chapter9.game.GameWithConcreteFactory;

import ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory.Game;

import java.util.Scanner;

public class GamePlayTwo {
    public static TypeOfGame getTypeOfGameByString(String typeOfGame) {
        try {
            return TypeOfGame.valueOf(typeOfGame);
        } catch (Exception e) {
            throw new IllegalArgumentException("не смог найти enum");
        }
    }

    public static void main(String[] args) {
        System.out.println("Введите название игры: COIN или DICE ");
        Scanner in = new Scanner(System.in);
        String typeOfGame = in.nextLine().toUpperCase();
        TypeOfGame type = getTypeOfGameByString(typeOfGame);
        GameFactory gameFactory = new GameFactory();
        Game game = gameFactory.createGame(type);
        game.tossUp();
    }
}
