package com.edu.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Sprite {
    private int dx = 0;
    private int dy = 0;
    private int x = 0;
    private int y = 0;
    private int width;
    private int height;
    private Image image;

    public Sprite() {
        loadImage();
    }

    public void loadImage() {
        ImageIcon imageIcon = new ImageIcon("resources/spaceship.png");
        image = imageIcon.getImage().getScaledInstance(60,60, Image.SCALE_SMOOTH);

        width = imageIcon.getIconWidth();
        height = imageIcon.getIconHeight();
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 2;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -2;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Image getImage() {
        return image;
    }
}