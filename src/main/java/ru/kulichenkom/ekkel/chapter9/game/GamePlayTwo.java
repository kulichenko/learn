package ru.kulichenkom.ekkel.chapter9.game;

import ru.kulichenkom.ekkel.chapter9.game.factories.FactoryOfGames;
import ru.kulichenkom.ekkel.chapter9.game.interfaces.Game;

import java.util.Scanner;

public class GamePlayTwo {
    public static void main(String[] args) {
        System.out.println("Введите игру: COIN или DICE ");
        Scanner in = new Scanner(System.in);
        String typeOfGame = in.nextLine().toUpperCase();
        FactoryOfGames factory = new FactoryOfGames();
        Game game = factory.makeGame(TypeOfGame.valueOf(typeOfGame));
        game.tossUp();
    }

    public static TypeOfGame convertStringToEnum(String inputString) {
        try {
            return TypeOfGame.valueOf(inputString);
        } catch (Exception e) {
            throw new IllegalArgumentException("Не смог найти enum");
        }
    }
}
