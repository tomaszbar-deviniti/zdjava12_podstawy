package solutions.sol3;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int BOARD_SIZE = 3; //<-można wyciągać stałe programu do statycznych stałych jak tutaj
    static Scanner scanner = new Scanner(System.in); //<- wykorzystanie statycznego skanera! super :)

    //bardzo przejrzyście i ładnie znazwane zmienne :)
    private String[][] board;
    private String winner;
    private String playerSign;
    private String computerSign;


    public TicTacToe() {
        this.board = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    }

    //plus za przejrzyste opisy. na prawdę wygodnie się gra. opisy można zgrupować do osobnych metod,

    public void play() {

        chooseSign(); // wciągnąłbym tego while do tej metody, bo ta pętla jest jakby częścią prcoesu "wybirania znaku"

        showInstructions();

        while (!checkBoard()) {
            System.out.println("Podaj numer komórki");
            while (!addSignToBoard(scanner.nextInt())) ;
            if (checkBoard()) {
                printBoard();
                continue;
            }
            computerAddSign();
            printBoard();
        }
        System.out.println(gameResult());
    }

    private void showInstructions() {
        System.out.println("Grasz poprzez podawanie numeru komórki na planszy\n" +
                "---------\n" +
                "|1  2  3|\n" +
                "|4  5  6|\n" +
                "|7  8  9|\n" +
                "---------");
        System.out.println("Zaczynamy!");
    }

    private void chooseSign() {
        System.out.println("Witaj w grze kółko i kryżyk!\n" +
                "Wybierz czym chcesz grać (X lub O)");

        String playerChoice = "";
        while (!(playerChoice.equals("X") || playerChoice.equals("O"))) {
            playerChoice = scanner.nextLine();
            if (playerChoice.equals("X")) {
                playerSign = "X";
                computerSign = "O";
            } else if (playerChoice.equals("O")) {
                playerSign = "O";
                computerSign = "X";
            } else {
                System.out.println("Podano nieprawidłowy znak");
            }
        }
    }

    private boolean checkBoard() {
        //w tym przypadku nazwy zmiennych, mimo tego, że są skrótowe, to całkiem dobrze oddając czym są
        //można by tą metodę "pociąć na mniejsze" (sprawdzenie wierszy i kolumn w osobnych metodach)
        //


        int wheel = 0, cross = 0, w_win = 0, c_win = 0;
        // Przeszukiwanie wierszy
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j].equals("O")) {
                    wheel++;
                } else if (board[i][j].equals("X")) {
                    cross++;
                }
            }
            if (wheel == BOARD_SIZE) {
                w_win = 1;
            } else if (cross == BOARD_SIZE) {
                c_win = 1;
            }
            wheel = 0;
            cross = 0;
        }
        // Przeszukiwanie kolumn
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i].equals("O")) {
                    wheel++;
                } else if (board[j][i].equals("X")) {
                    cross++;
                }
            }
            if (wheel == BOARD_SIZE) {
                w_win = 1;
            } else if (cross == BOARD_SIZE) {
                c_win = 1;
            }
            wheel = 0;
            cross = 0;
        }
        // Przeszukiwanie przekątnych
        for (int i = 0; i < board.length; i++) {
            if (board[i][i].equals("O")) {
                wheel++;
            } else if (board[i][i].equals("X")) {
                cross++;
            }
        }
        if (wheel == BOARD_SIZE) {
            w_win = 1;
        } else if (cross == BOARD_SIZE) {
            c_win = 1;
        }
        wheel = 0;
        cross = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i].equals("O") && j + i == 2) {
                    wheel++;
                } else if (board[j][i].equals("X") && j + i == 2) {
                    cross++;
                }
            }
            if (wheel == BOARD_SIZE) {
                w_win = 1;
            } else if (cross == BOARD_SIZE) {
                c_win = 1;
            }
        }
        // Sprawdzenie wyniku
        if (w_win == 1) {
            winner = "O";
            return true;
        } else if (c_win == 1) {
            winner = "X";
            return true;
        } else {
            return false;
        }
    }

    private String gameResult() {
        return (winner.equals(playerSign)) ? "Wygrałeś" : "Przegrałeś";
    }

    private void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private boolean addSignToBoard(int index) {
        int firstIndex = 0;
        int secondIndex = index - 1;
        if (index > 9 || index < 1) {
            System.out.println("Podano nieprawidłowy numer komórki");
            return false;
        }
        if (index > 6) {
            secondIndex -= 6;
            firstIndex = 2;
        } else if (index > 3 && index <= 6) {
            secondIndex -= 3;
            firstIndex = 1;
        }
        if (!board[firstIndex][secondIndex].equals(" ")) {
            System.out.println("Komórka została już użyta");
            return false;
        } else {
            board[firstIndex][secondIndex] = playerSign;
            return true;
        }
    }

    private void computerAddSign() {
        int computerIndex = new Random().nextInt(9) + 1; //można troszkę prościej
        int firstIndex = 0;
        int secondIndex = computerIndex - 1;
        if (computerIndex > 6) {
            secondIndex -= 6;
            firstIndex = 2;
        } else if (computerIndex > 3 && computerIndex <= 6) {
            secondIndex -= 3;
            firstIndex = 1;
        }
        if (!board[firstIndex][secondIndex].equals(" ")) {
            computerAddSign();
        } else {
            board[firstIndex][secondIndex] = computerSign;
        }
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.play();
    }
}