import java.awt.Graphics;
import java.awt.*;

public class InfoPen extends InfoTool {
    protected int startX, startY, endX, endY;
    protected Color colour;
	protected int brushWidth;
    
    public InfoPen(int startX, int startY, int endX, int endY, int brushWidth, Color colour) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
        this.brushWidth = brushWidth;
        this.colour = colour;
    }

    public void draw(Graphics graphics) {
        graphics.setColor(colour);
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setStroke(new BasicStroke(brushWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        graphics.drawLine(startX, startY, endX, endY);
    }
}
