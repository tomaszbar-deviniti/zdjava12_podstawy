package solutions.sol2;

import java.util.Scanner;

//rozwiązanie Pauliny
public class Ekspress {

    static Scanner scanner = new Scanner(System.in);
    static double pieniadzeWrzucone;
    static double cena;
    static double reszta;


    static String powitanie() {
        return "***************************\n       Wybierz kawę: \n***************************";
    }

    static void menu() {
        System.out.println("1. Kawa czarna");
        System.out.println("2. Kawa z mlekiem");
        System.out.println("3. Cappuccino");
        System.out.println("4. Latte");
        System.out.println("0. INFORMACJA");
    }

    static void informacja() {
        System.out.println("To jest ekspress do kawy. Wybierz z menu, którą kawę zaparzyć.\n");
        menu();
        wybor();
    }

    static int wybor() {
        int wybor = scanner.nextInt();
        switch (wybor){
            case 1: {
                System.out.println("Wybrano kawę czarną");
                cena = 2.5;
                System.out.println("Cena = " + cena);
                platnosc();
            } break;
            case 2: {
                System.out.println("Wybrano kawe z mlekiem");
                cena = 3.0;
                System.out.println("Cena = " + cena);
                platnosc();
            } break;
            case 3: {
                System.out.println("Wybrano Cappuccino");
                cena = 3.5;
                System.out.println("Cena = " + cena);
                platnosc();
            } break;
            case 4:{
                System.out.println("Wybrano latte");
                cena = 4.2;
                System.out.println("Cena = " + cena);
                platnosc();
            } break;
            default:
                informacja();
        }
        return wybor;
    }

    static void platnosc() {

        System.out.println("Wrzuć monety");
        pieniadzeWrzucone = scanner.nextDouble();
        reszta = pieniadzeWrzucone - cena;

        if (reszta < 0) {
            while (pieniadzeWrzucone != cena && pieniadzeWrzucone <= cena) {
                double braki = cena - pieniadzeWrzucone;
                System.out.println("Wrzuć jeszcze: " + braki);
                pieniadzeWrzucone += scanner.nextDouble();
            }
            reszta = pieniadzeWrzucone - cena;
        }

        if (reszta > 0) {
            System.out.println("Twoja reszta wynosi: " + reszta + "\nPrzygotowywanie napoju");
        } else {
            System.out.println("Przygotowywanie napoju");
        }
    }


    public static void main(String[] args) {
        System.out.println(powitanie());
        menu();
        wybor();
    }
}