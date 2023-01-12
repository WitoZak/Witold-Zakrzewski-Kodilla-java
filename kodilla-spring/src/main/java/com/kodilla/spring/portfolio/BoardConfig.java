package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList doneList() {
        return new TaskList();
    }

    @Bean
    public Board board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        Board board = new Board(toDoList, inProgressList, doneList);
        board.setToDoList(toDoList);
        board.setInProgressList(inProgressList);
        board.setDoneList(doneList);
        return board;
    }
}
