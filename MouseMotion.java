import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class MouseMotion implements MouseListener, MouseMotionListener{
    
    JLabel labletest;
    String[] Postion = {"A","B","C","D","E","F","G","H"};
    MouseMotion(JLabel labletest){
    this.labletest = labletest;}
   
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
        if
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        labletest.setText("The mouse is clicked");
         
        int x = e.getX();
        int y = e.getY();
        labletest.setText(x+","+y);
        String positionchar = Postion[x/100];
        int positionnum = 8-y/100;
        labletest.setText(positionchar+" "+ positionnum);
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        labletest.setText(x+","+y);
        String positionchar = Postion[x/100];
        int positionnum = 8-y/100;
        labletest.setText(positionchar+" "+ positionnum);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        labletest.setText(x+","+y);
        String positionchar = Postion[x/100];
        int positionnum = 8-y/100;
        labletest.setText(positionchar+" "+ positionnum);
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