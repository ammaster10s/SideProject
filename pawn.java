import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;

public class Pawn extends JPanel {

    static boolean killed = false;
    static boolean color = true;
    JPanel panel = new JPanel();
    static ImageIcon imgblack;
    static ImageIcon imgwhite;

    static JLabel jlPicblack = new JLabel();
    static JLabel jlPicwhite = new JLabel();


    public static void resizeImages() {
        try {
            // Load original PNG images
            Image originalBlack = ImageIO.read(new File("Wpawn.png"));
            Image originalWhite = ImageIO.read(new File("Bpawn.png"));

            // Resize images to 100x100 pixels
            Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

            // Create new ImageIcon objects from resized images
            imgblack = new ImageIcon(resizedBlack);
            imgwhite = new ImageIcon(resizedWhite);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setIcons() {
        // Set the icons for the JLabels
        jlPicblack.setIcon(imgblack);
        jlPicwhite.setIcon(imgwhite);
    }

    public static void main(String [] args){
        resizeImages();
        setIcons();

        JFrame test = new JFrame();

        test.add(jlPicblack);
        test.setVisible(true);
        test.setLocationRelativeTo(null);
        test.setSize(100,100);

    }
}
