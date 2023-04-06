
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
    public static String[][] posiblemove =  new String[8][8];

    JPanel temp ; 

    public void repaint(JPanel temp){
        this.temp = temp;
        temp.repaint();
    }

    

    public String checklayoutboard1(int x ,int y){

        for (int i =0 ;i<9 ;i++){
            for (int j =0 ;j<9;j++){
                if (Chessboard.board[x][y] != null){
                    return Chessboard.board[x][y] ;
                }
            }
        }
        return null;
        
        }
    
    public String checkmoveto(int x,int y){
        if (Chessboard.board[x][y] == null  ){

        }
        return null;
    }
    // make list of possible move
    public String posiblemovecal(int x, int y){
        
        if (checklayoutboard1(x, y) !=null){


        for (int i = x; i < 8; i++) { 


            if (Chessboard.board[i][y] == null) {




                posiblemove[i][y] = null;

            }
        }

    }
        return null;


    }   


    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        labletest.setText(x+","+y);
        // labletest.setText(positionchar+" "+ positionnum);
        int clicklocalx = x/100;
        int clicklocaly = 8-(y/100);
        if ( checklayoutboard1(clicklocalx, clicklocaly) != null){
            posiblemovecal(clicklocalx, clicklocaly);
           
            }
        }

    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        labletest.setText(x+","+y);
        
        int releasedlocalx =x/100;
        int releasedlocaly =(y/100);
        labletest.setText(releasedlocalx+" "+ releasedlocaly);
        if (posiblemove[releasedlocalx][releasedlocaly]==null){
            Chessboard.board[releasedlocalx][releasedlocaly] = checklayoutboard1(clicklocalx ,clicklocaly);
            Chessboard.board[clicklocalx][clicklocaly] =null;
            repaint(temp);
        }
    }
   
}