import java.awt.*;
import java.awt.event.*;

public class SmileyFace extends Frame{
    SmileyFace(){
        setLayout(new FlowLayout());
        setSize(400,400);
        setTitle("AWT ");
        setVisible(true);

    }
    public void paint(Graphics g){
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 300, 300);

        g.setColor(Color.black);
        g.fillOval(150, 150, 40, 40);
        g.fillOval(220, 150, 40, 40);

        g.drawArc(150, 200, 100, 50, 0, -180);


    }
    public static void main(String[] args) {
        new SmileyFace();
    }
}