import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

// public class Positioning {
//     static String[] options = {"♙","♟","♘","♞","♗","♝","♖"," ♜","♕","♛","♔","♚"};
    

public class Board {

    //global variables
    private String[][] board = new String[8][8]; //to show game status in text based version
    private ArrayList<Piece> pieces = new ArrayList<Piece>(32); //create 32 pieces, 16 for both players

    public void emptyBoard() {
		for (int i=0; i<8; i++) { //rows
			for (int j=0; j<8; j++) { //columns
				board[i][j] = null;}
            }



            
    // public static void main(String[] args) {
    //     Positioning test = new Positioning();
    //     // for (int i = 1 ; i<=8;i++){
    //         System.out.println(test.position);
        // }
    }
}
// }
