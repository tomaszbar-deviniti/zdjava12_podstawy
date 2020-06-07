package zadanka;

public class DecimalToBinary {
    public static void main(String[] args){
        System.out.println(decimalToBinary(-128));
    }


    public static String decimalToBinary(int number){
        String binaryResult = "";
        int i =0;
        while(Math.abs(number) >= Math.pow(2,i)){
            i++;
        }
        int[] binaryRepresentation = new int[i+1];
        if(number < 0){
            binaryRepresentation[0] = 1;
        }
        number = Math.abs(number);
        for(int j=--i;number>0;j--){
            if(Math.pow(2,j) <= number){
                binaryRepresentation[binaryRepresentation.length-j-1] = 1;
                number -= Math.pow(2,j);
            }
        }
        for(int j=0;j<binaryRepresentation.length;j++){
            binaryResult += binaryRepresentation[j];
        }
        return binaryResult;
    }
}
