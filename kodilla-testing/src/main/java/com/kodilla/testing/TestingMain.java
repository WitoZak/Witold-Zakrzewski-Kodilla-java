package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int sum = calculator.add(41, 21);
        if (sum == 20) {
            System.out.println("Test kalkulatora zaliczony");
        } else {
            System.out.println("Test kalkulatora niezaliczony");
        }

        int diff = calculator.subtract(41, 21);
        if (diff == 20) {
            System.out.println("Test kalkulatora zaliczony");
        } else {
            System.out.println("Test kalkulatora niezaliczony");
        }
    }
}