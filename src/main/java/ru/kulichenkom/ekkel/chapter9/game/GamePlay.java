package ru.kulichenkom.ekkel.chapter9.game;

public class GamePlay {
    public static void main(String[] args) {
        GameFactory maker = new DiceGameMaker();
        Game game = maker.makeGame();
        game.tossUp();
    }
}
