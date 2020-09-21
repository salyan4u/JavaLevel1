package Lesson8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import static java.lang.System.exit;


public class TicTaeToe {

    public static final int size = 5;
    public static final char[][] field = new char[size][size];
    public static final Random random = new Random();
    public static int winValue = 1;
    public static int fullValue = 0;
    public static final char symbolX = 'X';
    public static final char symbol0 = '0';
    public static MyWindow mainwindow = new MyWindow();

    public static void main(String[] args) {
        dotFill();
        Turn();
    }

    private static void checkWin(char symbol) {
        checkLines(symbol);
        checkColumns(symbol);
        checkMainDiagonal(symbol);
        checkSideDiagonal(symbol);
    }

    private static void checkFull() {
        for (char[] chars : field) {
            for (char aChar : chars) {
                if (aChar == symbolX || aChar == symbol0) fullValue++;
            }
        }
        if (fullValue == 25) {
            JOptionPane.showMessageDialog(null, "Draw");
            exit(0);
        } else {
            fullValue = 0;
        }
    }

    private static void checkSideDiagonal(char symbol) {
        for (int i = 0; i < field.length - 1; i++) {
            if ((field[i][field.length - 1 - i] == field[i + 1][field.length - 2 - i]) && (field[i][field.length - 1 - i] == symbol)) {
                winValue++;
            }
        }
        if (winValue < 4) {
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
                winValue = 1;
            }
        }
    }

    private static void aiTurn() {
        do {
            int coordX = random.nextInt(5);
            int coordY = random.nextInt(5);
            if (field[coordX][coordY] == symbolX || field[coordX][coordY] == symbol0) continue;
            else {
                field[coordX][coordY] = symbol0;
                MyWindow.jbs[coordX][coordY].setText(String.valueOf(symbol0));
            }
            break;
        } while (true);

    }

    private static void Turn() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int finalI = i;
                int finalJ = j;
                MyWindow.jbs[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (field[finalI][finalJ] == symbolX || field[finalI][finalJ] == symbol0) {
                            JOptionPane.showMessageDialog(null, "Cell is not empty");
                        } else {
                            checkWin(symbolX);
                            if (winValue >= 4) {
                                JOptionPane.showMessageDialog(null, "You won AI");
                                exit(0);
                            }
                            field[finalI][finalJ] = symbolX;
                            MyWindow.jbs[finalI][finalJ].setText(String.valueOf(symbolX));
                            checkWin(symbolX);
                            if (winValue >= 4) {
                                JOptionPane.showMessageDialog(null, "You won AI");
                                exit(0);
                            }
                            checkFull();
                            aiTurn();
                            checkWin(symbol0);
                            if (winValue >= 4) {
                                JOptionPane.showMessageDialog(null, "AI won you");
                                exit(0);
                            }
                            checkFull();
                        }
                    }
                });
            }
        }
    }

    private static void dotFill() {
        for (char[] row : field) {
            Arrays.fill(row, '.');
        }
    }

}
