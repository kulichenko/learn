package ru.kulichenkom.ekkel.chapter9.game.GameWithConcreteFactory;

import ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory.CoinGame;
import ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory.DiceGame;
import ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory.Game;

public class GameFactory {

    public Game createGame(TypeOfGame typeOfGame) {
        switch (typeOfGame) {
            case COIN:
                return new CoinGame();
            case DICE:
                return new DiceGame();
            default:
                throw new IllegalArgumentException("Некорретный тип игры: " + typeOfGame);
        }
    }
}
