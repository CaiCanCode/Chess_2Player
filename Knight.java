public class Knight implements Piece {

    boolean white;
    int[] position;

    public Knight(boolean white){
        this.white = white;
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
            return "H";
        }
        return "h";
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