# Gra "Kamień-Papier-Nożyce"

To jest prosta konsolowa implementacja klasycznej gry "Kamień-Papier-Nożyce" napisana w języku Java.

## Jak grać
1. Uruchom program.
2. Podaj swoje imię po wyświetleniu odpowiedniego komunikatu.
3. Gra wyświetli następujące opcje:
   - Kamień -> '1'
   - Papier -> '2'
   - Nożyce -> '3'
   - Nowa gra -> 'N'
   - Zakończ grę -> 'X'
4. Wybierz liczbę odpowiadającą Twojemu ruchowi.
5. Komputer losowo wybierze swój ruch.
6. Wynik zostanie wyświetlony, pokazując kto wygrał rundę.
7. Punkty zostaną zaktualizowane odpowiednio.
8. Kontynuuj grę aż do osiągnięcia określonej liczby rund lub do momentu zakończenia gry.

## Zasady
- Kamień pokonuje Nożyce
- Papier pokonuje Kamień
- Nożyce pokonują Papier

## Dodatkowe opcje
- Wybór 'N' zakończy bieżącą grę i rozpocznie nową.
- Wybór 'X' wymaga potwierdzenia, aby zakończyć grę.

## Wymagania
- Java 11 lub nowsza

## Uruchamianie
1. Skompiluj plik Java:
   ```
   javac RpsRunner.java
   ```
2. Uruchom skompilowaną klasę:
   ```
   java RpsRunner
   ```
