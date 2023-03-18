import javax.swing.*;
import java.awt.*;
class TestGraphics extends JFrame
{
    public static void main(String [] args){
        JFrame frame = new JFrame("Test1");
        JLabel below = new JLabel("default");
        
        frame.add(below , BorderLayout.SOUTH);
        frame.add(new Chessboard());
        MouseMotion movement   = new MouseMotion(below);
        frame.addMouseListener(movement);
        frame.addMouseMotionListener(movement);

        frame.setBackground(Color.decode("#e9dcd3"));
        frame.setVisible(true);
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
