package rozwiazaniazadan;

public class ReverseString {
    public static void main(String[] args){
        String string = "Anakonda";
        reverseString(string);


    }//

    public static void reverseString(String string){
        String reversedString = "";
        for(int i=string.length()-1;i>=0;i--){
            reversedString += string.charAt(i);
        }
        System.out.println(reversedString);
    }
}
