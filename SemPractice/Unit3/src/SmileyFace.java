import java.awt.*;
import java.awt.event.*;

public class SmileyFace extends Frame {

    // Constructor to set up the frame
    public SmileyFace() {
        // Set the title of the frame
        setTitle("AWT Smiley Face");

        // Set the size of the frame
        setSize(400, 400);

        // Set the frame visibility to true
        setVisible(true);
        
        // Add a window listener to handle the close button
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0); // Exit the program when the window is closed
            }
        });
    }

    // Override the paint method to draw the smiley face
    public void paint(Graphics g) {
        // Set the color for the face (Yellow)
        g.setColor(Color.YELLOW);
        // Draw the face (a large circle)
        g.fillOval(100, 100, 200, 200);

        // Set the color for the eyes (Black)
        g.setColor(Color.BLACK);
        // Draw the left eye
        g.fillOval(150, 150, 30, 30);
        // Draw the right eye
        g.fillOval(220, 150, 30, 30);

        // Set the color for the smile (Black)
        g.setColor(Color.BLACK);
        // Draw the smile using an arc
        g.drawArc(150, 200, 100, 50, 0, -180); // x, y, width, height, startAngle, arcAngle
    }

    // Main method to create the frame
    public static void main(String[] args) {
        // Create an instance of the SmileyFace class
        new SmileyFace();
    }
}
