import java.awt.*;
import java.awt.event.*;
public class votingapp extends Frame {
    private String [] candidates={"ABC","PQR","XYZ"};
    private int [] voteCount = new int[candidates.length];
    public votingapp(){
        setTitle("Voting application");
        setLayout(new FlowLayout());
        setSize(300,400);

        for(int i=0;i<candidates.length;i++){
            Button candidateButton = new Button("Vote for : "+candidates[i]);
            int voteindex = i;
            candidateButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae){
                    voteCount[voteindex]++;
                }
            });
            add(candidateButton);
        }

        Button submitbtn = new Button("Submit");
        submitbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                int maxvote = -1;
                String winner = "";
                for(int i=0;i<candidates.length;i++){
                    if(voteCount[i]>maxvote){
                        maxvote = voteCount[i];
                        winner = candidates[i];
                    }
                }

                Dialog dialog = new Dialog(votingapp.this,"Voting Result",true);
                dialog.setLayout(new FlowLayout(2));
                dialog.setSize(300,200);

                for(int i=0;i<candidates.length;i++){
                    Label lab = new Label("Vote of "+candidates[i]+" : "+voteCount[i]);
                    if(candidates[i]==winner){
                        lab.setForeground(Color.RED);
                    }
                    dialog.add(lab);
                }
                Label winnerLabel = new Label("Winner :"+winner+" with "+maxvote+" votes" );
                winnerLabel.setForeground(Color.red);
                dialog.add(winnerLabel);

                dialog.addWindowListener(new WindowAdapter() {
                    public void windowClosing(WindowEvent e){
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
        add(submitbtn);

        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        new votingapp();
    }
}
