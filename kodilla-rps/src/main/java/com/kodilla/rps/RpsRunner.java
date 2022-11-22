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
        int AiResult = 0;
        int UserResult = 0;
        int roundsCount = 0;

        boolean end = false;

        // Wczytaj name
        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("ZACZYNAMY!! "+ name);

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


            //Na pewno za każdą pętlą musi zczytać koniec gry(X) i nowa gra(N)
            //User wybiera kształt
            //Jeśli gra jest kontynuowana to Ai wywołuje klasę Random
            //I tu nie wiem jak porównać wyniki?? Jakieś gotowe metody boolean ??
            // Wygrana AI, wygrana Usera, remis ?!
            //Na końcu metoda kończąca gre i wyświetlająca wynik
        }
    }
}
