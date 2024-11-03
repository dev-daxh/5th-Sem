package PT2Prep;
import javax.swing.*;
import java.awt.*;

public class LabelIcon extends JFrame {
    LabelIcon(){
        setLayout(new FlowLayout());
        setSize(400,500);
        JLabel lab = new JLabel("Good Morning!!");
        add(lab);

        JLabel labicon = new JLabel(new ImageIcon("src/PT2Prep/WhatsApp Image 2024-10-04 at 00.20.35.jpeg"));
        add(labicon);

        setVisible(true);
    }    
    public static void main(String[] args) {
        new LabelIcon();
    }
}
