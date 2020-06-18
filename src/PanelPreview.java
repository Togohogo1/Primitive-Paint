import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PanelPreview extends JPanel {
    public PanelPreview() {
        this.setPreferredSize(new Dimension(34, 34));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int s = PanelTopbar.thicknessValue;

        // Crosshair (better show transparency)
        g2d.drawLine(17, 1, 17, 14);
        g2d.drawLine(1, 17, 14, 17);
        g2d.drawLine(17, 20, 17, 34);
        g2d.drawLine(20, 17, 34, 17);

        g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setColor(PanelSidebar.currentColor);
        g2d.fill(new Ellipse2D.Double(17-s/2.0, 17-s/2.0, s, s));

    }
}
