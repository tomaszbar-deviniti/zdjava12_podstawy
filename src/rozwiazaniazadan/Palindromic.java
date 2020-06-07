package zadanka;

public class Palindromic {
    public static void main(String[] args){
        System.out.println(isPalindromic(12322));
        System.out.println(isPalindromic(12321));
    }

    public static boolean isPalindromic(int number){
        String numberAsString = String.valueOf(number);
        for(int i=0,j=numberAsString.length()-1;i<numberAsString.length();i++,j--){
            if(numberAsString.charAt(i) != numberAsString.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
