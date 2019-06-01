package ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory;

public class CoinGameFactory implements AbstractGameFactory {
    @Override
    public Game getGame() {
        return new CoinGame();
    }
}
