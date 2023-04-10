import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Chessclock extends JPanel implements ActionListener {
    private JButton bullet3 = new JButton("3|2");
    private JButton blitz3 = new JButton("3");
    private JButton blitz5 = new JButton("5|5");
    private JButton Rapid10 = new JButton("10");

    private Timer timer1;
    private Timer timer2;
    private JLabel currentLabel;
    private JLabel player1Label;
    private JLabel player2Label;
    public int minutes1 = 0;
    public int seconds1 = 0;

    public int minutes2 = 0;
    public int seconds2=0;
    private int constantsec ;
    private boolean clockstart ;

    public int totalSeconds1;
    public int totalSeconds2;

    public Chessclock(JLabel player1 , JLabel player2) {
        this.setLayout(new GridLayout(2, 2));
        this.add(bullet3);
        this.add(blitz3);
        this.add(blitz5);
        this.add(Rapid10);

        bullet3.addActionListener(this);
        blitz3.addActionListener(this);
        blitz5.addActionListener(this);
        Rapid10.addActionListener(this);

        
        // Initialize the player labels
        player1Label = new JLabel("", SwingConstants.CENTER);
        player1Label.setFont(new Font("Arial", Font.PLAIN, 48));
        player1Label=player1;

        player2Label = new JLabel("", SwingConstants.CENTER);
        player2Label.setFont(new Font("Arial", Font.PLAIN, 48));
        player2Label=player2;
       

        // Set the initial turn to player 1
       ;
       
        currentLabel = player1Label;
       
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        

        switch (btn.getText()) {
            case "3|2":
                minutes1 = 3;
                seconds1 = 2;
                minutes2 = 3;
                seconds2 = 2;
                constantsec =2;
                break;
            case "3":
                minutes1 = 3;
                seconds1 = 0;
                minutes2 = 3;
                seconds2 = 0;
                constantsec =0;
                break;
            case "5|5":
                minutes1 = 5;
                seconds1 = 5;
                minutes2 = 5;
                seconds2 = 5;
                constantsec =5;
                break;
            case "10":
                minutes1 = 10;
                seconds1 = 0;
                minutes2 = 10;
                seconds2 = 0;
                constantsec =0;
                break;


            
        }
        player1Label.setText(String.format("%02d:%02d", minutes1, seconds1)); 
        player2Label.setText(String.format("%02d:%02d", minutes2, seconds2));    
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
        clockstart = true;
        checkclock();
        
    }
    public void checkclock(){
        int totalSeconds1 = minutes1 * 60 + seconds1+constantsec;
        int totalSeconds2 = minutes2 * 60 + seconds2+constantsec;
        timer1 = new Timer(1000, new ActionListener() {
            int remainingSeconds = totalSeconds1;
    
            public void actionPerformed(ActionEvent evt) {
                remainingSeconds--;
                int remainingMinutes = remainingSeconds / 60;
                int remainingSecondsDisplay = remainingSeconds % 60;
                currentLabel.setText(String.format("%02d:%02d", remainingMinutes, remainingSecondsDisplay));
                if (remainingSeconds == 0) {
                    JOptionPane.showMessageDialog(null, "Time's up!");
                    timer1.stop();
                    currentLabel.setText("");
                }
            }
        });
    
    
        timer2 = new Timer(1000, new ActionListener() {
            int remainingSeconds = totalSeconds2;
    
            public void actionPerformed(ActionEvent evt) {
                remainingSeconds--;
                int remainingMinutes = remainingSeconds / 60;
                int remainingSecondsDisplay = remainingSeconds % 60;
                currentLabel.setText(String.format("%02d:%02d", remainingMinutes, remainingSecondsDisplay));
                if (remainingSeconds == 0) {
                    JOptionPane.showMessageDialog(null, "Time's up!");
                    timer2.stop();
                    currentLabel.setText("");
                }
            }
        });
    
        // Set the initial turn to player 1
        currentLabel = player1Label;
    
        // Update the currentLabel based on the turn to move
        if (MouseMotion.turntomove == false) {
            currentLabel = player2Label;
            timer2.start();
            timer1.stop();
        } else if (MouseMotion.turntomove == true && clockstart == true) {
            currentLabel = player1Label;
            timer1.start();
            timer2.stop();
        }
    }
    
    
}
