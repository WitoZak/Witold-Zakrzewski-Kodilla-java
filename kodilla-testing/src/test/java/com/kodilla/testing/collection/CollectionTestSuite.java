package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.*;

public class CollectionTestSuite {

    private static int testCounter = 0;

    @BeforeEach

    public void before() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
        System.out.println("Test Suite: START");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Suite: END");
    }

    @DisplayName("Checking if List empty before adding Integers")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = OddNumbersExterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("Exterminating odd numbers and checking if in new List there are only even numbers")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(normalList);
        List<Integer> expectedOddNumbers = new ArrayList<>();
        for (int i = 1; i <= normalList.size(); i += 2) {
            expectedOddNumbers.add(i);
        }
        //Then
        Assertions.assertEquals(expectedOddNumbers, result);
    }
}
