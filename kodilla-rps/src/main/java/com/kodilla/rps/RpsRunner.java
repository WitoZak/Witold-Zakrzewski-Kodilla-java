package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

               Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int aiResult = 0;
        int userResult = 0;
        int roundsCount = 0;

        boolean end = false;

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("ZACZYNAMY!! " + name);

        System.out.println("Kamień -> '1'");
        System.out.println("Papier -> '2'");
        System.out.println("Nożyce -> '3'");
        System.out.println("Nowa gra -> 'N'");
        System.out.println("Koniec gry -> 'X' ");

        //Zczytanie ile gramy rund
        System.out.println("Ile rund zagramy? ");
        roundsCount = Integer.parseInt(scanner.nextLine());

        while (!end) {
            System.out.println("Wykonaj swój ruch");
            String user = scanner.nextLine();

            if (user.equalsIgnoreCase("X")) {
                System.out.println("Czy na pewno zakończyć grę?");
                break;
            } else if (user.equalsIgnoreCase("N")) {
                System.out.println("Czy na pewno zakończyć aktualną grę i zacząć od nowa?");
                aiResult = 0;
                userResult = 0;

            } else if (aiMove(user)) {
                int ai = random.nextInt(3) + 1;
                System.out.println("Mój ruch to " + ai);
                if (tie(user, ai)) {
                    System.out.println("To samo, gramy dalej");
                } else if (pointForUser(user, ai)) {
                    System.out.println("Bravo, punkt dla Ciebie");
                    userResult++;
                } else {
                    System.out.println("Punkt dla mnie");
                    aiResult++;
                }
                System.out.println("Wynik: " + name + " --> " + userResult + " Ai --> " + aiResult);
            }

            if (checkingIfEnd(aiResult, userResult, roundsCount)) {
                if (userResult > aiResult) {
                    System.out.println("Wygrałeś, bravo TY");
                } else {
                    System.out.println("Tym razem AI jest górą");
                }
                break;

            }
        }
    }

    static boolean pointForUser(String user, int ai) {
        return (user.equals("1") && ai == 3) || (user.equals("2") && ai == 1) || (user.equals("3") && ai == 2);
    }

    static boolean tie(String user, int ai) {
        return (user.equals("1") && ai == 1) || (user.equals("2") && ai == 2) || (user.equals("3") && ai == 3);
    }

    static boolean aiMove(String user) {
        return user.equals("1") || user.equals("2") || user.equals("3");
    }

    static boolean checkingIfEnd(int aiResult, int userResult, int roundsCount) {
        return roundsCount == aiResult + userResult;
    }
}

