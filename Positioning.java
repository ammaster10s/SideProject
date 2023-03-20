public class Positioning {
    static String[] options = {"♙","♟","♘","♞","♗","♝","♖"," ♜","♕","♛","♔","♚"};
    

    Positioning(){
        String[][] position = new String[8][8];
        for (int i=1 ; i<=8;i++){
            position[2][i] = options[1];
            position[7][i] = options[0];
        }

        position[1][1]  = options[6];
        position[1][8] = options[6];
    }



    public static void main(String[] args) {
        Positioning test = new Positioning();
        // for (int i = 1 ; i<=8;i++){
            System.out.println(Positioning.position);
        // }
    }
}
