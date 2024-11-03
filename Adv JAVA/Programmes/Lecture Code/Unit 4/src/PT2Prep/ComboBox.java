package PT2Prep;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {
    ComboBox(){
        setLayout(new FlowLayout(1,10,10));
        setSize(600,300);

        JLabel greet = new JLabel("Greet");
        JComboBox <String> comboBox = new JComboBox<>(new String[]{"Good Morning","Good Afternoon","good Evening","Good Night"});
        JTextField tf = new JTextField(15);
        JButton btn = new JButton("submit");
        btn.addActionListener(e -> {
            String selectedItem = (String) comboBox.getSelectedItem();
            String text = tf.getText();
            JOptionPane.showMessageDialog(this, "Selected: " + selectedItem + "\nText: " + text);
        });
        JPanel jpane = new JPanel();
        jpane.add(comboBox);
        jpane.add(greet);
        jpane.add(tf);
        jpane.add(btn);
        add(jpane);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args) {
        new ComboBox();
    }
}
