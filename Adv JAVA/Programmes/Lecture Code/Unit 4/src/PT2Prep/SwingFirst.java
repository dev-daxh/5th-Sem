package PT2Prep;
import javax.swing.*;
import java.awt.*;
public class SwingFirst extends JFrame {
    SwingFirst() {
        // Set the title for the JFrame
        setTitle("Swing Example");
        
        // Set layout manager
        setLayout(new FlowLayout()); // Automatically arranges components

        // Create a JButton
        JButton b = new JButton("Greet");
        
        // Add button to the JFrame
        add(b);
        
        // Set size and layout
        setSize(400, 500);
        
        // Set default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Make the JFrame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create the JFrame instance
        new SwingFirst();
    }
}
