import java.util.*;

import java.awt.*;
import javax.swing.*;

// public class Positioning {
//     static String[] options = {"♙","♟","♘","♞","♗","♝","♖"," ♜","♕","♛","♔","♚"};
    

public class Board {

    public String position;
    //global variables
    private String[][] board = new String[8][8]; //to show game status in text based version
    private ArrayList<Piece> pieces = new ArrayList<Piece>(32); //create 32 pieces, 16 for both players
    

    public void emptyBoard() {
		for (int i=0; i<8; i++) { //rows
			for (int j=0; j<8; j++) { //columns
				board[i][j] = null;}
            }
    }

    

    public int positiontopixel(String postion){
        this.position = postion;
        Dictionary< String , Integer> dictchar = new Hashtable<String, Integer>();
        dictchar.put("A", 50);  
        dictchar.put("B", 150);  
        dictchar.put("C", 250);  
        dictchar.put("D", 350);  
        dictchar.put("E", 450);  
        dictchar.put("F", 550);  
        dictchar.put("G", 650);  
        dictchar.put("h", 750);  
        String localchar ;
        int  localnum ;
        localchar= MouseMotion.positionchar ;
        localnum = MouseMotion.positionnum    ;
        return dictchar.get(localchar)  ;
        return dictchar.get(localnum);
        

        
    }
            
    // public static void main(String[] args) {
    //     Positioning test = new Positioning();
    //     // for (int i = 1 ; i<=8;i++){
    //         System.out.println(test.position);
        // }
}

// }
