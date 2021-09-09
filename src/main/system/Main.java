package main.system;


import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

import main.screens.counting;
import main.screens.donation;
import main.system.numbers;

public class Main extends Applet implements Runnable {
    static int WIDTH = 500, HEIGHT = 650;
    private Image i;
    private Graphics g2;
    Thread thread;
    counting counting;
    numbers numbers;
    donation donation;

    public enum STATE {
        MENU,
        START,
        DONATION
    }

    public static STATE State = STATE.MENU;

    public static void main(String[] args) {
        // create and set up the applet
        Main applet = new Main();
        applet.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        applet.init();

        // create a frame to host the applet, which is just another type of Swing Component
        JFrame mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the applet to the frame and show it
        mainFrame.getContentPane().add(applet);
        mainFrame.pack();
        mainFrame.setVisible(true);

        // Start the applet
        applet.start();
    }

    public void init () {
        donation = new donation();
        numbers = new numbers();
        counting = new counting();
        this.resize(WIDTH, HEIGHT);
        this.addMouseListener(new MouseInputs());
        this.addMouseListener(new numbers());
        thread = new Thread(this);
        thread.start();
    }

    public void paint (Graphics g) {
        if (State == STATE.MENU) {
            g.setColor(Color.GRAY);
            g.fillRect(0, 0, WIDTH, HEIGHT);
            g.setColor(Color.WHITE);
            Font fnt0 = new Font("Default", Font.PLAIN, 25);
            Font smol = new Font("Default", Font.PLAIN, 14);
            g.setFont(fnt0);
            g.drawString("Click Anywhere to Start", 120, 300);
            g.drawString("v1.0", 0, 615);
            g.setColor(Color.red);
            g.setFont(smol);
            g.drawString("Sharing this software violates our License of Agreement, DO NOT SHARE.", 0, 640);
        } else if (State == STATE.START) {
                g.setColor(Color.orange);
                g.fillRect(0, 0, WIDTH, HEIGHT);
                counting.paint(g);
                numbers.draw(g);
        } else if (State == STATE.DONATION) {
            g.setColor(Color.BLUE);
            donation.paint(g);
        }
    }


    public void update (Graphics g){
        if (i == null) {
            i = createImage(getHeight(), getHeight());
        }
        g2 = i.getGraphics();

        g2.setColor(getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());

        g2.setColor(getForeground());
        paint(g2);
        g.drawImage(i, 0, 0, null);
        paint(g2);
    }

    public void run () {
        for (; ; ) {
            repaint();

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}