package demos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadanie2 {

    //Zadanie drugie z PDF (rozwiązanie Pauliny)

    public static void main(String[] args) throws IOException {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Podaj 3 liczby: ");
            System.out.println("Liczba a = ");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Podaj liczbe b = ");
            int b = Integer.parseInt(reader.readLine());
            System.out.println("Liczba c = ");
            int c = Integer.parseInt(reader.readLine());


            if (a > b && a > c) {
                System.out.println("max = " + a);
            } else if (b > a && b > c) {
                System.out.println("max = " + b);
            } else if (c > a && c > b) {
                System.out.println("max = " + c);
            }
            if (a < b && a < c) {
                System.out.println("min = " + a);
            } else if (b < a && b < c) {
                System.out.println("min = " + b);
            } else if (c < a && c < b) {
                System.out.println("min = " + c);
            }


        } catch (NumberFormatException exc) {
            System.out.println("To nie jest liczba");
        }
    }
}
