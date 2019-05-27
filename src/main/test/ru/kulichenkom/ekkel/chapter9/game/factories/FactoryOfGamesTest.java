package ru.kulichenkom.ekkel.chapter9.game.factories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.kulichenkom.ekkel.chapter9.game.CoinGame;
import ru.kulichenkom.ekkel.chapter9.game.DiceGame;
import ru.kulichenkom.ekkel.chapter9.game.TypeOfGame;
import ru.kulichenkom.ekkel.chapter9.game.interfaces.Game;

import java.util.stream.Stream;

class FactoryOfGamesTest {
    FactoryOfGames factory = new FactoryOfGames();

    static Stream<Arguments> testMakeGame() {
        return Stream.of(
                Arguments.of("COIN", new CoinGame()),
                Arguments.of("DICE", new DiceGame())
        );
    }

    @MethodSource
    @ParameterizedTest
    void testMakeGame(TypeOfGame getTypeOfGame, Game expectedGame) {
        Game resultGame = factory.makeGame(getTypeOfGame);
        Assertions.assertEquals(expectedGame.getClass(), resultGame.getClass());
    }

    @Test
    public void exceptionTestMakeGame() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                factory.makeGame(TypeOfGame.CHESS));
    }
}

