package ru.kulichenkom.ekkel.chapter9.game;

import ru.kulichenkom.ekkel.chapter9.game.factories.SecondGameFactory;
import ru.kulichenkom.ekkel.chapter9.game.interfaces.Game;

import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) {
        System.out.println("Введите название игры: COIN или DICE ");
        Scanner in = new Scanner(System.in);
        String typeOfGame = in.nextLine().toUpperCase();
        SecondGameFactory secondGameFactory = new SecondGameFactory();
        Game game = secondGameFactory.makeGame(TypeOfGame.valueOf(typeOfGame));
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
