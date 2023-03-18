import javax.swing.*;
import java.awt.*;
public class Chessboard extends JPanel{
    String[] Postion = {"A","B","C","D","E","F","G","H"};
    Chessboard(){} // สร้าง panel ปล่าว
    
    protected void paintComponent(Graphics g){      //Graphics2d  g2d = (Graphics2d) g;

        int[] x = { 0,0,800,800,0};
        int[] y = {0,800,800,0,0};
        g.setColor(Color.decode("#769656"));
        g.drawPolyline(x, y, 5);
        for (int i=0 ; i<800 ;i+=100){    
            g.setColor(Color.decode("#769656"));                   //Vertical line
            g.drawLine(i, 0, i, 800);
       }
        for (int j = 0 ; j<800;j+=100){  
            g.setColor(Color.decode("#769656"));                   //Horizontal
            g.drawLine(0,j,800,j);
        }
        
        // fill black
        g.setColor(Color.decode("#769656"));
        for (int j = 0 ; j <8;j++){             //Y axis
            for (int i =0; i<8 ; i++)         //X axis
                {if (j%2 == 0){
                    if (i%2!=0){g.fillRect(i*100, j*100, 100, 100);}
                    }
                   
                
                else if (j%2!=0){
                    if(i%2==0){
                        g.fillRect(i*100, j*100, 100, 100);
                    }
                }
            }

                
            
            }
        }
    public void position(){
            mouseClicked()
            if (x<101){
                

            }




        }
    }
    


   

