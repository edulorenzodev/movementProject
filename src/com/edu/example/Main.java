package com.edu.example;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main() {
        initUI();
    }

    private void initUI() {
        add(new Board());

        setSize(800, 600);
        setResizable(false);
        setTitle("Space Ships");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Main main = new Main();
            main.setVisible(true);
        });
    }
}