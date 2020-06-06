package demos;

public class Arrays {


    public static void main(String[] args) {

        //1. Wyświetl wartości na indeksach parzystych

        int[] array = {10, 121, 3122, 1233, 1234, 1235, 3126, 327}; //length == 8, lastIndex == 7

        //i = 0 OK
        //i = 2 OK
        //i = 4 PK
        //i == 6 OK <===== 7
        //i == 8 NOT OK <=====


        for (int i = 0; i < array.length; i+=2) {
            System.out.println(array[i]);
        }

        //2. Wyświetl wartości na indeksach parzystych od końca tablicy
        int[] tab = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = tab.length-1; i >= 0; i--) {
            if (i % 2 == 0 && i != 0) {
                System.out.println(tab[i]);
            }
        }

        //3. Inne rozwiązanie


        //0,1,2,3,4,5,6 <-nieprzysta ilość elementów ---> length - 1
        //0,1,2,3,4,5,6,7 <-przysta ilość elementów ---> length - 2

        int length = tab.length;

        boolean arrayIsEven = length % 2 == 0;

        int startIndex = 0;

        if(arrayIsEven){
            startIndex = tab.length - 2;
        }else {
            startIndex = tab.length - 1;
        }

        for (int i = startIndex; i >=0 ; i-=2) {
            System.out.println(tab[i]);
        }
    }
}
