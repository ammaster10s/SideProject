import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class pawn extends JPanel implements Movement{

    static boolean killed = false;
    static boolean color = true;
    JPanel panel = new JPanel();
    static ImageIcon imgblack = new ImageIcon("Wpawn.png" );
    static ImageIcon imgwhite = new ImageIcon("Bpawn.png");
    static JLabel jlPicblack = new JLabel(imgblack);
    
    static JLabel jlPicwhite = new JLabel(imgwhite);
    public void movement() {
        jlPicblack.setSize(100,100);
        jlPicwhite.setSize(100,100);
    };
    


    public static void main(String [] args){
        JFrame test = new JFrame();
       
        test.add(jlPicblack);
        test.setVisible(true);
        test.setSize(800,800);
        
}
}