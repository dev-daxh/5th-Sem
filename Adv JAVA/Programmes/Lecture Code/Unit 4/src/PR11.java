import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PR11 {

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Language Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each language
        for (String language : new String[]{"English", "Marathi", "Hindi", "Sanskrit"}) {
            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());

            // Create greeting and meanings
            String greeting = "";
            String[] meanings = {};

            switch (language) {
                case "English":
                    greeting = "Greeting in English: Hello";
                    meanings = new String[]{
                        "Select a meaning",
                        
                        "नमस्कार (Marathi)",
                        "नमस्ते (Hindi)",
                        "नमस्कार (Sanskrit)"
                    };
                    break;
                case "Marathi":
                    greeting = "Greeting in Marathi: नमस्कार";
                    meanings = new String[]{
                        "Select a meaning",
                        "Hello (English)",
                        
                        "नमस्ते (Hindi)",
                        "नमस्कार (Sanskrit)"
                    };
                    break;
                case "Hindi":
                    greeting = "Greeting in Hindi: नमस्ते";
                    meanings = new String[]{
                        "Select a meaning",
                        "Hello (English)",
                        "नमस्कार (Marathi)",
                        
                        "नमस्कार (Sanskrit)"
                    };
                    break;
                case "Sanskrit":
                    greeting = "Greeting in Sanskrit: नमस्कार";
                    meanings = new String[]{
                        "Select a meaning",
                        "Hello (English)",
                        "नमस्कार (Marathi)",
                        "नमस्ते (Hindi)"
                    };
                    break;
            }

            // Add greeting label
            JLabel greetingLabel = new JLabel(greeting);
            panel.add(greetingLabel, BorderLayout.NORTH);

            // Create combo box with meanings
            JComboBox<String> comboBox = new JComboBox<>(meanings);

            // Add action listener to show selected meaning
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String selectedMeaning = (String) comboBox.getSelectedItem();
                    JOptionPane.showMessageDialog(panel, "Selected Meaning: " + selectedMeaning);
                }
            });

            // Add the combo box to a scroll pane
            JScrollPane scrollPane = new JScrollPane(comboBox);
            panel.add(scrollPane, BorderLayout.CENTER);

            // Add the panel to the tabbed pane
            tabbedPane.addTab(language, panel);
        }

        // Add the tabbed pane to the main frame
        frame.add(tabbedPane);

        // Set frame visibility
        frame.setVisible(true);
    }
}
