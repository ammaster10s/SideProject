
public abstract class Piece {
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
		protected boolean isWhite;
	
		public Piece(int x, int y, boolean isWhite) {
			this.x = x;
			this.y = y;
			this.isWhite = isWhite;
		}
	
		// public abstract List<Move> getPossibleMoves(Board board);
	
		public void move(int newX, int newY) {
			this.x = newX;
			this.y = newY;
		}
	
		public boolean isWhite() {
			return isWhite;
		}
	}
