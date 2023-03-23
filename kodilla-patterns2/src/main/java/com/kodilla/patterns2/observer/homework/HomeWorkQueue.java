package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeWorkQueue implements Observable{

    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String courseName;

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getCourseName() {
        return courseName;
    }

    public HomeWorkQueue(String courseName) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.courseName = courseName;
    }

    public void addHomework(String module) {
        homeworks.add(module);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }
}
