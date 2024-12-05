import java.awt.*;
import java.awt.event.*;

public class VotingApp extends Frame {
    
    // Candidate names
    private static final String[] candidates = {"A", "B", "C", "D"};
    
    // Vote counts for each candidate
    private int[] voteCounts = new int[candidates.length];
    
    // Constructor to setup the GUI
    public VotingApp() {
        // Set the title and layout
        setTitle("Voting Application");
        setSize(400, 300);
        setLayout(new FlowLayout());

        // Add buttons for voting on each candidate
        for (int i = 0; i < candidates.length; i++) {
            Button voteButton = new Button("Vote for " + candidates[i]);
            int candidateIndex = i; // to use in action listener
            voteButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // Increment vote count for the clicked candidate
                    voteCounts[candidateIndex]++;
                }
            });
            add(voteButton);
        }

        // Add the "Submit" button to display results
        Button submitButton = new Button("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Determine the winner
                int maxVotes = -1;
                String winner = "";
                for (int i = 0; i < candidates.length; i++) {
                    if (voteCounts[i] > maxVotes) {
                        maxVotes = voteCounts[i];
                        winner = candidates[i];
                    }
                }

                // Create a dialog box to display the results
                Dialog resultDialog = new Dialog(VotingApp.this, "Voting Results", true);
                resultDialog.setLayout(new FlowLayout());
                resultDialog.setSize(300, 250);

                // Display vote counts for each candidate
                for (int i = 0; i < candidates.length; i++) {
                    Label resultLabel = new Label(candidates[i] + ": " + voteCounts[i] + " votes");
                    if (candidates[i].equals(winner)) {
                        resultLabel.setForeground(Color.RED);  // Set the winner's label in red
                    }
                    resultDialog.add(resultLabel);
                }

                // Display the winner in red with the vote count
                Label winnerLabel = new Label("Winner: " + winner + " with " + maxVotes + " votes");
                winnerLabel.setForeground(Color.RED);  // Set the winner's label in red
                resultDialog.add(winnerLabel);

                // Show the dialog
                resultDialog.setVisible(true);

                // Proper window closing behavior for the dialog (only close the dialog)
                resultDialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we) {
                        resultDialog.dispose();  // Dispose the dialog
                    }
                });
            }
        });

        add(submitButton);

        // Set window behavior
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);  // Exit the main application when the main frame is closed
            }
        });
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new VotingApp();
    }
}
