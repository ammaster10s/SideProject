package temp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

import Chessboard;

import java.awt.*;
import java.beans.Visibility;

public class Pawn extends JPanel {

    static boolean diagonal = true;
    static boolean forward = true;
    static int Visibility = 1;
    
    static boolean color = true;
    JPanel panel = new JPanel();
    static ImageIcon imgblack;
    static ImageIcon imgwhite;

    static JLabel jlPicblack = new JLabel();
    static JLabel jlPicwhite = new JLabel();

    private static String[][] posiblemove =  new String[8][8];

    public Pawn(int x , int y ,boolean Color){
        if (Color == true){
            Chessboard.board[x][y] = "Wpawn";
        }
        else{
            Chessboard.board[x][y]= "Bpawn";
        }



    }
    public void posiblemovecal(int y, int x , boolean color){
    if (color == false){
        // for (int i = y; i < 8; i++) { 

        if (Chessboard.board[y+1][x] == null) {
            posiblemove[y+1][x] = "Posible";
        
        }
        // if ( Chessboard.board[y+1][x-1] != null && Chessboard.board[y+1][x-1].charAt(0)=='W'){
        //     posiblemove[y+1][x-1] = "Posible";
           
        // }
        // if ( Chessboard.board[y+1][x+1] != null && Chessboard.board[y+1][x+1].charAt(0)=='W'){
        //     posiblemove[y+1][x+1] = "Posible";
        // }             
}
    if (color == true){
        // for (int i = y; i >=0; i--) {
             
            if (Chessboard.board[y-1][x] == null) {
                posiblemove[y-1][x] = "Posible";
            }
    //         if ( Chessboard.board[y-1][x-1] != null && Chessboard.board[y-1][x-1].charAt(0)=='B'){
    //             posiblemove[y-1][x-1] = "Posible";
               
    //         }
    //         if ( Chessboard.board[y-1][x+1] != null && Chessboard.board[y-1][x+1].charAt(0)=='B'){
    //             posiblemove[y-1][x+1] = "Posible";
          

    // }
    }    
    }























    public static void resizeImages() {
        try {
            // Load original PNG images
            Image originalBlack = ImageIO.read(new File("Bpawn.png"));
            Image originalWhite = ImageIO.read(new File("Wpawn.png"));

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


}