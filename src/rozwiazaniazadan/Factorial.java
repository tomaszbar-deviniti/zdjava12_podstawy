package rozwiazaniazadan;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args){
        BigInteger number = new BigInteger("10000");
        System.out.println(factorialRecBig(number));
    }

    public static BigInteger factorial(BigInteger number){
        BigInteger result = new BigInteger("1");
        int numberAsInt = number.intValue();

        for(int i = 1; i<=numberAsInt; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger factorialTwo(BigInteger number){
        BigInteger result = new BigInteger("1");
        BigInteger i= new BigInteger("1");

        while(i.compareTo(number) <= 0) {
            result = result.multiply(i);
            i = i.add(BigInteger.valueOf(1));
        }

        return result;
    }

    public static BigInteger factorialRecBig(BigInteger number){
        return (number.compareTo(BigInteger.valueOf(1)) == 0)? BigInteger.valueOf(1) : factorialRecBig(number.subtract(BigInteger.valueOf(1))).multiply(number);
    }

    public static int factorialRec(int number) {
        return (number == 1)? 1 : factorialRec(number - 1) * number;
    }
}
