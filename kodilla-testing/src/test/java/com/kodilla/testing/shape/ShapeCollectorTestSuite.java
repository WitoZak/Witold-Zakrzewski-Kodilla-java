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
    @DisplayName("Checking method addFigure")
    class TestAdd {
        @Test
        void addFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle(7.0);
            Shape square = new Square(6.0);
            Shape triangle = new Triangle(4.0, 8.0);
            //When
            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);
            //Then
            assertEquals(circle, collector.getFigure(0));
            assertEquals(square, collector.getFigure(1));
            assertEquals(triangle, collector.getFigure(2));
        }
    }

    @Nested
    @DisplayName("Checking method removeFigure")
    class TestRemove {
        @Test
        void removeFigure() {

            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle(7.0);
            Shape square = new Square(6.0);
            Shape triangle = new Triangle(4.0, 8.0);
            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);
            //When
            collector.removeFigure(circle);
            //Then

            assertEquals(square, collector.getFigure(0));
            assertEquals(triangle, collector.getFigure(1));

            System.out.println(collector);
        }
    }

    @Nested
    @DisplayName("Checking method getFigure")
    class TestGet {
        @Test
        public void getFigure() {

            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle(7.0);
            Shape square = new Square(6.0);
            Shape triangle = new Triangle(4.0, 8.0);
            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);
            //When
            Shape shape = collector.getFigure(0);
            //Then
            assertEquals(circle, shape);
            System.out.println(collector);
        }
    }

    @Nested
    @DisplayName("Checking method showFigure")
    class TestShow {
        @Test
        public void showFigures() {

            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle(7.0);
            Shape square = new Square(6.0);
            Shape triangle = new Triangle(4.0, 8.0);
            collector.addFigure(circle);
            collector.addFigure(square);
            collector.addFigure(triangle);
            //When
            collector.showFigures();
            System.out.println(collector);
        }
    }
}