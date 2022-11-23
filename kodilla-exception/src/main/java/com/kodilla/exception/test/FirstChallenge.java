package com.kodilla.exception.test;

public class FirstChallenge {
    public double res(double a, double b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        return a /b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double  result = firstChallenge.res(3, 0);
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println("EXCEPTION: " + e);
        }
        finally {
            System.out.println("\"Pamiętaj cholero, nie dziel przez ZERO\"");
        }

    }
}