package ru.kulichenkom.ekkel.chapter9.processor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class StringMixerTest {

    //    static Stream<Arguments> testProcess() {
//        return Stream.of(
//                Arguments.of("Test", "eTts"),
//                Arguments.of("214365", "123456"),
//                Arguments.of("mixer Test", "imex reTts")
//        );
//    }
//
//    @MethodSource
//    @ParameterizedTest
//    void testProcess(String getNewString, String expectedResult) {
//        StringMixer stringMixer = new StringMixer();
//        String result = stringMixer.process(getNewString);
//        Assertions.assertEquals(expectedResult, result);
//    }
    @ParameterizedTest
    @CsvSource({
            "Test, eTts",
            "214365, 123456",
            "mixer Testa, imex reTts"
    })
    void testProcess(String getNewString, String expectedResult) {
        StringMixer stringMixer = new StringMixer();
        String result = stringMixer.process(getNewString);
        Assertions.assertEquals(expectedResult, result);
    }
}