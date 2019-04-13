package ru.kulichenkom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import ru.kulichenkom.ekkel.ch3operastors.Velocity;
import ru.kulichenkom.ekkel.chapter4.Fibonacci;

import java.util.stream.Stream;

class IfElseTestTest {

    static Stream<Arguments> paramTest() {
        return Stream.of(
                Arguments.of(5, "1, 1, 2, 3, 5"),
                Arguments.of(3, "1, 1, 2, 3"),
                Arguments.of(6, "1, 1, 2, 3, 5, 8")
        );
    }

    @Test
    void simpleTest() {
        Velocity velocity = new Velocity();
        velocity.setTime(5.0);
        velocity.setDistance(10.0);
        Assertions.assertTrue((velocity.getDistance() / velocity.getTime() == 2.0));
        velocity.velocityCalculateX5();
        Assertions.assertTrue((velocity.getDistance() / velocity.getTime() == 10.0));
    }

    @CsvSource({
            "10, 5, 12, 1",
            "5, 10, 15, -1",
            "5, 5, 10, 0"
    })
    @ParameterizedTest
    void test(int testval, int begin, String end) {
        System.out.println(end);
    }

    @Test
    void fibonacciTest() {
        Fibonacci fibon = new Fibonacci();
        String result = fibon.fibonacci(5);
        Assertions.assertEquals("1, 1, 2, 3, 5", result);

    }

    @MethodSource
    @ParameterizedTest
    void paramTest(int count, String expectedResult) {
        Fibonacci fibonacci = new Fibonacci();
        String result = fibonacci.fibonacci(count);
        Assertions.assertEquals(expectedResult, result);

    }

    @ValueSource(strings = {"1", "2"})
    @ParameterizedTest
    void singleArgumentTest(String count) {

    }

}
