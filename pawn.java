import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class pawn extends JFrame implements Movement{

    JPanel panel = new JPanel();
    static ImageIcon img = new ImageIcon("Chess_plt45.svg.png" );
    static JLabel jlPic = new JLabel(img);
    public void movement() {};



    public static void main(String [] args){
        JFrame test = new JFrame();
       
        test.add(jlPic);
        test.setVisible(true);
        test.setSize(800,800);
        
}
}