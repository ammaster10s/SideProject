import java.util.*;

import java.awt.*;
import javax.swing.*;


    static String[] options = {"♙","♟","♘","♞","♗","♝","♖"," ♜","♕","♛","♔","♚"};
    

public class Board {

    public static String position;
    //global variables 
    private String[][] board = new String[8][8]; //to show game status in text based version
    private ArrayList<Piece> pieces = new ArrayList<Piece>(32); //create 32 pieces, 16 for both players
    

    public void emptyBoard() {
		for (int i=0; i<8; i++) { //rows
			for (int j=0; j<8; j++) { //columns
				board[i][j] = null;}
            }
    }

    

    public static int positiontopixelx(String postion){
        // this.position = postion;
        Dictionary< String , Integer> dictchar = new Hashtable<String, Integer>();
        dictchar.put("A", 750);  
        dictchar.put("B", 650);  
        dictchar.put("C", 550);  
        dictchar.put("D", 450);  
        dictchar.put("E", 350);  
        dictchar.put("F", 250);  
        dictchar.put("G", 150);  
        dictchar.put("h", 50);  
        // String localchar ;
        // int  localnum ;
        // localchar= MouseMotion.positionchar ;
        // localnum = MouseMotion.positionnum    ;
        return dictchar.get(position)  ;
        
        

        
    }
    public static int positiontopixely(int postion){
        // this.position = postion;
        Dictionary< Integer , Integer> dictchar = new Hashtable<Integer, Integer>();
        dictchar.put(1, 750);  
        dictchar.put(2, 650);  
        dictchar.put(3, 550);  
        dictchar.put(4, 450);  
        dictchar.put(5, 350);  
        dictchar.put(6, 250);  
        dictchar.put(7, 150);  
        dictchar.put(8, 50);  
        // String localchar ;
        // int  localnum ;
        // localchar= MouseMotion.positionchar ;
        // localnum = MouseMotion.positionnum    ;
        return dictchar.get(position)  ;
        
        

        
    }
            
    // public static void main(String[] args) {
    //     Positioning test = new Positioning();
    //     // for (int i = 1 ; i<=8;i++){
    //         System.out.println(test.position);
        // }
}

// }
