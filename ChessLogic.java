import java.util.*;

public class ChessLogic {

    public ChessLogic () {}

    public void PrintMenu() {

        Scanner scn = new Scanner(System.in);

        System.out.printf("Instruction Menu:\nReturn here at any time by pressing h\nPress enter to continue");
        scn.nextLine();
   
        System.out.printf("WHITE plays first; black PLAYS SECOND\nOn empty spaces, # represents a black tile\n");
        scn.nextLine();
        
        System.out.printf("At any point:\nPress L to conceed the game (black would press l)\nPress M if you successfully checkmate your oponent (if the system doesn't catch it). After you press M, Your oponent will have to agree they lost by pressing l, or they can press c to cancel and keep playing (the comands would be m, L, and c if black won)\nPress d to draw (both players must press d)\n");
        scn.nextLine();

        System.out.printf("Enter all board positions in the following fomat: A1\nRemember to capitalize the letter; error messages will give desciptive hints about why your move is invalid, and you will get the chance to replay your turn\n");
        scn.nextLine();

        System.out.printf("Remember, either player can press h at any time to read this menu again\nEnjoy the game\n");
        scn.nextLine();

        scn.close();

    }

    public boolean white (Board array) {
        Scanner scn = new Scanner(System.in);
        scn.close();
        return true; //So it compiles, TODO
    }

    public boolean black (Board array) {
        Scanner scn = new Scanner(System.in);
        scn.close();
        return true; //So it compiles, TODO
    }

}