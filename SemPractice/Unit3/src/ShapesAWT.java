import java.awt.*;
import java.awt.event.*;

public class ShapesAWT extends Frame {

    // Constructor to set up the frame
    public ShapesAWT() {
        // Set the title of the frame
        setTitle("AWT Rectangle Drawing");

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

    // Override the paint method to draw a rectangle
    public void paint(Graphics g) {
       // Set the color for the rectangle
       g.setColor(Color.BLUE);
       // Draw a rectangle with top-left corner at (50, 50) and width 300, height 200
       g.fillRect(50, 50, 300, 200);
       // Set the color for the square
       g.setColor(Color.GREEN);
       // Draw a square with top-left corner at (100, 150) and side length 100
       g.fillRect(100, 150, 100, 100); // A square has equal width and height
       
       // Set the color for the circle
       g.setColor(Color.RED);
       // Draw a filled circle at (200, 200) with radius 50
       g.fillOval(200, 200, 100, 100); // Width and height are both 100 for a perfect circle

    }

    // Main method to create the frame
    public static void main(String[] args) {
        // Create an instance of the RectangleDrawing class
        new ShapesAWT();
    }
}
