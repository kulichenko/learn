package ru.kulichenkom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.kulichenkom.ekkel.ch3operastors.Velocity;
import ru.kulichenkom.ekkel.chapter4.IfElseTest;

class IfElseTestTest {

    @CsvSource({
            "10, 5, 12, 1",
            "5, 10, 15, -1",
            "5, 5, 10, 0"
    })
    @ParameterizedTest
    void test(int testval, int begin, int end, int expectedResult) {
        int actualResult = IfElseTest.test(testval, begin, end);
        Assertions.assertEquals(actualResult, expectedResult, "Мы облажались!");
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
}
