package rozwiazaniazadan;

public class SitoErastotenesa {
    public static void main(String[] args){
        getPrimeNumbersTo(100);

    }

    public static void getPrimeNumbersTo(int number){
        boolean[] logicArray = new boolean[number+1];
        for(int i=0;i<logicArray.length;i++){
            logicArray[i] = true;
        }

        for(int i=2;i<=Math.sqrt(number);i++){
            if(logicArray[i] == true){
                for(int j=2;j<=number;j++){
                    if(i*j <logicArray.length) {
                        logicArray[j * i] = false;
                    }
                }
            }
        }
        for(int i=2;i<logicArray.length;i++){
            if(logicArray[i] == true){
                System.out.println(i);
            }
        }
    }

}
