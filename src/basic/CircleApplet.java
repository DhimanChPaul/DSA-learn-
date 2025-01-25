package basic;

import java.applet.*;
import java.awt.*;
//import java.awt.Graphics;

public class CircleApplet extends Applet{
    public void init() {
        setBackground(Color.CYAN);
        setSize(120, 120);
    }

    public void paint(Graphics g) {
        int x = getSize().width / 2;
        int y = getSize().height / 2;
        int radius = 50;

        g.setColor(Color.MAGENTA);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
