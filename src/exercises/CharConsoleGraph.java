package exercises;

public class CharConsoleGraph {

    public static void main(String[] args) {
        char start = 97;
        char end = 107;

        for (int i = start; i < end; i++) {
            printLetterGraphLine((char) i, i);
        }

    }

    private static void printLetterGraphLine(char letter, int occurences){
        System.out.print(letter + " :");
        for (int i = 0; i < occurences; i++) {
            System.out.print("|");
        }
        System.out.println();
    }
}
