package PT2Prep;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class AdvancedSwingComponents {
    static int i = 0;
    static JProgressBar progressBar;

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Swing Components Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Create tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Tab 1: Scroll Pane
        JPanel scrollPanel = new JPanel();
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPanel.add(scrollPane);
        tabbedPane.addTab("Scroll Pane", scrollPanel);

        // Tab 2: Tree
        JPanel treePanel = new JPanel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode cc1 = new DefaultMutableTreeNode("cc1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        root.add(child1);
        child1.add(cc1);
        root.add(child2);
        JTree tree = new JTree(root);
        treePanel.add(new JScrollPane(tree));
        tabbedPane.addTab("Tree", treePanel);

        // Tab 3: Table
        JPanel tablePanel = new JPanel();
        String[] columnNames = {"Name", "Age", "Gender"};
        Object[][] data = {
                {"John", 25, "Male"},
                {"Anna", 30, "Female"},
                {"Mike", 35, "Male"}
        };
        JTable table = new JTable(new DefaultTableModel(data, columnNames));
        tablePanel.add((table));
        tabbedPane.addTab("Table", tablePanel);

        // Tab 4: Progress Bar
        JPanel progressPanel = new JPanel();
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        progressPanel.add(progressBar);
        JButton btn = new JButton("Start");
        progressPanel.add(btn);
        btn.setToolTipText("Start the progress");
        tabbedPane.addTab("Progress Bar", progressPanel);

        // Add tabbed pane to frame
        frame.add(tabbedPane);
        frame.setVisible(true);
        btn.addActionListener(e ->{
            // Start progress bar update in a separate thread

            new Thread(() -> iterate()).start();

        });
    }

    public static void iterate() {
        while (i <= 100) {
            progressBar.setValue(i);
            i += 2;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
