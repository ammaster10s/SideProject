import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Chessboard1 extends JPanel {

    private static final int BOARD_SIZE = 800;
    private static final String[] OPTIONS = {"♙", "♟", "♘", "♞", "♗", "♝", "♖", "♜", "♕", "♛", "♔", "♚"};

    private String[][] board = new String[8][8];
    private ArrayList<Piece> pieces = new ArrayList<Piece>(32);

    public Chessboard1() {
        initializeBoard();
        setPreferredSize(new Dimension(BOARD_SIZE, BOARD_SIZE));
    }

    private void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            board[1][i] = "whitePawn";
            board[6][i] = "blackPawn";
        }
        // add other pieces to the board
    }

    private void drawChessboard(Graphics g) {
        int cellSize = BOARD_SIZE / 8;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(Color.decode("#769656"));
                } else {
                    g.setColor(Color.WHITE);
                }
                g.fillRect(col * cellSize, row * cellSize, cellSize, cellSize);
            }
        }
    }

    private void addPiecesToBoard() {
        // iterate over pieces list and add each piece to the board
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawChessboard(g);
        addPiecesToBoard();
    }

    public int positionToPixelX(String position) {
        // use a Map instead of a Hashtable for better performance
        Map<String, Integer> positionToPixelMap = new HashMap<>();
        positionToPixelMap.put("A", 750);
        
    }
}
