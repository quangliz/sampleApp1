package sampleApp1;

import javax.swing.*;

public class WINDOW extends JFrame {
    final int WIDTH = 350;
    final int HEIHGT = 250;

    public WINDOW() {
        setTitle("Window");
        setSize(WIDTH, HEIHGT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
