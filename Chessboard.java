import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Chessboard extends JPanel 

{
    // String[] Postion = {"A","B","C","D","E","F","G","H"};
    static String[] options = {"♙","♟","♘","♞","♗","♝","♖"," ♜","♕","♛","♔","♚"};
    public static String position;
    // String[][] position = new String[8][8];
    
    
    private String[][] board = new String[8][8]; //to show game status in text based version
    
    
    Chessboard(){
       
        initializeBoard();
           
    } 

    private void initializeBoard(){
        for (int i =0 ; i<8 ; i++){
            board[i][0]="wpawn" ;
            }
        for (int i =0 ; i<8 ; i++){
            board[i][7]="bpawn" ;
            }
    }

    // public String checklayoutboard1(int x ,int y){

    //     for (int i =0 ;i<9 ;i++){
    //         for (int j =0 ;j<9;j++){
    //             if (board[x][y] != null){
    //                 return board[x][y] ;
    //             }
    //         }
    //     }
    //     return null;
        
    //     }
    
    // public String checkmoveto(int x,int y){
    //     if (board[x][y] == null  ){

    //     }
    //     return null;
    // }

    // public boolean posiblemove(int x, int y){
    //     checklayoutboard1(x, y);
    //     int counter = 0;
    //     for (int i = 0; i < 8; i++) { 
    //         if (board[i][y] == null) {
    //             counter += 1;
    //         }
    //     }
    //     return counter > 0;
    // }



    protected void paintComponent(Graphics g){      //Graphics2d  g2d = (Graphics2d) g;
        Graphics2D g2d = (Graphics2D) g.create();
        int[] x = { 0,0,800,800,0};
        int[] y = {0,800,800,0,0};
        Pawn.resizeImages();
        Pawn.setIcons();
        g2d.setColor(Color.decode("#769656"));
        g2d.drawPolyline(x, y, 5);
  
        
      
        g2d.setColor(Color.decode("#769656"));
        for (int j = 0 ; j <8;j++){           
            for (int i =0; i<8 ; i++)         
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
   
        
      
        
        
    
   
}
