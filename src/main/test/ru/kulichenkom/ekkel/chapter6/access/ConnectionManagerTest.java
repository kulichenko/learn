package ru.kulichenkom.ekkel.chapter6.access;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static ru.kulichenkom.ekkel.chapter6.access.ConnectionManager.makeConnection;

class ConnectionManagerTest {

    static Stream<Arguments> paramTest() {
        return Stream.of(
                Arguments.of(new Connection(0), "This is connection #0"),
                Arguments.of(new Connection(1), "This is connection #1"),
                Arguments.of(new Connection(2), "This is connection #2"),
                Arguments.of(new Connection(3), "This is connection #3"),
                Arguments.of(new Connection(4), "This is connection #4"),
                Arguments.of(new Connection(5), "This is connection #5"),
                Arguments.of(new Connection(6), "This is connection #6"),
                Arguments.of(new Connection(7), "This is connection #7"),
                Arguments.of(new Connection(8), "This is connection #8"),
                Arguments.of(new Connection(9), "This is connection #9"),
                Arguments.of(new Connection(10), "null")
        );
    }

    @ParameterizedTest
    @MethodSource("paramTest")
    void makeConnectionTest(ConnectionManager manager, String expectedResult) {
        Assertions.assertEquals(expectedResult, makeConnection());
    }
}