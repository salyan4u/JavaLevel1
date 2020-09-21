package Lesson8;

import javax.swing.*;
import java.awt.*;


public class MyWindow extends JFrame {
    public static int size = TicTaeToe.size;
    public static JButton[][] jbs = new JButton[size][size];

    public MyWindow() {
        setBounds(500, 500, 500, 500);
        setTitle("TicTaeToe game");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(size, size));
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                jbs[i][j] = new JButton(".");
                add(jbs[i][j]);
            }
        }
        setVisible(true);
    }
}