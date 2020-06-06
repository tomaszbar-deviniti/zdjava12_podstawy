package demos;

import java.util.Scanner;

public class Zadanie4 {

    //Zadanie 4. z PDF (NIEDOKOŃCZONE)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double reveniue = scanner.nextDouble();

        final double TAX_TREASHOLD = 85528;
        final double FIRST_TRESHOLED_PERCENT = 0.18;
        final double TAX_TO_SUBTRACT = 556.02;

        if (reveniue < TAX_TREASHOLD) {
            //pierwszy próg
            double calculatedTax = reveniue * FIRST_TRESHOLED_PERCENT - TAX_TO_SUBTRACT;

            if (calculatedTax <= 0) {
                System.out.println("Nie płacisz podatku");
            } else {
                System.out.println("Twój podatek to" + calculatedTax);
            }
        } else {
            //drugi próg
        }


    }

}
