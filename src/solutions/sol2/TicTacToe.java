package solutions.sol2;

import java.util.Scanner;

public class TicTacToe {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Witaj w grze, podaj rozmiar planszy: ");
        int wymiar = scanner.nextInt();

        char obecnySymbol = 'X';

        char[][] plansza = new char[wymiar][wymiar];
//                        {{'X', 'O', 'O'},
//                        {'X', ' ', ' '},
//                        {'O', 'X', ' '}};

        boolean czyKontynuowac = true;
        int licznikRuchów = 0;
        while (czyKontynuowac && licznikRuchów <= wymiar * wymiar) {
            TicTacToe.drukujPlansze(plansza);
            boolean ruchPoprawny = wykonajRuch(plansza, obecnySymbol);
            if (ruchPoprawny) {
                licznikRuchów++;
                boolean wygranaWiersze = sprawdzWiersze(plansza, obecnySymbol);
                boolean wygranaKolumny = sprawdzKolumny(plansza, obecnySymbol);
                boolean wygranaSkos1 = sprawdzSkos1(plansza, obecnySymbol);
                // boolean wygranaSkos2 = sprawdzSkos2(plansza, obecnySymbol);
                if (wygranaKolumny || wygranaWiersze || wygranaSkos1) {
                    System.out.println("Wygrałeś " + obecnySymbol);
                    czyKontynuowac = false;
                }
                obecnySymbol = obecnySymbol == 'X' ? 'O' : 'X';
            }
        }

    }

    public static boolean sprawdzWiersze(char[][] plansza, char symbol) {
        int wymiar = plansza.length;

        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            boolean wygrana = true;
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                return true;
            }
        }

        return false;
    }

    public static boolean sprawdzKolumny(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int kolumna = 0; kolumna < wymiar; kolumna++) {
            boolean wygrana = true;
            for (int wiersz = 0; wiersz < wymiar; wiersz++) {
                if (plansza[wiersz][kolumna] != symbol) {
                    wygrana = false;
                    break;
                }
            }
            if (wygrana) {
                return true;
            }
        }
        return false;
    }

    static boolean sprawdzSkos1(char[][] plansza, char symbol) {
        int wymiar = plansza.length;
        for (int i = 0; i < wymiar; i++) {
            if (plansza[i][i] != symbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean wykonajRuch(char[][] plansza, char symbol) {
        System.out.println(symbol + " twój ruch");
        System.out.println("Podaj indeks wiersza");
        int wiersz = new Scanner(System.in).nextInt();
        System.out.println("Podaj indeks kolumny");
        int kolumna = new Scanner(System.in).nextInt();
        boolean ruchPoprawny = plansza[wiersz][kolumna] == 0;
        if (!ruchPoprawny) {
            System.out.println("Ruch niepoprawny");
            return false;
        }
        plansza[wiersz][kolumna] = symbol;
        return true;
    }

    public static void drukujPlansze(char[][] plansza) {
        int wymiar = plansza.length;
        //naglowki komlumn
        System.out.print("\t");
        //petla drukujaca naglowki
        for (int i = 0; i < wymiar; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        //drukowanie wierszy
        for (int wiersz = 0; wiersz < wymiar; wiersz++) {
            System.out.print(wiersz + ":\t");
            for (int kolumna = 0; kolumna < wymiar; kolumna++) {
                System.out.print(plansza[wiersz][kolumna] + "\t");
            }
            System.out.println();
        }
    }


}
