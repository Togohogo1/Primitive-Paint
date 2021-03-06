import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;

public class DrawRect extends DrawShape {
    public DrawRect(int startX, int startY, int width, int height, int brushWidth, Color color, Boolean filled) {
        super(startX, startY, width, height, brushWidth, color, filled);
    }

    public void draw(Graphics graphics) {
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(brushWidth));

        // Creates a filled or empty rectangle based on the filled boolean variable
        if (filled)
            g2d.fillRect(startX, startY, width, height);
        else
            g2d.drawRect(startX, startY, width, height);
    }
}
