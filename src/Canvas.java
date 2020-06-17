import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Canvas extends JPanel implements MouseMotionListener, MouseListener {
    // public static int[] temp = new int[6];
    public static ArrayList<InfoTool> shapes = new ArrayList<>();
    // private Pen pen1 = new Pen(this);
    // private Eraser eraser1 = new Eraser(this);
    // private Tool currentTool = pen1;
    private static int x = -10, y = -10;

    public static Mouse eraser = new Eraser();
    public static Mouse pen1 = new Pen();
    public static Mouse line1 = new Line();
    public static Mouse rect1 = new Rectangle();
    public static Mouse oval1 = new Oval();

    public static Mouse curr = pen1;
    
    public Canvas() {
        this.setBackground(Color.WHITE);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println(Sidebar.currentToolID);
        this.curr.mouseDrag(shapes, e);
        this.repaint();
    }

    public void mousePressed(MouseEvent e){
        this.curr.mouseDown(shapes, e);
        System.out.println(shapes);
        this.repaint();
    }

    public void mouseReleased(MouseEvent e){
        this.curr.mouseUp(shapes, e);
        System.out.println(Sidebar.currentToolID);
        this.repaint();
    }

    public void mouseMoved(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e){
        // flag = true;
        // System.out.println("click2");
    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (InfoTool i : shapes) {
            i.draw(g);
        }
    }
}
