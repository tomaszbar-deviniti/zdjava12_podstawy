package demos;

import java.util.Scanner;

public class ScannerExample {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Dzień dobry! Wpisz liczbę całkowitą dodatnią.");

        int inputFromUser = scanner.nextInt();

        if(inputFromUser < 0){
            System.out.println("To jest liczba ujemna!");
        } else {
            //tutaj pisać nasz program jak dane są poprawne

            for (int i = 1; i <= inputFromUser; i=i+2) {
                System.out.println(i);
            }

        }
        System.out.println("Program zakończył działanie.");
    }

}
