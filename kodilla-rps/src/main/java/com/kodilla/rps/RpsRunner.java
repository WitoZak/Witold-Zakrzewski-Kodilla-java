package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        //Użyję klasy Scanner i Random
        //Zmienne wynik gracza, komputera oraz ilość rund
        //Boolean false czy gra działa

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int aiResult = 0;
        int userResult = 0;
        int roundsCount = 0;

        boolean end = false;

        // Wczytaj name
        System.out.println("Podaj imię: ");
        String user = scanner.nextLine();
        System.out.println("ZACZYNAMY!! " + user);

        // Sout zasady
        System.out.println("Kamień -> '1'");
        System.out.println("Papier -> '2'");
        System.out.println("Nożyce -> '3'");
        System.out.println("Nowa gra -> 'N'");
        System.out.println("Koniec gry -> 'X' ");

        //Zczytanie ile gramy rund
        System.out.println("Ile rund zagramy? ");
        roundsCount = Integer.parseInt(scanner.nextLine());

        //Tu wchodzi While czyli się komplikuje:)
        while (!end) {
            System.out.println("Wykonaj swój ruch");

            if (user.equalsIgnoreCase("X")) {
                System.out.println("Czy na pewno zakończyć grę?");
                break;
            } else if (user.equalsIgnoreCase("N")) {
                System.out.println("Czy na pewno zakończyć aktualną grę i zacząć od nowa?");
                
                    //Jak albo czym wymusić zaczęcie od nowa??
            } else if (aiMove(user)) {
                int ai = random.nextInt(2) + 1;
            }


            //Na pewno za każdą pętlą musi zczytać koniec gry(X) i nowa gra(N)
            //User wybiera kształt
            //Jeśli gra jest kontynuowana to Ai wywołuje klasę Random
            //I tu nie wiem jak porównać wyniki?? Jakieś gotowe metody boolean ??
            // Wygrana AI, wygrana Usera, remis ?!
            //Na końcu metoda kończąca gre i wyświetlająca wynik
        }
    }

    static boolean pointForUser(String user, int ai) {
        return (user.equals("1") && ai == 3) || (user.equals("2") && ai == 1) || (user.equals("3") && ai == 2);
    }

    static boolean pointForAi(String user, int ai) {
        return (user.equals("1") && ai == 2) || (user.equals("2") && ai == 3) || (user.equals("3") && ai == 1);
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

