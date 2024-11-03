import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PR10 {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(6,3));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField();

        JLabel genderLabel = new JLabel("Gender:");
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        JLabel interestsLabel = new JLabel("Interests:");
        JCheckBox sportsCheck = new JCheckBox("Sports");
        JCheckBox musicCheck = new JCheckBox("Music");
        JCheckBox readingCheck = new JCheckBox("Reading");

        JButton submitButton = new JButton("Submit");
        
        // Action listener for the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String gender = maleRadio.isSelected() ? "Male" : "Female";
                StringBuilder interests = new StringBuilder("Interests: ");
                
                if (sportsCheck.isSelected()) interests.append("Sports ");
                if (musicCheck.isSelected()) interests.append("Music ");
                if (readingCheck.isSelected()) interests.append("Reading ");
                
                JOptionPane.showMessageDialog(frame,
                        "Name: " + name + "\nGender: " + gender + "\n" + interests.toString());
            }
        });

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(genderLabel);
        frame.add(maleRadio);
        frame.add(femaleRadio);
        frame.add(interestsLabel);
        frame.add(sportsCheck);
        frame.add(musicCheck);
        frame.add(readingCheck);
        frame.add(submitButton);

        // Make the frame visible
        frame.setVisible(true);
    }
}
