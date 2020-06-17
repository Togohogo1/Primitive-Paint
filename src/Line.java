import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Line extends Tool {
    public int x1 = -10, y1 = -10;
    public int x2 = 0, y2 = 0;

    public void mouseDragged(MouseEvent event) {
        this.x2 = event.getX();
        this.y2 = event.getY();
        Canvas.shapes.set(Canvas.shapes.size()-1, new InfoPen(x1, y1, x2, y2, Topbar.thicknessValue, Sidebar.currentColor));
    }
    
    public void mousePressed(MouseEvent event) {
        this.x1 = this.x2 = event.getX();
        this.y1 = this.y2 = event.getY();
        Canvas.shapes.add(new InfoPen(x1, y1, x2, y2, Topbar.thicknessValue, Sidebar.currentColor));
    }

    public void mouseReleased(MouseEvent event) {

    }
}
