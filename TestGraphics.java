import javax.swing.*;
import java.awt.*;


public class TestGraphics extends JFrame  {
    public static void main(String[] args) {
        JFrame settime = new JFrame("Setting time");

        JLabel status = new JLabel();
        

        JFrame frame = new JFrame("Test1");
        Chessboard game = new Chessboard();
        //Panel and resign draw for clock
        JPanel sidetimer = new JPanel();
        sidetimer.setSize(new Dimension(200,200));


        JButton draw2 = new JButton("Draw");
        JButton draw1 = new JButton("Draw");
        JButton resign1  = new JButton("Resgin");
        JButton resign2 = new JButton("Resign");
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(2,2));
        center.add(resign2);
        center.add(draw2);
        center.add(resign1);
        center.add(draw1);
        

        JLabel whitetime = new JLabel("00:00");
        JLabel blacktime = new JLabel("00:00");
        Chessclock time = new Chessclock(whitetime,blacktime);
        settime.add(time);
        settime.setVisible(true);
        settime.setSize(300, 300);

        whitetime.setHorizontalAlignment(SwingConstants.CENTER);
        blacktime.setHorizontalAlignment(SwingConstants.CENTER);
        sidetimer.setLayout(new BorderLayout());
        sidetimer.add(blacktime,BorderLayout.NORTH);
        sidetimer.add(center,BorderLayout.CENTER);
        sidetimer.add(whitetime,BorderLayout.SOUTH);

        
        // frame.setContentPane(game);
        frame.add(game,BorderLayout.CENTER);
        game.setSize(new Dimension(800, 800));
        frame.add(sidetimer,BorderLayout.EAST);
        MouseMotion movement = new MouseMotion(game,status,resign1,resign2,draw1,draw2);


        frame.add(status,BorderLayout.SOUTH);
        frame.addMouseListener(movement);
        frame.addMouseMotionListener(movement);


        frame.setBackground(Color.decode("#eeeed2"));
        frame.setVisible(true);
        frame.setSize(870, 830); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
