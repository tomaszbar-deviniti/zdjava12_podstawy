package demos;

public class FibonnacciSequence {

    public static void main(String[] args) {

        //1 ,1 ,2, 3, 5, 8, 13, 21

        int numberBeforeBefore = 1;
        int numberBefore = 1;

        for (int i = 0; i < 10; i++) {
            int nextNumber = numberBeforeBefore + numberBefore;

            System.out.println(nextNumber);

            numberBeforeBefore = numberBefore;
            numberBefore = nextNumber;
        }



    }

}
