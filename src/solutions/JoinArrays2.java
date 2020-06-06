package solutions;

public class JoinArrays2 {
    public static void main(String[] args) {
        int[] arrayLeft = {1, 2, 3, 4, 5};
        int[] arrayRight = {1, 2, 3, 4, 5};
        int[] joined = doubleArrays(arrayLeft, arrayRight);

        for (int i = 0; i < joined.length; i++) {
            System.out.println(joined[i]);
        }
    }

    //    L = 5      R
    //[1,2,3,4,5][1,2,3,4,5]
    //[1,2,3,4,5, 1,2,3,4,5]
    //            *
    public static int[] doubleArrays(int[] left, int[] right) {
        int[] newArray = new int[left.length + right.length]; // L = 10


        for (int i = 0; i < left.length; i++) {
            newArray[i] = left[i];
        }


        //i = 5 na początki, a później rośnie o 1
        for (int i = left.length; i < newArray.length; i++) { // <- L 5,6,7,8,9
            newArray[i] = right[i - left.length];
        }

        return newArray;
    }
}
