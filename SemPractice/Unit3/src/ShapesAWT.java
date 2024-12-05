import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.Flow;
public class ShapesAWT extends Frame{
    ShapesAWT()
    {
        setLayout(new FlowLayout(2));
        setSize(500,500);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(50, 50, 200, 100);

        g.setColor(Color.blue);
        g.fillRect(150, 200, 100, 100);

        g.setColor(Color.yellow);
        g.fillOval(300, 300, 100, 100);
    }
    public static void main(String[] args) {
        new ShapesAWT();
    }

}