package demos;

public class Day2Exercises {

    public static void main(String[] args) {

        double[] array1 = new double[10]; //długość
        double[] array2 = new double[10];

        String wiersz = "Ala ma kota!";
        String resztaWiersza = " A kot ma Alę";

        String calyWiersz = wiersz + resztaWiersza;

        //1,2,3 + 4,5,6 => 1,2,3,4,5,6

    }

    static int[] generateTenths(){

        //[0, 10, 20, 30, 40,50 ... 90]
        return null;
    }


    static int[] getMinAndMaxValues(int[] array) {
        if(array.length == 0){
            return null;
        }

        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Min wartość tablicy: " + min);
        System.out.println("Max wartość tablicy: " + max);

        int[] resultArray = {min, max};

        return resultArray;
    }


}
