package demos;

public class Day2 {

    public static void main(String[] args) {
        //dane
        double bodyTemperature = 37.0;


        //algorytm
        boolean hasFever = bodyTemperature > 36.6;

        if(hasFever) {
            //1. Blok programu

        } else {
            //2. Inny blok programu
        }

        //============NOWA RZECZ - Instrukcje warunkowe================
        String textToDisplay = hasFever ? "Gorączka" : "Prawidłowa temperatorya ciała";

        System.out.println(textToDisplay);

        //=============PĘTLE====================

        //FOR - wiemy ile będzie iteracji, pętla z wbudowanym licznikiem

        for(int i = 0; i < 10; i++){

            // System.out.println(i);

        }


        //WHILE - nie wiemy ile będzie iteracji, oparta o warunkowe

        while(hasFever){
            //
            hasFever = false;
        }


        // FOREACH - służy do iteracji po tablicach i kolekcjach Javy

        int[] arrayOfInt = {1,2,3,4,5,6,7};

        int[] anotherArrayOfInt = new int[10]; // 0 - 9 <---indexy

        //[0][1][2][3][4][5]
        //                i

        for(int i = 0; i < arrayOfInt.length; i++){

            int numberInIPosition = arrayOfInt[i];


            // System.out.print(numberInIPosition);
        }


        String[] names = {"Janek", "Janusz", "Andrzej"};

        for(String name : names){

            // System.out.print(name);
        }


        //Algorytm przeszukiwania liniowego - wyszukiwanie najmniejszer wartości


        int[] userAges = {12,43,51,32,56};

        //algorytm

        int minAge = 300;

        for(Integer age: userAges){
            if(age < minAge){
                minAge = age;
            }
        }

        System.out.print(minAge);
    }



    //=====================METODY===========================
    //mógłby być char
    //1. equals - porównywanie typów obiektowych
    //2. null - wartość pusta dla typów obiektowych
    //3. "wczesny return"
    //4. substring
    static String getFirstLetter(String word){
        if(word.equals("")) //word == "" {
            return null;

        //substring
        String firstLetter = word.substring(0, 1);

        return word.substring(0, 1);
    }



    static boolean isNegativeNumber(int number){
        if(number < 0){
            return true;
        } else {
            return false;
        }
    }


    static void joke(){
        System.out.println("Kto tam? Hipopotam!");

        return;

    }


    static int sumTwoInts(int first, int second){
        //od tąd!!!!
        System.out.println("Przed żartem");

        joke();

        System.out.println("Po ptokach!");


        return first + second;
    }

    static int sumNumbersAndTellJoke(String stringToSay, int... integersToSum){




        System.out.println(stringToSay);

        int sumToReturn = 0;

        for(Integer actualIntInLoop : integersToSum){
            sumToReturn += actualIntInLoop;
        }

        return sumToReturn;

    }
}
