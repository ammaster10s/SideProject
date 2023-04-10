import javax.swing.*;

import temp.Pawn;

import java.util.*;
import java.awt.*;

public class Chessboard extends JPanel 

{
    // String[] Postion = {"A","B","C","D","E","F","G","H"};
    static String[] options = {"♙","♟","♘","♞","♗","♝","♖"," ♜","♕","♛","♔","♚"};
    public static String position;
    // String[][] position = new String[8][8];
    static Color color = Color.decode("#769656");
    
    public static String[][] board = new String[8][8]; //to show game status in text based version
    // private static final String INITIAL_BOARD_STATE =
    // "rnbqkbnr" +
    // "pppppppp" +
    // "........" +
    // "........" +
    // "........" +
    // "........" +
    // "PPPPPPPP" +
    // "RNBQKBNR";
    
    Chessboard(){
       
        initializeBoard();
           
    } 

    private void initializeBoard(){
        Piece.resizeImagesandsetIcon("pawn");
        Piece.resizeImagesandsetIcon("king");
        Piece.resizeImagesandsetIcon("queen");
        for (int i =0; i<2;i++){
        new Piece(0,4,"king",false);
        new Piece(7,4,"king",true);
        
        new Piece(7,3,"queen",true);
        new Piece(0,3,"queen",false);
        }
        for (int i =0 ; i<8 ; i++){
            new Piece(1, i,"pawn",false) ;
            }
        for (int i =0 ; i<8 ; i++){
            new Piece(6, i,"pawn",true) ;
            }
        
       
        
    }

   


    protected void paintComponent(Graphics g){      //Graphics2d  g2d = (Graphics2d) g;
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int[] x = { 0,0,800,800,0};
        int[] y = {0,800,800,0,0};
        
        // Piece.setIcons();
        g2d.setColor(color);
        g2d.drawPolyline(x, y, 5);
        
       
        
        g2d.setColor(color);
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
    }
        for (int j = 0 ; j <8 ;j++){
            for (int i =0 ; i<8 ; i ++){
                g2d.setColor(Color.decode("#ffd692"));
                if (Piece.posiblemove[j][i] != null){
                    g2d.fillRect(i*100,j*100,100,100);
                }
            }
        }    
        for (int i = 0 ; i<8; i++){
            for (int p = 0 ; p<8 ; p++){
                if(board[p][i]== "Wpawn"){
                    // this.add(Pawn.jlPicwhite);
                    Image image = Piece.imgwhitepawn.getImage();
                    g2d.drawImage(image,i*100,p*100,null);
                }
                if(board[p][i]== "Bpawn"){
                    // this.add(Pawn.jlPicblack).setLocation(i*100, j*100);
                    
                    Image image = Piece.imgblackpawn.getImage();
                    g2d.drawImage(image,i*100,p*100,null);
            }
                if(board[p][i]== "Wking"){
                    
                    Image image = Piece.imgwhiteking.getImage();
                    g2d.drawImage(image,i*100,p*100,null);
                }
                if(board[p][i]== "Bking"){
                  
                    
                    Image image = Piece.imgblackking.getImage();
                    g2d.drawImage(image,i*100,p*100,null);
            }
                if(board[p][i]== "Wqueen"){
                    
                        
                    Image image = Piece.imgwhitequeen.getImage();
                    g2d.drawImage(image,i*100,p*100,null);
            }
                if(board[p][i]== "Bqueen"){
                        
                            
                    Image image = Piece.imgblackqueen.getImage();
                    g2d.drawImage(image,i*100,p*100,null);
            }
            
            }
        }
        for (int i=0 ; i<800 ;i+=100){    
            g2d.setColor(Color.BLACK);                   //Vertical line
            g2d.drawLine(i, 0, i, 800);
       }
        for (int j = 0 ; j<800;j+=100){  
            g2d.setColor(Color.BLACK);                   //Horizontal
            g2d.drawLine(0,j,800,j);
        }
        }
       
        }
   
        
      
        
        
    
   

