import javax.swing.*;
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
        for (int i =0 ; i<8 ; i++){
            board[7][i]="Wpawn" ;
            }
        for (int i =0 ; i<8 ; i++){
            board[0][i]="Bpawn" ;
            }
    }

   


    protected void paintComponent(Graphics g){      //Graphics2d  g2d = (Graphics2d) g;
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int[] x = { 0,0,800,800,0};
        int[] y = {0,800,800,0,0};
        Pawn.resizeImages();
        Pawn.setIcons();
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
                if (MouseMotion.posiblemove[j][i] != null){
                    g2d.fillRect(i*100,j*100,100,100);
                }
            }
        }    
        for (int i = 0 ; i<8; i++){
            for (int p = 0 ; p<8 ; p++){
                if(board[p][i]== "Wpawn"){
                    // this.add(Pawn.jlPicwhite);
                    Image image = Pawn.imgwhite.getImage();
                    g2d.drawImage(image,i*100,p*100,null);
                }
                if(board[p][i]== "Bpawn"){
                    // this.add(Pawn.jlPicblack).setLocation(i*100, j*100);
                    
                    Image image = Pawn.imgblack.getImage();
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
   
        
      
        
        
    
   

