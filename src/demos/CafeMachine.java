package demos;

import java.util.Scanner;

public class CafeMachine {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        showMenu();

        int userChoice = chooseCafe();

        pay(userChoice);

    }


    static void showMenu() {
        System.out.println("Dzień dobry. Wybirz kawę:");
        System.out.println("1 - Czarna kawa");
        System.out.println("2 - Biała");
    }

    static int chooseCafe() {
        int i = scanner.nextInt();

        if (i == 1) {
            System.out.println("Wybrano czarną kawę. Cena: 2.50");
        } else if (i == 2) {
            System.out.println("Wybrano białą kawę. Cena: 3.50");
        } else {
            System.out.println("Zły wybór");
            chooseCafe(); //wywołanie rekurencyjne
        }

        return i;
    }

    static void pay(int userChoice) {

        double cafePrice = userChoice == 1 ? 2.5 : 3.5;

        double userAmount = scanner.nextDouble();

        if (userAmount < cafePrice) {
            System.out.println("Za mało!");
        } else {
            System.out.println("Przygotowanie kawy w trakcie");
        }


        //inny sposób ustalenia ceny kawy
//
//        double cafePrice2;
//        if(userChoice == 1){
//            cafePrice2 = 2.5;
//        }else {
//            cafePrice2 = 3.5;
//        }



    }


}
