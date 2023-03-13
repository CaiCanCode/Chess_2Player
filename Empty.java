public class Empty implements Piece {

    private int[] position;

    public Empty(int i, int j){
        position = new int[2];
        position[0] = i;
        position[1] = j;
    }

    public int[] getPosition(){
        return position;
    }

    public boolean white(){
        return position[0]%2 == position[1]%2;
    }

    public String toString(){
        if(white()){
            return " ";
        }
        return "#";
    }

}