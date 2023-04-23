import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;

public class ImageCreater extends Chessboard {
    static ImageIcon imgblackpawn;
    static ImageIcon imgwhitepawn;

    static ImageIcon imgblackking;
    static ImageIcon imgwhiteking;

    static ImageIcon imgblackqueen;
    static ImageIcon imgwhitequeen;

    static ImageIcon imgblackbishop;
    static ImageIcon imgwhitebishop;

    static ImageIcon imgblackrook;
    static ImageIcon imgwhiterook;

    static ImageIcon imgblackknight;
    static ImageIcon imgwhiteknight;

    public static void resizeImagesandsetIcon(String piece) {

        if (piece.charAt(0) == 'k') {
            try {
                // Load original PNG images
                Image originalBlack = ImageIO.read(new File("Bking.png"));
                Image originalWhite = ImageIO.read(new File("Wking.png"));

                // Resize images to 100x100 pixels
                Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                // Create new ImageIcon objects from resized images
                imgblackking = new ImageIcon(resizedBlack);
                imgwhiteking = new ImageIcon(resizedWhite);

                // jlPicblack.setIcon(imgblackking);
                // jlPicwhite.setIcon(imgwhiteking);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (piece.charAt(0) == 'p') {
            try {
                
                Image originalBlack = ImageIO.read(new File("Bpawn.png"));
                Image originalWhite = ImageIO.read(new File("Wpawn.png"));

                
                Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

                // Create new ImageIcon objects from resized images
                imgblackpawn = new ImageIcon(resizedBlack);
                imgwhitepawn = new ImageIcon(resizedWhite);


            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (piece.charAt(0) == 'q') {
            try {
               
                Image originalBlack = ImageIO.read(new File("Bqueen.png"));
                Image originalWhite = ImageIO.read(new File("Wqueen.png"));

                
                Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

               
                imgblackqueen = new ImageIcon(resizedBlack);
                imgwhitequeen = new ImageIcon(resizedWhite);


            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (piece.charAt(0) == 'b') {
            try {
               
                Image originalBlack = ImageIO.read(new File("Bbishop.png"));
                Image originalWhite = ImageIO.read(new File("Wbishop.png"));

               
                Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        
                imgblackbishop = new ImageIcon(resizedBlack);
                imgwhitebishop = new ImageIcon(resizedWhite);



            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (piece.charAt(0) == 'r') {
            try {
             
                Image originalBlack = ImageIO.read(new File("Brook.png"));
                Image originalWhite = ImageIO.read(new File("Wrook.png"));

             
                Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

              
                imgblackrook = new ImageIcon(resizedBlack);
                imgwhiterook = new ImageIcon(resizedWhite);


            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (piece.charAt(0) == 'n') {
            try {
             
                Image originalBlack = ImageIO.read(new File("Bnight.png"));
                Image originalWhite = ImageIO.read(new File("Wnight.png"));

            
                Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

            
                imgblackknight = new ImageIcon(resizedBlack);
                imgwhiteknight = new ImageIcon(resizedWhite);


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
