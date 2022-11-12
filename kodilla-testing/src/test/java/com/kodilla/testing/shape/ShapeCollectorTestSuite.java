package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Checking method addShape")
    class TestAdd {
        @Test
        void testAddShape() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("C1", 7);
            Shape square = new Square("S1", 6);
            Shape triangle = new Triangle("T1", 4, 8);
            //When
            collector.addShape(circle);
            collector.addShape(square);
            collector.addShape(triangle);
            //Then
            assertEquals(circle, collector.getFigures(0));
            assertEquals(square, collector.getFigures(1));
            assertEquals(triangle, collector.getFigures(2));
        }
    }

    @Nested
    @DisplayName("Checking method removeShape")
    class TestRemove {
        @Test
        void removeShape() {

            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("C1", 7);
            Shape square = new Square("S1", 6);
            Shape triangle = new Triangle("T1", 4, 8);
            collector.addShape(circle);
            collector.addShape(square);
            collector.addShape(triangle);
            //When
            collector.removeShape(circle);
            //Then

            assertEquals(square, collector.getFigure(0));
            assertEquals(triangle, collector.getFigure(1));

            System.out.println(collector);
        }
    }

    @Nested
    @DisplayName("Checking method getShape")
    class TestGet {
        @Test
        public void getShape() {

            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("C1", 7);
            Shape square = new Square("S1", 6);
            Shape triangle = new Triangle("T1", 4, 8);
            collector.addShape(circle);
            collector.addShape(square);
            collector.addShape(triangle);
            //When
            int shape = collector.getFigure(0);
            //Then
            assertEquals(circle, shape);
            System.out.println(collector);
        }
    }

    @Nested
    @DisplayName("Checking method showShape")
    class TestShow {
        @Test
        public void showShape() {

            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("C1", 7);
            Shape square = new Square("S1", 6);
            Shape triangle = new Triangle("T1", 4, 8);
            collector.addShape(circle);
            collector.addShape(square);
            collector.addShape(triangle);
            //When
            collector.showFigures();
            System.out.println(collector);
        }
    }
}