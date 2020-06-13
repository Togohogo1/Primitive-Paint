import java.awt.*;

public class Pen extends Tool {
    public Pen(Canvas canvas) {
        super(canvas);
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        // System.out.println(panel.getMouseX() + " " + panel.getMouseY());
        g.fillOval(canvas.getMouseX(), canvas.getMouseY(), 10, 10);
		g.fillOval(100, 100, 10, 10);
		// g.drawImage(MyPanel.paintImage, 0, 0, null);
    }
}
