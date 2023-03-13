public class King implements Piece {

    boolean white;
    boolean move;
    int[] position;
    boolean check;
    boolean checkmate;

    public King(boolean white){
        this.white = white;
        move = false;
        check = false;
        checkmate = false;
        position = new int[2];
    }
    
    public int[] getPosition(){
        return position;
    }

    public boolean white(){
        return white;
    }

    public String toString(){
        if(white()){
            return "K";
        }
        return "k";
    }

    public boolean whiteTurn(int i, int j, Board array){
        position[0] = i;
        position[1] = j;
        if(!white){
            System.out.println("Please select a peice in your colour.");
            return false;
        }

        // TODO: this.

        return true;
    }

    public boolean blackTurn(int i, int j, Board array){
        position[0] = i;
        position[1] = j;
        if(white){
            System.out.println("Please select a peice in your colour.");
            return false;
        }

        // TODO: this.

        return true;
    }

}