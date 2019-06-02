package ru.kulichenkom.ekkel.chapter9.game.factories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory.CoinGame;
import ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory.DiceGame;
import ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory.Game;
import ru.kulichenkom.ekkel.chapter9.game.GameWithConcreteFactory.GameFactory;
import ru.kulichenkom.ekkel.chapter9.game.GameWithConcreteFactory.TypeOfGame;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GameFactoryTest {
    GameFactory factory = new GameFactory();

    static Stream<Arguments> testMakeGame() {
        return Stream.of(
                Arguments.of("COIN", new CoinGame()),
                Arguments.of("DICE", new DiceGame())
        );
    }

    @MethodSource
    @ParameterizedTest
    void testMakeGame(TypeOfGame getTypeOfGame, Game expectedGame) {
        Game resultGame = factory.createGame(getTypeOfGame);
        Assertions.assertEquals(expectedGame.getClass(), resultGame.getClass());
    }

    @Test
    public void exceptionTestMakeGame() {
        assertThrows(IllegalArgumentException.class, () ->
                factory.createGame(TypeOfGame.CHESS));
        Throwable thrown = assertThrows(IllegalArgumentException.class, () ->
                factory.createGame(TypeOfGame.CHESS));
        assertEquals("Некорретный тип игры: CHESS", thrown.getMessage());
    }
}

