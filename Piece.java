import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;


public class Piece extends JPanel {
	//for future AI
	public static final int KING = 1;
	public static final int QUEEN = 2;
	public static final int ROOK = 3;
	public static final int KNIGHT = 4;
	public static final int BISHOP = 5;
	public static final int PAWN = 6;
	
	//constant values for the pieces
	public static final int KING_VALUE = 1000000;
	public static final int QUEEN_VALUE = 9;
	public static final int ROOK_VALUE = 5;
	public static final int KNIGHT_VALUE = 3;
	public static final int BISHOP_VALUE = 3;
	public static final int PAWN_VALUE = 1;
	protected int x;
	protected int y;
	protected boolean color ;
	int Visibility;
	static String  Pieces  ;

	static ImageIcon imgblackpawn;
	static ImageIcon imgwhitepawn;
	
	static ImageIcon imgblackking;
	static ImageIcon imgwhiteking;
	
	static ImageIcon imgblackqueen;
	static ImageIcon imgwhitequeen;

	// static JLabel jlPicblack = new JLabel();
	// static JLabel jlPicwhite = new JLabel();

	// 	JPanel panelforpic = new JPanel();
	
	private static int[] scanXKQ = {-1,0,1,1,1,0,-1,-1};
	private static int[] scanYKQ = {1,1,1,0,-1,-1,-1,0};
		
	
	static String[][] posiblemove =  new String[8][8];

		public Piece(){}

		public Piece(int x,int y,String type , boolean Color1){
			if (type == "pawn"){
				Pawn(x, y, Color1);}
			if (type == "king"){
				King(x ,y, Color1);
			}
			if (type == "queen"){
				Queen(x ,y, Color1);
			}
			}
		

		public void Pawn(int x , int y ,boolean Color1){
			if (Color1 == true){
				Chessboard.board[x][y] = "Wpawn";
			}
			else{
				Chessboard.board[x][y]= "Bpawn";
			}
	
	
	
		}
		public void King(int x , int y ,boolean Color1){
			
			if (Color1 == true){
				Chessboard.board[x][y] = "Wking";
			}
			else{
				Chessboard.board[x][y]= "Bking";
			}
	
	
	
		}
		public void Queen(int x , int y ,boolean Color1){
			if (Color1 == true){
				Chessboard.board[x][y] = "Wqueen";
			}
			else{
				Chessboard.board[x][y]= "Bqueen";
			} 
		}
		public  String checklayoutboard(int y ,int x){
			
       
            if (Chessboard.board[y][x] != null){
                Pieces = Chessboard.board[y][x] ;
				
                if  (Pieces.charAt(1) == 'p' || Pieces.charAt(1) == 'k'){
					this.Visibility =2 ;
					if ( Pieces.charAt(0) == 'W'){
						this.color = true;}
					else  {
						this.color = false;
					}
					}
				if  (Pieces.charAt(1) == 'q' || Pieces.charAt(1) == 'b'){
					this.Visibility = 8 ;
					if ( Pieces.charAt(0) == 'W'){
						this.color = true;}
					else  {
						this.color = false;
					}
					}
				}
            
            else{return( Pieces = null);}

            return Pieces;

        }

		public void posiblemovecal(int y, int x ) {
			
			if (this.color == false) {
				
				for (int j=0 ;j<Visibility; j+=1){
					for (int Y:scanYKQ ){
						for (int X:scanXKQ){
							try{
							// 	for (int i = 0; i < skipx.length; i++) {
							// 		if (skipy[i] == Y && skipx[i] == X) {
							// 			found = true;
							// 			break;
							// 		}
							// 	}
							// 	if(found){
							// 		found = false;
							// 		continue;
							// }
								 {
									if(Chessboard.board[y+(Y*j)][x+(X*j)] == null ){
										posiblemove[y+(Y*j)][x+(X*j)]="Posible";
									} else if(Pieces.charAt(0) == 'B'){
										if(Chessboard.board[y+(Y*j)][x+(X*j)].charAt(0) == 'W'){
											posiblemove[y+(Y*j)][x+(X*j)]="Posible";
											System.out.println(X+" "+ Y);
											System.out.println("opass");
											removeElement(X, Y);
											
											// counter += 1;
											// found = true;
										} else if(Chessboard.board[y+(Y*j)][x+(X*j)].charAt(0) == 'B'){
											// skipy[counter] = Y;
											// skipx[counter] = X;
											// counter += 1;
											// found = true;
											System.out.println("1pass");
											removeElement(X, Y);
										}
									} else if(Pieces.charAt(0) == Chessboard.board[y+(Y*j)][x+(X*j)].charAt(0)){
										// skipy[counter] = Y;
										// skipx[counter] = X;
										// counter += 1;
										// found = true;
										System.out.println("2pass");
										removeElement(X, Y);
									}
								}
							} catch (ArrayIndexOutOfBoundsException e){
								continue;
							}
							System.out.println(Arrays.toString(scanXKQ)+""+Arrays.toString(scanYKQ));
						}
					}
				}
			}
		}
		
	
	
	
		public static void removeElement(int X, int Y) {
			int counterX = 0;
			int counterY = 0;
			for (int i : scanXKQ) {
				if (i == X) {
					scanXKQ[counterX] = 8;
					counterX += 1;
					break;
				} else {
					scanXKQ[counterX] =i;
					counterX += 1;
					
			}
			for (int j : scanYKQ) {
				if (j == Y) {
					scanYKQ[counterY] = 8;
					counterY += 1;
					break;
				} else {
					scanYKQ[counterY] = j;
					counterY += 1;
				}
			}
		}
		
		}
				
		
			public static void resizeImagesandsetIcon(String piece) {
				
				if ( piece.charAt(0) == 'k')
				{try {
					// Load original PNG images
					Image originalBlack = ImageIO.read(new File("Bking.png"));
					Image originalWhite = ImageIO.read(new File("Wking.png"));
		
					// Resize images to 100x100 pixels
					Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
					Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		
					// Create new ImageIcon objects from resized images
					imgblackking = new ImageIcon(resizedBlack);
					imgwhiteking = new ImageIcon(resizedWhite);
					
					// jlPicblack.setIcon(imgblackking);
					// jlPicwhite.setIcon(imgwhiteking);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			else if ( piece.charAt(0) == 'p')
				{try {
					// Load original PNG images
					Image originalBlack = ImageIO.read(new File("Bpawn.png"));
					Image originalWhite = ImageIO.read(new File("Wpawn.png"));
		
					// Resize images to 100x100 pixels
					Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
					Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		
					// Create new ImageIcon objects from resized images
					imgblackpawn = new ImageIcon(resizedBlack);
					imgwhitepawn = new ImageIcon(resizedWhite);
					
					// jlPicblack.setIcon(imgblackpawn);
					// jlPicwhite.setIcon(imgwhitepawn);
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				}
			else if ( piece.charAt(0) == 'q')
			{try {
				// Load original PNG images
				Image originalBlack = ImageIO.read(new File("Bqueen.png"));
				Image originalWhite = ImageIO.read(new File("Wqueen.png"));
	
				// Resize images to 100x100 pixels
				Image resizedBlack = originalBlack.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
				Image resizedWhite = originalWhite.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	
				// Create new ImageIcon objects from resized images
				imgblackqueen = new ImageIcon(resizedBlack);
				imgwhitequeen= new ImageIcon(resizedWhite);
				
				// jlPicblack.setIcon(imgblackpawn);
				// jlPicwhite.setIcon(imgwhitepawn);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
			}
		
		
		
		
		
		}
		

			
		
		
		
			