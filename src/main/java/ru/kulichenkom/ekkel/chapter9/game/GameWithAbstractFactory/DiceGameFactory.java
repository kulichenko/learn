package ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory;

public class DiceGameFactory implements AbstractGameFactory {
    @Override
    public Game getGame() {
        return new DiceGame();
    }
}
