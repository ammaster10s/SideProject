import javax.swing.*;



import java.awt.*;

public class Chessboard extends JPanel

{
   
    public static String position;
   
    static Color color = Color.decode("#769656");

    public static String[][] board = new String[8][8]; 
    
    Chessboard() {

        initializeBoard();

    }

    private void initializeBoard() {
        ImageCreater.resizeImagesandsetIcon("pawn");
        ImageCreater.resizeImagesandsetIcon("king");
        ImageCreater.resizeImagesandsetIcon("queen");
        ImageCreater.resizeImagesandsetIcon("bishop");
        ImageCreater.resizeImagesandsetIcon("rook");
        for (int i = 0; i < 2; i++) {
            new Piece(0, 4, "king", false);
            new Piece(7, 4, "king", true);

            new Piece(7, 3, "queen", true);
            new Piece(0, 3, "queen", false);
        }
        for (int i = 0; i < 8; i++) {
            new Piece(1, i, "pawn", false);
        }
        for (int i = 0; i < 8; i++) {
            new Piece(6, i, "pawn", true);
        }
        new Piece(0, 0, "rook", false);
        new Piece(0, 7, "rook", false);
        new Piece(7, 7, "rook", true);
        new Piece(7, 0, "rook", true);
        new Piece(0, 2, "bishop", false);
        new Piece(0, 5, "bishop", false);
        new Piece(7, 2, "bishop", true);
        new Piece(7, 5, "bishop", true);
    }

    protected void paintComponent(Graphics g) { // Graphics2d g2d = (Graphics2d) g;
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int[] x = { 0, 0, 800, 800, 0 };
        int[] y = { 0, 800, 800, 0, 0 };

        // Piece.setIcons();
        g2d.setColor(color);
        g2d.drawPolyline(x, y, 5);

        g2d.setColor(color);
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if (j % 2 == 0) {
                    if (i % 2 != 0) {
                        g2d.fillRect(i * 100, j * 100, 100, 100);
                    }
                }

                else if (j % 2 != 0) {
                    if (i % 2 == 0) {
                        g2d.fillRect(i * 100, j * 100, 100, 100);
                    }
                }
            }
        }
        g2d.setColor(Color.decode("#FFFDD0"));
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                if (j % 2 == 0) {
                    if (i % 2 == 0) {
                        g2d.fillRect(i * 100, j * 100, 100, 100);
                    }
                }

                else if (j % 2 != 0) {
                    if (i % 2 != 0) {
                        g2d.fillRect(i * 100, j * 100, 100, 100);
                    }
                }
            }
        }
        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 8; i++) {
                g2d.setColor(Color.decode("#ffd692"));
                if (Piece.posiblemove[j][i] != null) {
                    g2d.fillRect(i * 100, j * 100, 100, 100);
                    g2d.setColor(Color.decode("#D3D3D3"));
                    g2d.fillOval(i * 100 + 30, j * 100 + 30, 40, 40);
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int p = 0; p < 8; p++) {
                if (board[p][i] == "Wpawn") {
                    // this.add(Pawn.jlPicwhite);
                    Image image = ImageCreater.imgwhitepawn.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Bpawn") {
                    // this.add(Pawn.jlPicblack).setLocation(i*100, j*100);

                    Image image = ImageCreater.imgblackpawn.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Wking") {

                    Image image = ImageCreater.imgwhiteking.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Bking") {

                    Image image = ImageCreater.imgblackking.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Wqueen") {

                    Image image = ImageCreater.imgwhitequeen.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Bqueen") {

                    Image image = ImageCreater.imgblackqueen.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Wbishop") {

                    Image image = ImageCreater.imgwhitebishop.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Bbishop") {

                    Image image = ImageCreater.imgblackbishop.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Wrook") {

                    Image image = ImageCreater.imgwhiterook.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }
                if (board[p][i] == "Brook") {

                    Image image = ImageCreater.imgblackrook.getImage();
                    g2d.drawImage(image, i * 100, p * 100, null);
                }

            }
        }
        for (int i = 0; i < 800; i += 100) {
            g2d.setColor(Color.BLACK); // Vertical line
            g2d.drawLine(i, 0, i, 800);

        }
        for (int j = 0; j < 800; j += 100) {
            g2d.setColor(Color.BLACK); // Horizontal
            g2d.drawLine(0, j, 800, j);
        }
    }

}
