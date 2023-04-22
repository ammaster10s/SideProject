import javax.swing.*;
import java.awt.*;

public class TestGraphics extends JFrame {
    public static void main(String[] args) {
        JFrame settime = new JFrame("Setting time");

        JLabel status = new JLabel();
        // JLabel below = new JLabel("test");
        // JLabel top = new JLabel("test");
        Chessclock time = new Chessclock();

        settime.add(time);
        settime.setVisible(true);
        settime.setSize(300, 300);

        JFrame frame = new JFrame("Test1");
        Chessboard game = new Chessboard();

        
      

        frame.setContentPane(game);
        MouseMotion movement = new MouseMotion(game,status);


        frame.add(status,BorderLayout.SOUTH);
        frame.addMouseListener(movement);
        frame.addMouseMotionListener(movement);

        frame.setBackground(Color.decode("#eeeed2"));
        frame.setVisible(true);
        frame.setSize(809, 832); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
