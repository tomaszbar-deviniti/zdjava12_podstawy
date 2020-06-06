package com.thobho.hero;

import java.util.Arrays;

public class Game {


    public static void main(String[] args) {
        Hero frodo = new Hero("Frodo");
        Hero frodo2 = new Hero("Frodo");

        //1. Jeżeli używamy operatora == w typach obiektowych, to Java porównuje adresy w pamięci.
        //2. Jeżeli porównujemy obiekty przez equals, a nie nadpiszemy tej metody w swojej klasie,
        //   to tak na prawdę korzystamy z operatora == (patrz punkt 1.)
        //3. Obiekty porównujemy za pomocą NADPISANEJ przez nas metody equals.

        if (frodo.equals(frodo2)) {
            System.out.println("objekty są równe");
        } else {
            System.out.println("objekty NIE są równe");
        }


        //0. Zwrotna
        int a = 101;

        boolean zwrotnosc = a == a; //zawsze true

        //1. warunke - przemienność
        int x = 10;
        int y = 10;
        int z = 10;


        boolean b = x == y;
        boolean b1 = y == x;

        //2. przechodnie
        //x == y && y == z => x = z

        //3. determinstyczne

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }

    public static void printArray(int[] array, int maxIndex) {
        for (int i = 0; i < maxIndex; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "]");
        }
    }

}
