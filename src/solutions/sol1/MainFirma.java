package solutions.sol1;

public class MainFirma {

    public static void main(String[] args) {

        Pracownik pracownik = new Pracownik("Krysia", "8349238483", 'f', 12);

        boolean women = pracownik.isWomen();

        System.out.println(women);

    }
}
