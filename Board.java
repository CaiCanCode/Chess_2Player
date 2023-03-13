public class Board {

    Piece[][] array;

    public int[] transform(String str){
        int[] position = new int[2];
        char column = str.charAt(0);
        char row = str.charAt(1);
        position[0] = '8' - row; 
        position[1] = column - 'A';
        if(position[0] < 1 || position[0] > 8 || position[1] < 1 || position[1] > 8) {
            return null;
        }
        return position;
    }

    public Board(){

        array = new Piece[8][8];
        King blackK = new King(false);
        King whiteK = new King(true);
        Queen blackQ = new Queen(false);
        Queen whiteQ = new Queen(true);
        Bishop blackB1 = new Bishop(false);
        Bishop blackB2 = new Bishop(false);
        Bishop whiteB1 = new Bishop(true);
        Bishop whiteB2 = new Bishop(true);
        Knight blackH1 = new Knight(false);
        Knight blackH2 = new Knight(false);
        Knight whiteH1 = new Knight(true);
        Knight whiteH2 = new Knight(true);
        Rook blackR1 = new Rook(false);
        Rook blackR2 = new Rook(false);
        Rook whiteR1 = new Rook(true);
        Rook whiteR2 = new Rook(true);

        array[0][0] = blackR1;
        array[0][1] = blackH1;
        array[0][2] = blackB1;
        array[0][3] = blackQ;
        array[0][4] = blackK;
        array[0][5] = blackB2;
        array[0][6] = blackH2;
        array[0][7] = blackR2;

        array[7][0] = whiteR1;
        array[7][1] = whiteH1;
        array[7][2] = whiteB1;
        array[7][3] = whiteQ;
        array[7][4] = whiteK;
        array[7][5] = whiteB2;
        array[7][6] = whiteH2;
        array[7][7] = whiteR2;

        for(int i = 0; i < 8; i++){
            Pawn black = new Pawn(false);
            array[1][i] = black;
        }

        for(int i = 0; i < 8; i++){
            Pawn white = new Pawn(true);
            array[6][i] = white;
        }

        for(int i = 2; i < 6; i++){
            for(int j = 0; j < 8; j++){
                Empty e = new Empty(i, j);
                array[i][j] = e;
            }
        }
    }

    public void printWhite(){
        int row = 8;
        for(int i = 0; i < 8; i++){
            System.out.print(row + " |");
            for(int j = 0; j < 8; j++){
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
            row--;
        }
        System.out.println("--|----------------");
        System.out.println("  | A B C D E F G H");
    }

    public void printBlack(){
        int row = 1;
        for(int i = 7; i > -1; i--){
            System.out.print(row + " |");
            for(int j = 7; j > -1; j--){
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
            row++;
        }
        System.out.println("--|----------------");
        System.out.println("  | H G F E D C B A");
    }

}