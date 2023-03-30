
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

    
    MouseMotion(JLabel labletest){
    this.labletest = labletest;}
    public static String[][] board = new String[8][8];

    JPanel temp ; 

    public void repaint(JPanel temp){
        this.temp = temp;
        temp.repaint();
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
        if (board[x][y] == null  ){

        }
        return null;
    }

    public boolean posiblemove(int x, int y){
        checklayoutboard1(x, y);
        int counter = 0;
        for (int i = 0; i < 8; i++) { 
            if (board[i][y] == null) {
                counter += 1;
            }
        }
        return counter > 0;
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        // labletest.setText("The mouse is Dragged");
        // int x = e.getX();
        // int y = e.getY();
        // labletest.setText(x+","+y);
        
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        labletest.setText("The mouse is moved");
        int x = e.getX();
        int y = e.getY();
        labletest.setText(x+","+y);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        // labletest.setText("The mouse is clicked");
         
        // int x = e.getX();
        // int y = e.getY();
        // labletest.setText(x+","+y);
        // positionchar = Postion[x/100];
        // positionnum = 8-y/100;
        // labletest.setText(positionchar+" "+ positionnum);
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        labletest.setText(x+","+y);
        String positionchar = Postion[x/100];
        int positionnum = 8-(y/100);
        labletest.setText(positionchar+" "+ positionnum);
        int clicklocalx = x/100;
        int clicklocaly = 8-(y/100);
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        labletest.setText(x+","+y);
        String positionchar = Postion[x/100];
        int positionnum = 8-y/100;
        labletest.setText(positionchar+" "+ positionnum);
        int releasedlocalx =x/100;
        int releasedlcoaly =8-(y/100);
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }
}