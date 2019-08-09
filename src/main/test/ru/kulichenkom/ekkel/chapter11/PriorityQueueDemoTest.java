package ru.kulichenkom.ekkel.chapter11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class PriorityQueueDemoTest {
    static Stream<Arguments> sortStringByPriorityTest() {
        return Stream.of(
                Arguments.of("CDBEALWEG", "A B C D E E G L W "),
                Arguments.of("985263147", "1 2 3 4 5 6 7 8 9 ")
        );
    }

    static Stream<Arguments> reverseStringByPriority() {
        return Stream.of(
                Arguments.of("CDBEALWEG", "W L G E E D C B A "),
                Arguments.of("985263147", "9 8 7 6 5 4 3 2 1 ")
        );
    }

    static Stream<Arguments> sortedSetFromString() {
        return Stream.of(
                Arguments.of("CDBEAOOBLWEG", "A B C D E G L O W "),
                Arguments.of("985263146516547", "1 2 3 4 5 6 7 8 9 ")
        );
    }

    @MethodSource
    @ParameterizedTest
    void sortStringByPriorityTest(String stringLine, String expectedResults) {
        PriorityQueueDemo priorityQueueDemo = new PriorityQueueDemo();
        String result = priorityQueueDemo.sortStringByPriority(stringLine);
        Assertions.assertEquals(expectedResults, result);
    }

    @MethodSource
    @ParameterizedTest
    void reverseStringByPriority(String stringLine, String expectedResults) {
        PriorityQueueDemo priorityQueueDemo = new PriorityQueueDemo();
        String result = priorityQueueDemo.reverseStringByPriority(stringLine);
        Assertions.assertEquals(expectedResults, result);
    }

    @MethodSource
    @ParameterizedTest
    void sortedSetFromString(String stringLine, String expectedResults) {
        PriorityQueueDemo priorityQueueDemo = new PriorityQueueDemo();
        String result = priorityQueueDemo.sortedSetFromString(stringLine);
        Assertions.assertEquals(expectedResults, result);
    }
}