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
    public static void resizeImagesandsetIcon(String piece) {
	
        if ( piece.charAt(0) == 'k')
        {try {
            // Load original PNG images
            Image originalBlack = ImageIO.read(new File("C:\\Users\\Window5555\\Documents\\GitHub\\SideProject\\Pieces\\Bking.png"));
            Image originalWhite = ImageIO.read(new File("C:\\Users\\Window5555\\Documents\\GitHub\\SideProject\\Pieces\\Wking.png"));

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
    }
    else if ( piece.charAt(0) == 'p')
        {try {
            // Load original PNG images
            Image originalBlack = ImageIO.read(new File("C:\\Users\\Window5555\\Documents\\GitHub\\SideProject\\Pieces\\Bpawn.png"));
            Image originalWhite = ImageIO.read(new File("C:\\Users\\Window5555\\Documents\\GitHub\\SideProject\\Pieces\\Wpawn.png"));

            // Resize images to 100x100 pixels
            Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

            // Create new ImageIcon objects from resized images
            imgblackpawn = new ImageIcon(resizedBlack);
            imgwhitepawn = new ImageIcon(resizedWhite);
            
            // jlPicblack.setIcon(imgblackpawn);
            // jlPicwhite.setIcon(imgwhitepawn);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    else if ( piece.charAt(0) == 'q')
    {try {
        // Load original PNG images
        Image originalBlack = ImageIO.read(new File("C:/Users/Window5555/Documents/GitHub/SideProject/Pieces/Bqueen.png"));

        Image originalWhite = ImageIO.read(new File("C:/Users/Window5555/Documents/GitHub/SideProject/Pieces/Wqueen.png"));


        // Resize images to 100x100 pixels
        Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Create new ImageIcon objects from resized images
        imgblackqueen = new ImageIcon(resizedBlack);
        imgwhitequeen= new ImageIcon(resizedWhite);
        
        // jlPicblack.setIcon(imgblackpawn);
        // jlPicwhite.setIcon(imgwhitepawn);
        
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    else if ( piece.charAt(0) == 'b')
    {try {
        // Load original PNG images
        Image originalBlack = ImageIO.read(new File("C:/Users/Window5555/Documents/GitHub/SideProject/Pieces/Bbishop.png"));

        Image originalWhite = ImageIO.read(new File("C:/Users/Window5555/Documents/GitHub/SideProject/Pieces/Wbishop.png"));


        // Resize images to 100x100 pixels
        Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Create new ImageIcon objects from resized images
        imgblackbishop = new ImageIcon(resizedBlack);
        imgwhitebishop= new ImageIcon(resizedWhite);
        
        // jlPicblack.setIcon(imgblackpawn);
        // jlPicwhite.setIcon(imgwhitepawn);
        
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    else if ( piece.charAt(0) == 'r')
    {try {
        // Load original PNG images
        Image originalBlack = ImageIO.read(new File("C:/Users/Window5555/Documents/GitHub/SideProject/Pieces/Brook.png"));

        Image originalWhite = ImageIO.read(new File("C:/Users/Window5555/Documents/GitHub/SideProject/Pieces/Wrook.png"));


        // Resize images to 100x100 pixels
        Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);

        // Create new ImageIcon objects from resized images
        imgblackrook = new ImageIcon(resizedBlack);
        imgwhiterook= new ImageIcon(resizedWhite);
        
        // jlPicblack.setIcon(imgblackpawn);
        // jlPicwhite.setIcon(imgwhitepawn);
        
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    }
}
