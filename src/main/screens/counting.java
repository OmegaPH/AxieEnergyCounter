package main.screens;

import java.awt.*;
import main.system.numbers;

public class counting {
    numbers numbers;
    final int WIDTH = 500, HEIGHT = 650;
    Font fnt0 = new Font("Calibri", Font.BOLD, 38);
    Font big = new Font("Calibri", Font.BOLD, 48);
    Font smoler = new Font("Calibri", Font.BOLD, 19);
    Font smol = new Font("Calibri", Font.BOLD, 28);
    public Rectangle Sused = new Rectangle(134, 300, 225, 60);
    public Rectangle Sgained = new Rectangle(134, 400, 245, 60);
    public Rectangle Sdestroyed = new Rectangle(134, 500, 265, 60);
    public Rectangle donate = new Rectangle(325, 580, 165, 54);

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setFont(big);
        g.setColor(Color.WHITE);
        g.drawString("Enemy Energy", 105, 50);
        g.setColor(Color.RED);
        g2d.draw(Sused);
        g2d.draw(Sgained);
        g2d.draw(Sdestroyed);
        g.setColor(Color.blue);
        g2d.draw(donate);
        g.setColor(Color.WHITE);
        ((Graphics2D) g).fill(Sused);
        ((Graphics2D) g).fill(Sgained);
        ((Graphics2D) g).fill(Sdestroyed);
        ((Graphics2D) g).fill(donate);
        g.setColor(Color.blue);
        g.setFont(fnt0);
        g.drawString("End Turn", 175, 197);
        g.setColor(Color.green);
        g.drawString("Reset", 200, 260);

        g.setFont(smol);
        g.setColor(Color.black);
        g.setFont(big);
        g.drawString("-", 95, 340);
        g.drawString("-", 95, 440);
        g.drawString("-", 95, 540);

        g.drawString("+", 375, 340);
        g.drawString("+", 395, 440);
        g.drawString("+", 410, 540);

        g.setColor(Color.pink);
        g.setFont(smoler);
        g.drawString("Support our work :D", 328, 608);

    }
}
