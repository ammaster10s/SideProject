import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.io.*;
public class Chessboard extends JPanel

{
    // String[] Postion = {"A","B","C","D","E","F","G","H"};
    static String[] options = {"♙","♟","♘","♞","♗","♝","♖"," ♜","♕","♛","♔","♚"};
    public static String position;
    // String[][] position = new String[8][8];
    
    
    private String[][] board = new String[8][8]; //to show game status in text based version
    private ArrayList<Piece> pieces = new ArrayList<Piece>(32); //create 32 pieces, 16 for both players

    




    // starting position
    Chessboard(){
       
        initializeBoard();
        // this.setSize(800,800);
        // checklayoutboard();
    } 



    private void initializeBoard(){
        for (int i =0 ; i<8 ; i++){
            board[i][0]="wpawn" ;
            }
        for (int i =0 ; i<8 ; i++){
            board[i][7]="bpawn" ;
            }
    }

    public String checklayoutboard1(int x ,int y){

        for (int i =0 ;i<9 ;i++){
            for (int j =0 ;j<9;j++){
                if (board[x][y] != null){
                    return board[x][y] ;
                }
            }
        }
        return null;
        
        }
    
    public String checkmoveto(int x,int y){
        if (board[x][y] == null && ){

        }
    }








    protected void paintComponent(Graphics g){      //Graphics2d  g2d = (Graphics2d) g;
        Graphics2D g2d = (Graphics2D) g.create();
        int[] x = { 0,0,800,800,0};
        int[] y = {0,800,800,0,0};
        Pawn.resizeImages();
        Pawn.setIcons();
        g2d.setColor(Color.decode("#769656"));
        g2d.drawPolyline(x, y, 5);
    //     for (int i=0 ; i<800 ;i+=100){    
    //         g2d.setColor(Color.decode("#769656"));                   //Vertical line
    //         g2d.drawLine(i, 0, i, 800);
    //    }
    //     for (int j = 0 ; j<800;j+=100){  
    //         g2d.setColor(Color.decode("#769656"));                   //Horizontal
    //         g2d.drawLine(0,j,800,j);
    //     }
        
        // fill black
        g2d.setColor(Color.decode("#769656"));
        for (int j = 0 ; j <8;j++){             //Y axis
            for (int i =0; i<8 ; i++)         //X axis
                {if (j%2 == 0){
                    if (i%2!=0){g2d.fillRect(i*100, j*100, 100, 100);}
                    }
                   
                
                else if (j%2!=0){
                    if(i%2==0){
                        g2d.fillRect(i*100, j*100, 100, 100);
                    }
                }
            }
            for (int i = 0 ; i<8; i++){
                for (int p = 0 ; p<8 ; p++){
                    if(board[i][p]== "wpawn"){
                        // this.add(Pawn.jlPicwhite);
                        Image image = Pawn.imgwhite.getImage();
                        g2d.drawImage(image,i*100,p*100,null);
                    }
                    if(board[i][p]== "bpawn"){
                        // this.add(Pawn.jlPicblack).setLocation(i*100, j*100);
                       
                        Image image = Pawn.imgblack.getImage();
                        g2d.drawImage(image,i*100,p*100,null);
                }
             
                }
            }
        }
            
        }
   
        // public void emptyBoard() {
        //     for (int i=0; i<8; i++) { //rows
        //         for (int j=0; j<8; j++) { //columns
        //             board[i][j] = null;}
        //         }
        // }
        public  boolean posiblemove(int x, int y){
            int counter = 0;
            checklayoutboard1(x, y);
            for (int i=0; i<8; i++) { 
                for (int j=0; j<8; j++ ) { 
                    
                    if (board[i][y] == null){
                        counter +=1;
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
            if( counter >0){
                return true;
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

}
   

