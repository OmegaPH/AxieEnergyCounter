package main.screens;

import java.applet.Applet;
import java.awt.*;

public class donation extends Applet {
    Font fnt0 = new Font("Calibri", Font.BOLD, 38);
    Font smoler = new Font("Calibri", Font.BOLD, 19);
    Font smol2 = new Font("Calibri", Font.BOLD, 27);
    Font smol = new Font("Calibri", Font.BOLD, 28);
    public Rectangle huge = new Rectangle(25, 25, 450, 555);

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(Color.BLUE);
        g2d.fill(huge);
        g.setFont(smol);
        g.setColor(Color.DARK_GRAY);
        g.drawString("You can follow me at Twitch.tv/OmegaPH", 0, 640);
        g.setColor(Color.BLACK);
        g.drawString("GCash - 09957768784 Gian S.", 28, 65);
        g.drawString("PayMaya - 09957768784 Gian S.", 28, 105);
        g.drawString("Ronin -", 28, 145);
        g.drawString("PayPal - Paypal.me/OmegaPH", 28, 215);
        g.setFont(smoler);
        g.drawString(" ronin:01422a068af62a0487784128c22783411b45834a", 28, 175);
        g.setColor(Color.WHITE);
        g.setFont(smol2);
        g.drawString("GCash - 09957768784 Gian S.", 28, 65);
        g.drawString("PayMaya - 09957768784 Gian S.", 28, 105);
        g.drawString("Ronin -", 28, 145);
        g.drawString("PayPal - Paypal.me/OmegaPH", 28, 215);
        g.setFont(smoler);
        g.drawString(" ronin:01422a068af62a0487784128c22783411b45834a", 28, 175);

        g.setFont(fnt0);
        g.setColor(Color.GREEN);
        g.drawString("THANK", 58, 315);
        g.drawString("YOU", 178, 355);
        g.drawString("SO MUCH!", 238, 395);

        g.setColor(Color.BLACK);
        g.drawString("Back", 35, 555);

    }
}

