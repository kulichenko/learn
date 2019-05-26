package ru.kulichenkom.ekkel.chapter9.game.factories;

import ru.kulichenkom.ekkel.chapter9.game.CoinGame;
import ru.kulichenkom.ekkel.chapter9.game.DiceGame;
import ru.kulichenkom.ekkel.chapter9.game.TypeOfGame;
import ru.kulichenkom.ekkel.chapter9.game.interfaces.Game;

public class SecondGameFactory {
    public Game makeGame(TypeOfGame typeOfGame) {
        Game game = null;
        switch (typeOfGame) {
            case COIN:
                game = new CoinGame();
                break;
            case DICE:
                game = new DiceGame();
                break;
            default:
                throw new IllegalArgumentException("Некорретный тип игры: " + typeOfGame);
        }
        return game;
    }
}
