package ru.kulichenkom.ekkel.chapter9.game.factories;

import ru.kulichenkom.ekkel.chapter9.game.CoinGame;
import ru.kulichenkom.ekkel.chapter9.game.DiceGame;
import ru.kulichenkom.ekkel.chapter9.game.TypeOfGame;
import ru.kulichenkom.ekkel.chapter9.game.interfaces.AbstractGameFactory;
import ru.kulichenkom.ekkel.chapter9.game.interfaces.Game;

public class FactoryOfGames implements AbstractGameFactory {
    @Override
    public Game makeGame(TypeOfGame typeOfGame) {
        switch (typeOfGame) {
            case COIN:
                return new CoinGame();
            case DICE:
                return new DiceGame();
            default:
                throw new IllegalArgumentException("This game does not exist: " + typeOfGame);
        }
    }
}
