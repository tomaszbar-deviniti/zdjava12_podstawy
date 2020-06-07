package zadanka;


import java.util.Arrays;

public class Swap {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,0};
        showArrayTwo(array);
        System.out.println();
        System.out.println(Arrays.toString(swapArray(array,2,8)));
        printSumsOfArray(array);
    }

    public static void showArray(int[] array){
        for(int i=0,j=array.length-1;i<=j;i++,j--){
            if(i == j){
                System.out.println(array[i]);
            }else {
                System.out.print(array[i] + ", " + array[j] + ", ");
            }
        }
    }

    public static void showArrayTwo(int[] array){
        for(int i=0,j=array.length-1;i<array.length;i++,j--){
            System.out.print(array[i] + ", " + array[j] + ", ");

        }
    }

    public static void printSumsOfArray(int[] array){
        if(array.length % 2 == 1 || array.length == 0){
            System.out.println("Tablica ma niewłaściwą liczbę elementów");
        }else{
            for(int i=0,j=1;j<array.length;i+=2,j+=2){
                System.out.println(array[i] + array[j]);
            }
        }
    }

    public static int[] swapArray(int[] array,int fromIndex, int toIndex){
        int[] newArray = new int[array.length];
        for(int i=0;i<array.length;i++){
            if(i == fromIndex || i == toIndex){
                newArray[toIndex] = array[fromIndex];
                newArray[fromIndex] = array[toIndex];
            }else{
                newArray[i] = array[i];
            }
        }
        return newArray;
    }
}
