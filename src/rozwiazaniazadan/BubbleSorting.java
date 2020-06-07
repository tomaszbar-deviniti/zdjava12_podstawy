package zadanka;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args){
        int[] array = {9,3,5,7,232,8,67,4765,452,3,865,3};
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array){
        int[] sortedArray = new int[array.length];
        int temp;
        while(!Arrays.equals(sortedArray,array)){
            sortedArray = Arrays.copyOf(array,array.length);
            for(int j=array.length-1;j>0;j--) {
                for (int i = 0; i < j; i++) {
                    if (array[i] > array[i + 1]) {
                        temp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = temp;
                    }
                }
            }
        }
        return sortedArray;
    }
}
