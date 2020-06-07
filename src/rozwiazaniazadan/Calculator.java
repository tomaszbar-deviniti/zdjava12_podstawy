package zadanka;

import java.math.BigInteger;

public class Calculator {
    public static void main(String[] args){
        BigInteger a = new BigInteger("123456789000102210");
        BigInteger b = new BigInteger("1824738647327682186871649184198469141941648");
        System.out.println(add(a,b));
        System.out.println(subtract(b,a));
        System.out.println(multiply(a,b));
        System.out.println(divide(b,a));
    }

    public static BigInteger add(BigInteger a, BigInteger b){
        return a.add(b);
    }

    public static BigInteger subtract(BigInteger a, BigInteger b){
        return a.subtract(b);
    }

    public static BigInteger multiply(BigInteger a, BigInteger b){
        return a.multiply(b);
    }

    public static BigInteger divide(BigInteger a, BigInteger b){
        return a.divide(b);
    }
}
