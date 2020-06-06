package solutions;

import java.util.Random;

public class JoinArrays {



    //[1,2,3,4][6,7,8,9]
    //[1,2,3,4, 6,7,8,9]

    //zdanie polega na ty, żeby połączyć dwie tablice "w jedeno" :)

    int[] joinArrays(int[] left, int[] right){

        int[] result = new int[left.length + right.length];

        //
        for (int i = 0; i < result.length; i++) {

            if(i<left.length){
                result[i] = left[i];
            }else {
                //resta rozwiązania
            }

        }


        return result;
    }

}
