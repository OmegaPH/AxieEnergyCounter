package main.system;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class numbers extends Applet implements MouseListener {
    Font smol = new Font("Calibri", Font.BOLD, 28);
    Font big = new Font("Calibri", Font.BOLD, 58);
    private String btn1 = "Energy Used: ";
    private String btn2 = "Energy Gained: ";
    private String btn3 = "Energy Destroyed: ";

    private int used;
    private int gained;
    private int destroyed;
    private int energy = 3;

   public static boolean plusUse = false;
   public static  boolean minusUse = false;
   public static boolean plusGain = false;
   public static  boolean minusGain = false;
   public static boolean plusDestroy = false;
   public static  boolean minusDestroy = false;
   public static boolean restart = false;
   public static boolean endTurn = false;



    public void draw(Graphics g) {
        if (energy <= 0) {
            energy = 0;
        }
        if (plusUse) {
            used++;
            plusUse = false;
        }
        if (minusUse) {
            used--;
            minusUse = false;
        }
        if (plusGain) {
            gained++;
            plusGain = false;
        }
        if (minusGain) {
            gained--;
            minusGain = false;
        }
        if (plusDestroy) {
            destroyed++;
            plusDestroy = false;
        }
        if (minusDestroy) {
            destroyed--;
            minusDestroy = false;
        }
        if (restart) {
            energy = 3;
            used = 0;
            gained = 0;
            destroyed = 0;
            restart = false;
        }
        if (endTurn) {
            energy = energy + 2 + gained - destroyed - used;
            used = 0;
            gained = 0;
            destroyed = 0;
            endTurn = false;
        }
            g.setFont(smol);
            g.setColor(Color.black);
            g.drawString(btn1 + used, 144, 335);
            g.drawString(btn2 + gained, 144, 435);
            g.drawString(btn3 + destroyed, 144, 535);

            g.setFont(big);
            g.setColor(Color.red);
            g.drawString(String.valueOf(energy),234, 138);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        //System.out.println(x + " " + y);

        if (Main.State == Main.STATE.START) {
            if (x > 377 && x < 397) { //+used
                if (y > 317 && y < 337) {
                    plusUse = true;
                }
            } else if (x > 95 && x < 110) { //-used
                if (y > 324 && y < 332) {
                    minusUse = true;
                }
            }
            else if (x > 397 && x < 417) { //+gain
                if (y > 417 && y < 437) {
                    plusGain = true;
                }
            }
            if (x > 95 && x < 110) { //-gain
                if (y > 424 && y < 432) {
                    minusGain = true;
                }
            }
            else if (x > 417 && x < 437) { //+des
                if (y > 517 && y < 537) {
                    plusDestroy = true;
                }
            }
            if (x > 95 && x < 110) { //-des
                if (y > 524 && y < 532) {
                    minusDestroy = true;
                }
            }
            else if (x > 200 && x < 290) { //reset
                if (y > 234 && y < 264) {
                    restart = true;
                }
            }
            if (x > 176 && x < 315) { //reset
                if (y > 170 && y < 198) {
                    endTurn = true;
                }
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
