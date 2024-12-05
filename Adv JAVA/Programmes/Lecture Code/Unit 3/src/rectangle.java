import java.awt.*;
public class rectangle extends Frame {
    rectangle(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(300,400);
        setShape(new Rectangle(500,10));

    }
    public static void main(String[] args) {
        new rectangle();
    }
}
