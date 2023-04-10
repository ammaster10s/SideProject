
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class MouseMotion implements MouseListener, MouseMotionListener{
    public static int positionclickx;
    public static int positionclicky;
    JLabel labletest;
    String[] Postion = {"A","B","C","D","E","F","G","H"};
    int clicklocalx ;
    int clicklocaly ;
    int releasedlocalx ;
    int releasedlocaly ;
    
    
    MouseMotion(JPanel test ,JLabel labletest){
    this.labletest = labletest;
    this.temp = test;}
    // public static String[][] board = new String[8][8];
    // public static String[][] posiblemove =  new String[8][8];

    JPanel temp ; 

    public void repaint(JPanel temp) {
        this.temp = temp;
        temp.getParent().repaint();
        temp.revalidate();
    }
    

    

    // public String checklayoutboard1(int y ,int x){

       
    //         if (Chessboard.board[y][x] != null){
    //             Piece = Chessboard.board[y][x] ;
                
    //         }
    //         else{return( Piece = null);}
    //         return null;
    //     }
        
        
        
        
    
    // public String checkmoveto(int y,int x){
    //     if (Chessboard.board[y][x] == null  ){

    //     }
    //     return null;
    // }
    // make list of possible move
//     public String posiblemovecal(int y, int x){ 
        
      


        
//             if (Piece.charAt(0)== 'B'){
//                 // for (int i = y; i < 8; i++) { 

//                 if (Chessboard.board[y+1][x] == null) {
//                     posiblemove[y+1][x] = "Posible";
                
//                 }
//                 if ( Chessboard.board[y+1][x-1] != null && Chessboard.board[y+1][x-1].charAt(0)=='W'){
//                     posiblemove[y+1][x-1] = "Posible";
                   
//                 }
//                 if ( Chessboard.board[y+1][x+1] != null && Chessboard.board[y+1][x+1].charAt(0)=='W'){
//                     posiblemove[y+1][x+1] = "Posible";
//                 }             
//     }
//             if (Piece.charAt(0) == 'W'){
//                 // for (int i = y; i >=0; i--) {
                     
//                     if (Chessboard.board[y-1][x] == null) {
//                         posiblemove[y-1][x] = "Posible";
//                     }
//                     if ( Chessboard.board[y-1][x-1] != null && Chessboard.board[y-1][x-1].charAt(0)=='B'){
//                         posiblemove[y-1][x-1] = "Posible";
                       
//                     }
//                     if ( Chessboard.board[y-1][x+1] != null && Chessboard.board[y-1][x+1].charAt(0)=='B'){
//                         posiblemove[y-1][x+1] = "Posible";
                  
//         // }
//     }
// }    
     
    
//     repaint(temp);
//     return null;
// }  


    @Override
    public void mousePressed(MouseEvent e) {
        Piece check = new Piece();
        
       
        
        this.clicklocalx = ((e.getX()-9)/100);
        this.clicklocaly = ((e.getY()-32)/100);
        // labletest.setText(clicklocaly+" "+clicklocalx);
        check.checklayoutboard(clicklocaly, clicklocalx);
        
        if ( Piece.Pieces != null){
            
            check.posiblemovecal(clicklocaly, clicklocalx);
            
            labletest.setText(Piece.Pieces);
            // labletest.setText(Chessboard.board[clicklocaly][clicklocalx]);
            
            }
        else{
            // labletest.setText(Chessboard.board[clicklocaly][clicklocalx]);
        }
        repaint(temp);
       
        }

    @Override
    public void mouseReleased(MouseEvent e) {
       
        
        
        int releasedlocalx =((e.getX()-9)/100);
        int releasedlocaly =((e.getY()-32)/100);
        // labletest.setText(releasedlocaly+" "+ releasedlocalx);
        if (Piece.posiblemove[releasedlocaly][releasedlocalx]=="Posible" && Piece.Pieces != null){
            Chessboard.board[releasedlocaly][releasedlocalx] = Piece.Pieces;
            // labletest.setText(check.checklayoutboard(clicklocaly ,clicklocalx));
            Chessboard.board[clicklocaly][clicklocalx] = null;
            Piece.posiblemove = new String[8][8];
;
            repaint(temp);
        }
    }




    @Override
    public void mouseDragged(MouseEvent e) {
       ;
    }




    @Override
    public void mouseMoved(MouseEvent e) {
       
        labletest.setText((e.getX()-9)+" "+(e.getY()-32));
    }




    @Override
    public void mouseClicked(MouseEvent e) {
       ;
    }




    @Override
    public void mouseEntered(MouseEvent e) {
       ;
    }




    @Override
    public void mouseExited(MouseEvent e) {
       ;
    }
   
}