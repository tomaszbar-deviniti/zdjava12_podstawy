package demos;

public class SundayCode {
    //Moje notatki z niedzieli (10 maja), które Wam pokazywałem
    public static void main(String[] args) {

        // String eyesColor = "green";

        // switch(eyesColor){

        //   case("green"):{
        //     //1
        //       System.out.print("Oczy zielone");
        //   }
        //   break;

        //   case("blue"):{
        //     //2
        //       System.out.print("Oczy niebieskie");
        //   }
        //   break;

        //   case("black"):{
        //     //3
        //       System.out.print("Oczy czarne");
        //   }
        //   break;

        //   default:{
        //     System.out.print(" Nie znam takiego koloru!");
        //   }

        // }

        // boolean hasGreen = eyesColor.equals("green")

        // if(hesGreen){

        //       System.out.print("Oczy zielone");

        // } else if(eyesColor.equals("green")){

        //       System.out.print("Oczy niebieskie");

        // } else if(eyesColor.equals("black")){

        //       System.out.print("Oczy czarne");
        // }


        // int monthNumber = 4;


        // switch(monthNumber){
        //       case 1:  System.out.println("January");
        //       break;
        //       case 2:  System.out.println("February");
        //       case 3:  System.out.println("March");
        //       case 4:  System.out.println("April");
        //       case 5:  System.out.println("May");
        //       case 6:  System.out.println("June");
        //       case 7:  System.out.println("July");
        //       case 8:  System.out.println("August");
        //       case 9:  System.out.println("September");
        //       case 10: System.out.println("October");
        //       case 11: System.out.println("November");
        //       case 12: System.out.println("December");
        //       default: break;
        // }


        // int i = 0; // for(x; _; _)

        // while(i < 0){  //for(_; x; _)

        //     System.out.println("Test");

        //     i++; //for(_; _; x)
        // }
        // //================
        // //================
        // do{
        //     System.out.println("DO WHILE TEST");
        // } while(i<0);


        //i == 4 ->

        // for (int i = 0; i < 10; i++) {


        //   if (i == 8) {
        //     continue;
        //   }//<-------------tutaj iteracja jest "przeskakiwana"

        //   System.out.println(i);
        // }


        // [19] [0] [23] [0] [0] [20]
        //  0    1   2   3    4    5
        // lenght = 6
        // lastIndex = length - 1 = 5

        //1. Zadeklarować
        int[] integerArray;

        //2. Zainicjalizować

        integerArray = new int[6];

        //3. Wypełnić danymi

        integerArray[0] = 19;

        //4. Odczytywać dane z tablicy

        // System.out.println(integerArray[0]);


        //5. Pętla for do wyświtlania tablicy

        int[] array = {11, 31, 4, 5, 623, 626, 626}; //length == 7. lastIndex = 6

        // for(int i = 0; i < array.length; i++){
        //   System.out.println(  array[i] );
        // }


        //6. length = 10, [0,1,4,9,16,25, ... ]
        //Wygenerować tablicę z kolejnymi liczbami, które są potęgą liczby 2

        // int[] powerOfTwoArray = new int[10];

        // //pętla która generuje dane
        // for(int i = 0; i < powerOfTwoArray.length; i++){
        //   powerOfTwoArray[i] = i * i;
        // }

        // //pętla która wyświetla dane
        // for(int i = 0; i < powerOfTwoArray.length; i++){
        //   System.out.println(  powerOfTwoArray[i] );
        // }

        // //pętla która modyfikuje dane
        // for(int i = 0; i < powerOfTwoArray.length; i++){
        //   powerOfTwoArray[i] *= 100;
        // }

        // //pętla która wyświetla dane
        // for(int i = 0; i < powerOfTwoArray.length; i++){
        //   System.out.println(  powerOfTwoArray[i] );
        // }


        double[] doubleArray = new double[10];
        doubleArray[0] = 12.43;

        String[] stringArray = new String[10];
        stringArray[0] = "asdjal;";

        char[] stringAsCharArray = "Ala ma kota".toCharArray();


        //Tablice wielowymiarowe

        int[][] multiArray = new int[3][4];

        //[ [1,1,1,1], [1,1,1,1], [1,1,1,1] ]


        for (int i = 0; i < multiArray.length; i++) {

            int[] row = multiArray[0];

            for (int j = 0; j < row.length; j++) {
                multiArray[i][j] = 1;
            }

        }


        String[] userEmails = new String[100]; //last index = 99

        //w tej linijce próbujemy włożyć email na index, którt nie istnieje

        String[] temporaryLongerUserEmails = new String[200];

        for (int i = 0; i < userEmails.length; i++) {

            temporaryLongerUserEmails[i] = userEmails[i];
        }

        userEmails = temporaryLongerUserEmails;

        // System.out.println(userEmails.length);
        userEmails[100] = "abc@gmail.com";


        //dalje już możńa posługiować się tablicą userEmails, która jest dłuższa

        int[][] board = new int[3][3];

        //1- gracz pierwszt
        //2-  gracz drugi
        //0- pusta komórka

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }


    }

}
