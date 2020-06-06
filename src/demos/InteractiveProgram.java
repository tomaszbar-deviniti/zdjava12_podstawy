package demos;

import java.util.Random;
import java.util.Scanner;

public class InteractiveProgram {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj");
        System.out.println("Podaj liczbę większą od 0");

        int i = scanner.nextInt();

        while (i < 0){
            System.out.println("Spróbuj jeszcze raz. Błędne dane");

            i = scanner.nextInt();

        }

        System.out.println("Wpisałeś poprawne dane");


        //losowanie liczby z przedziału
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(i);

    }

}
