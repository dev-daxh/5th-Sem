package PT2Prep;

import java.awt.FlowLayout;

import javax.swing.*;

public class ProgressBar extends JFrame{
    JProgressBar jbar;
    int i=0,num=0;
    ProgressBar(){
        jbar= new JProgressBar(0,100);
        jbar.setValue(0);
        jbar.setStringPainted(true);
        add(jbar);
        setSize(300,400);
        setLayout(new FlowLayout());

    }
    public void iterate(){
        while(i<=100){
            jbar.setValue(i);
            i+=2;
            try{
                Thread.sleep(150);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ProgressBar pbr = new ProgressBar();
        pbr.setVisible(true);
        pbr.iterate();
    }
}
