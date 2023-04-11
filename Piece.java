
import javax.swing.*;




public class Piece  {
	//for future AI i
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
	
	protected boolean color ;
	int Visibility;
	static String  Pieces  ;

	static boolean incheck = false;

	private static int[] scanXKQ = {-1,0,1,1,1,0,-1,-1};
	private static int[] scanYKQ = {1,1,1,0,-1,-1,-1,0};

	private static int[] scanXpawn = {-1,0,1};
	private static int[] scanYpawn = {1,1,1};

	private static int[] scanXbis = {-1,1,1,-1};
	private static int[] scanYbis = {1,1,-1,-1};

	private static int[] scanXrook = {0,1,0,-1};
	private static int[] scanYrook = {1,0,-1,0};
		
	
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
			if (type == "bishop"){
				Bishop(x, y, Color1);
			}
			if (type == "rook"){
				Rook(x ,y, Color1);
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

		public void Bishop(int x , int y ,boolean Color1){
			if (Color1 == true){
				Chessboard.board[x][y] = "Wbishop";
			}
			else{
				Chessboard.board[x][y]= "Bbishop";
			} 
		}

		public void Rook(int x , int y ,boolean Color1){
			if (Color1 == true){
				Chessboard.board[x][y] = "Wrook";
			}
			else{
				Chessboard.board[x][y]= "Brook";
			} 
		}

		public  String checklayoutboard(int y ,int x){
			
       
            if (Chessboard.board[y][x] != null){
                Pieces = Chessboard.board[y][x] ;
				
                if  (Pieces.charAt(1) == 'p' || Pieces.charAt(1) == 'k'){
					this.Visibility =1 ;
					if ( Pieces.charAt(0) == 'W'){
						this.color = true;}
					else  {
						this.color = false;
					}
					}
				if  (Pieces.charAt(1) == 'q' || Pieces.charAt(1) == 'b' || Pieces.charAt(1) == 'r'){
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
			
			if (this.color == false && MouseMotion.turntomove == false) {
				
				if (Pieces.charAt(1) == 'k' || Pieces.charAt(1) == 'q' ){		//King / Queen /bishop
					for (int i = 0 ; i< scanXKQ.length  ; i++ ){
						for (int j=1 ;j<=Visibility; j+=1){
							try{
							
								 
									if(Chessboard.board[y+(scanYKQ[i]*j)][x+(scanXKQ[i]*j)] == null ){
										posiblemove[y+(scanYKQ[i]*j)][x+(scanXKQ[i]*j)]="Posible";}

									else if(Chessboard.board[y+(scanYKQ[i]*j)][x+(scanXKQ[i]*j)].charAt(0) == 'W'){
										posiblemove[y+(scanYKQ[i]*j)][x+(scanXKQ[i]*j)]="Posible";
										break;
										}
									else if(Pieces.charAt(1) == 'k' || Pieces.charAt(1) == 'q'){

										if(Chessboard.board[y+(scanYKQ[i]*j)][x+(scanXKQ[i]*j)].charAt(0) == 'B'){
											
											break;
										}
									} 
									
							}
							 catch (ArrayIndexOutOfBoundsException e){
								continue;
							}
							
						
						}
					}
				}
				else if (Pieces.charAt(1) == 'p')	{	//Pawn
					for (int i = 0 ; i< scanXpawn.length  ; i++ ){
						for (int j=1 ;j<=Visibility; j+=1){
							try{
	 
									if(Chessboard.board[y+(scanYpawn[i]*j)][x+(scanXpawn[i]*j)] == null  ){
										if ( scanXpawn[i] == 0){
											if (y == 1){	
										posiblemove[y+(scanYpawn[i]*2*j)][x+(scanXpawn[i]*j)]="Posible";}
										
										posiblemove[y+(scanYpawn[i]*j)][x+(scanXpawn[i]*j)]="Posible";
										}
									}
									else if(Chessboard.board[y+(scanYpawn[i]*j)][x+(scanXpawn[i]*j)].charAt(0) == 'W'  ){
										if ( scanXpawn[i] != 0){
										posiblemove[y+(scanYpawn[i]*j)][x+(scanXpawn[i]*j)]="Posible";
										break;
										}
									}
							}
							 catch (ArrayIndexOutOfBoundsException e){
								continue;
							}
							
						
						}
					}
				}
				else if (Pieces.charAt(1) == 'b'){
					for (int i = 0 ; i< scanXbis.length  ; i++ ){
						for (int j=1 ;j<=Visibility; j+=1){
							try{
	 
									if(Chessboard.board[y+(scanYbis[i]*j)][x+(scanXbis[i]*j)] == null  ){
										posiblemove[y+(scanYbis[i]*j)][x+(scanXbis[i]*j)]="Posible";
										}
									
									else if(Chessboard.board[y+(scanYbis[i]*j)][x+(scanXbis[i]*j)].charAt(0) == 'W'  ){
										
										posiblemove[y+(scanYbis[i]*j)][x+(scanXbis[i]*j)]="Posible";
										break;
										
									}
									else if(Chessboard.board[y+(scanYbis[i]*j)][x+(scanXbis[i]*j)].charAt(0) == 'B'){
											
										break;
									}
							}
							 catch (ArrayIndexOutOfBoundsException e){
								continue;
							}
							
						
						}
					}
				}
				else if (Pieces.charAt(1) == 'r'){
					for (int i = 0 ; i< scanXrook.length  ; i++ ){
						for (int j=1 ;j<=Visibility; j+=1){
							try{
	 
									if(Chessboard.board[y+(scanYrook[i]*j)][x+(scanXrook[i]*j)] == null  ){
										posiblemove[y+(scanYrook[i]*j)][x+(scanXrook[i]*j)]="Posible";
										}
									
									else if(Chessboard.board[y+(scanYrook[i]*j)][x+(scanXrook[i]*j)].charAt(0) == 'W'  ){
										
										posiblemove[y+(scanYrook[i]*j)][x+(scanXrook[i]*j)]="Posible";
										break;
										
									}
									else if(Chessboard.board[y+(scanYrook[i]*j)][x+(scanXrook[i]*j)].charAt(0) == 'B'){
											
										break;
									}
							}
							 catch (ArrayIndexOutOfBoundsException e){
								continue;
							}
							
						
						}
					}
				}





			}
			
			if (this.color == true && MouseMotion.turntomove == true) {
				
				if (Pieces.charAt(1) == 'k' || Pieces.charAt(1) == 'q'){		//King / Queen
				for (int i = 0 ; i< scanXKQ.length  ; i++ ){
					for (int j=1 ;j<=Visibility; j+=1){
						try{
						
							 
							if(Chessboard.board[y-(scanYKQ[i]*j)][x+(scanXKQ[i]*j)] == null ){
								posiblemove[y-(scanYKQ[i]*j)][x+(scanXKQ[i]*j)]="Posible";}

							else if(Chessboard.board[y-(scanYKQ[i]*j)][x+(scanXKQ[i]*j)].charAt(0) == 'B'){
								posiblemove[y-(scanYKQ[i]*j)][x+(scanXKQ[i]*j)]="Posible";
								break;
								

							}
							else if(Pieces.charAt(1) == 'k' || Pieces.charAt(1) == 'q'){

								if(Chessboard.board[y-(scanYKQ[i]*j)][x+(scanXKQ[i]*j)].charAt(0) == 'W'){
									
									break;
								}
							} 
						}
					 	catch (ArrayIndexOutOfBoundsException e){
							continue;
						}
						
					
				}
			}
		}
			else if (Pieces.charAt(1) == 'p')	{	//Pawn
				for (int i = 0 ; i< scanXpawn.length  ; i++ ){
					for (int j=1 ;j<=Visibility; j+=1){
						try{
				 
								if(Chessboard.board[y-(scanYpawn[i]*j)][x+(scanXpawn[i]*j)] == null  ){
									if ( scanXpawn[i] == 0){
										if (y == 6){	
									posiblemove[y-(scanYpawn[i]*2*j)][x+(scanXpawn[i]*j)]="Posible";}
									posiblemove[y-(scanYpawn[i]*j)][x+(scanXpawn[i]*j)]="Posible";
									}
								}
								else if(Chessboard.board[y-(scanYpawn[i]*j)][x+(scanXpawn[i]*j)].charAt(0) == 'B'  ){
									if ( scanXpawn[i] != 0){
									posiblemove[y-(scanYpawn[i]*j)][x+(scanXpawn[i]*j)]="Posible";
									break;
									}
								}
						}
						 catch (ArrayIndexOutOfBoundsException e){
							continue;
						}
						
					
					}
				}
			}

			else if (Pieces.charAt(1) == 'b'){
				for (int i = 0 ; i< scanXbis.length  ; i++ ){
					for (int j=1 ;j<=Visibility; j+=1){
						try{
 
								if(Chessboard.board[y-(scanYbis[i]*j)][x+(scanXbis[i]*j)] == null  ){
									posiblemove[y-(scanYbis[i]*j)][x+(scanXbis[i]*j)]="Posible";
									}
								
								else if(Chessboard.board[y-(scanYbis[i]*j)][x+(scanXbis[i]*j)].charAt(0) == 'B'  ){
									
									posiblemove[y-(scanYbis[i]*j)][x+(scanXbis[i]*j)]="Posible";
									break;
									
								}
								else if(Chessboard.board[y-(scanYbis[i]*j)][x+(scanXbis[i]*j)].charAt(0) == 'W'){
										
									break;
								}
						}
						 catch (ArrayIndexOutOfBoundsException e){
							continue;
						}
						
					
					}
				}
			}
			else if (Pieces.charAt(1) == 'r'){
				for (int i = 0 ; i< scanXrook.length  ; i++ ){
					for (int j=1 ;j<=Visibility; j+=1){
						try{
 
								if(Chessboard.board[y-(scanYrook[i]*j)][x+(scanXrook[i]*j)] == null  ){
									posiblemove[y-(scanYrook[i]*j)][x+(scanXrook[i]*j)]="Posible";
									}
								
								else if(Chessboard.board[y-(scanYrook[i]*j)][x+(scanXrook[i]*j)].charAt(0) == 'B'  ){
									
									posiblemove[y-(scanYrook[i]*j)][x+(scanXrook[i]*j)]="Posible";
									break;
									
								}
								else if(Chessboard.board[y-(scanYrook[i]*j)][x+(scanXrook[i]*j)].charAt(0) == 'W'){
										
									break;
								}
						}
						 catch (ArrayIndexOutOfBoundsException e){
							continue;
						}
						
					
					}
				}
			}
			}
		}
	
		
		public void checkking (int y, int x){
			posiblemove[y][x] = "Check";
		}

		public static void promotion (int y , int x, boolean color){
			if (color == true && y == 0){
			
			Chessboard.board[y+1][x] = null;
			Chessboard.board[y][x] = "Wqueen";
			}
			else if (color == false && y==7){
				Chessboard.board[y-1][x] = null;
				Chessboard.board[y][x] = "Bqueen";
				}
		}
		
		
	}
