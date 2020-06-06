package demos;

public class BasicTypes {
    public static void main(String[] args) {


        //typy prymitywne, podstawowe
        // type całkowitoliczbow
        byte b = -12; //256 -> -128 - 127
        short s = 213;
        int i = 123123; //najczęściej używany
        long l = 1231231L;

        float f = 10.0F;
//        double d = 12.213;

        boolean prawda = true;
        boolean falsz = false;

        char znak = 'A';

        //typy obiektowe
        String napis = "Ala ma kota, a kot ma Alę";

        String anotherNapis = napis.toUpperCase();

        System.out.println(anotherNapis);
        System.out.println(napis);

        Integer objectInteger = new Integer(101);

        String integerAsString = objectInteger.toString();

        Boolean objectBoolean = new Boolean(false);


        float myNumber = 25.99999F;
        int myFloatNumber = (int) myNumber;

        System.out.println(myFloatNumber);


        // String twoInString = "2dasTomek";

        // int myIntFromString = Integer.parseInt(twoInString);

        int someInt = 123;
//
//            String s = new String(someInt);
//            String s2 = Integer.valueOf(someInt);


        int someNumber = 10;

        someNumber = someNumber + 10;
        someNumber += 10; // dodanie do someNumber 10


        System.out.println(someNumber);


    }




}
