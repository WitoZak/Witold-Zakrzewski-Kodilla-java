package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.util.AssertionErrors.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.createTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        //Then
        assertEquals("SHOPPING TASK", "Shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.createTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        //Then
        assertEquals("DRIVING TASK", "Driving", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.createTask(TaskFactory.PAINTINGTASK);
        painting.executeTask();
        //Then
        assertEquals("PAINTING TASK", "Painting", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }
}
