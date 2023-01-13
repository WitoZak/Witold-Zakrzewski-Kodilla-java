package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BoardConfig.class})
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Give
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.addTask("Task1");
        board.inProgressList.addTask("Task2");
        board.doneList.addTask("Task3");

        //Then
        assertEquals(1, board.getToDoList().getTasks().size());
        assertEquals("Task1", board.getToDoList().getTasks().get(0));
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals("Task2", board.getInProgressList().getTasks().get(0));
        assertEquals(1, board.getDoneList().getTasks().size());
        assertEquals("Task3", board.getDoneList().getTasks().get(0));
    }
}