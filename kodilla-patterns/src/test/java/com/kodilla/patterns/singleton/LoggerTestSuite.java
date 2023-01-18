package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        //Given
        Logger.INSTANCE.log("Test log message 1");
        Logger.INSTANCE.log("Test log message 2");
        //When
        String lastLog = Logger.INSTANCE.getLastLog();
        //Then
        assertEquals("Test log message 2", lastLog);
    }
}

