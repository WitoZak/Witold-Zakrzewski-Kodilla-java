package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {
    @Test
    void probablyIWillThrowExceptionTest() {
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 3)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.9, 1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.1, 4))
        );
    }
}