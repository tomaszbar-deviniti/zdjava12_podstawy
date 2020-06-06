package demos;

public class Arrays2 {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = array.length - 1; i >= 0; i-= 2){
            System.out.println(array[i]);
        }

        System.out.println("\n");
    }
}
