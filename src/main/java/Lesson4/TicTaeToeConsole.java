package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class TicTaeToeConsole {

    public static final int size = 5;
    public static final char[][] field = new char[size][size];
    public static final Scanner scanner = new Scanner(System.in);
    public static final Random random = new Random();
    public static int winValue = 1;
    public static int fullValue = 0;
    public static final char symbolX = 'X';
    public static final char symbol0 = '0';
    public static int aiValueBlock;

    public static void main(String[] args) {
        printLines();
        dotFill();
        printRowsAndDots();
        playGame();
    }

    private static void playGame() {
        do {
            humanTurn();
            checkWin(symbolX);
            if (winValue >= 4) {
                printLines();
                printRowsAndDots();
                System.out.println("You won AI!");
                break;
            }
            if (checkFull()) {
                printLines();
                printRowsAndDots();
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            checkWin(symbol0);
            if (winValue >= 4) {
                printLines();
                printRowsAndDots();
                System.out.println("AI won you!");
                break;
            }
            if (checkFull()) {
                printLines();
                printRowsAndDots();
                System.out.println("Draw!");
                break;
            }
            printLines();
            printRowsAndDots();
        } while (true);
    }

    private static void checkWin(char symbol) {
        checkLines(symbol);
        checkColumns(symbol);
        checkMainDiagonal(symbol);
        checkSideDiagonal(symbol);
    }

    private static boolean checkFull() {
        for (char[] chars : field) {
            for (char aChar : chars) {
                if (aChar == symbolX || aChar == symbol0) fullValue++;
            }
        }
        if (fullValue == 25) {
            return true;
        } else {
            fullValue = 0;
            return false;
        }
    }

    private static void checkSideDiagonal(char symbol) {
        for (int i = 0; i < field.length - 1; i++) {
            if ((field[i][field.length - 1 - i] == field[i + 1][field.length - 2 - i]) && (field[i][field.length - 1 - i] == symbol)) {
                winValue++;
            }
        }
        if (winValue < 4) {
            aiValueBlock = winValue;
            winValue = 1;
        }
    }

    private static void checkMainDiagonal(char symbol) {
        for (int j = 0; j < field.length - 1; j++) {
            if ((field[j][j] == field[j + 1][j + 1]) && (field[j][j] == symbol)) {
                winValue++;
            }
        }
        if (winValue < 4) {
            aiValueBlock = winValue;
            winValue = 1;
        }
    }

    private static void checkColumns(char symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < field.length - 1; j++) {
                if ((field[j][i] == field[j + 1][i]) && (field[j][i] == symbol)) {
                    winValue++;
                }
            }
            if (winValue < 4) {
                aiValueBlock = winValue;
                winValue = 1;
            }
        }
    }

    private static void checkLines(char symbol) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < field.length - 1; j++) {
                if ((field[i][j] == field[i][j + 1]) && (field[i][j] == symbol)) {
                    winValue++;
                }
            }
            if (winValue < 4) {
                aiValueBlock = winValue;
                winValue = 1;
            }
        }
    }

    private static void aiTurn() {
        do {
            int coordX = random.nextInt(5);
            int coordY = random.nextInt(5);
            if (field[coordX][coordY] == symbolX || field[coordX][coordY] == symbol0) continue;
            else field[coordX][coordY] = symbol0;
            break;
        } while (true);

    }

    private static void humanTurn() {
        int coordX = -1, coordY = -1;
        System.out.println("Enter coordinates x y:");
        do {
            String[] string = scanner.nextLine().split(" ");
            if (string.length != 2) {
                System.out.println("Incorrect data!");
                continue;
            }
            try {
                coordY = Integer.parseInt(string[0]) - 1;
                coordX = Integer.parseInt(string[1]) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Incorrect data!");
            }
            if (coordX > size || coordX < 0 || coordY > size || coordY < 0) {
                System.out.println("Incorrect data!");
                continue;
            }
            if (field[coordX][coordY] == symbolX || field[coordX][coordY] == symbol0) {
                System.out.println("Cell is not empty!");
                continue;
            } else field[coordX][coordY] = symbolX;
            break;
        } while (true);
    }

    private static void printLines() {
        System.out.print(" ");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
    }

    private static void dotFill() {
        for (char[] row : field) {
            Arrays.fill(row, '.');
        }
    }

    private static void printRowsAndDots() {
        for (int i = 0; i < field.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}