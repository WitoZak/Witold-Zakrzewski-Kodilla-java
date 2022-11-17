package com.kodilla.stream;

import com.kodilla.stream.forumUsers.Forum;
import com.kodilla.stream.forumUsers.forumUsers;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum theForum = new Forum();
        theForum.getUserList().stream()
                .filter(n -> n.getSex()=='M')
                .filter(n -> Period.between(n.getDateOfBirth(), LocalDate.now()).getYears()>20)
                .filter(n->n.getPostCount()>=1)
                .collect(Collectors.toMap(forumUsers::getId, n->n)).entrySet()
                .stream()
                .map(n->n.getKey()+": " + n.getValue())
                .forEach(System.out::println);

    }
}