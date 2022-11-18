package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {345, 4444, 23456, 1367, 22, 3673, 8976, 78, 324, 123, 123, 8653, 854, 11, 689, 245, 1, 523, 1236, 113, 6790};
        //When
        double result = ArrayOperations.getAverage(numbers);
        //Then
        assertEquals(2954.571, result, 0.001);


    }
}
