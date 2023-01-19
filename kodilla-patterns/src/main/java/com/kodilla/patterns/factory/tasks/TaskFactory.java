package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String PAINTINGTASK = "PAINTING";
    public static final String SHOPPINGTASK = "SHOPPING";
    public static final String DRIVINGTASK = "DRIVING";

    public Task createTask (final String taskClass) {
        return switch (taskClass) {
            case SHOPPINGTASK -> new ShoppingTask("Shopping", "Black paint", 20.0);
            case DRIVINGTASK -> new DrivingTask("Driving", "Home", "Car");
            case PAINTINGTASK -> new PaintingTask("Painting", "Blaack", "Living-room");
            default -> null;
        };
    }

}
