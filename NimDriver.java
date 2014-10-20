//Douglas Kiang
//Accepts player move, calls play() from Nim class.
import java.util.Scanner;
 
public class NimDriver{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("What is the total number of pieces?\n"); //Prompts user for total number of pieces.
    int startnum = in.nextInt(); //Takes this number and makes it the starting number of pieces.
    int pieces; 
    int playermove;
    Nim test = new Nim(); //Creates new object.
    pieces = startnum;
    
    while (pieces > 1){
      System.out.println("There are " + pieces + " pieces remaining.");
      System.out.println("Enter your move: ");
      playermove = in.nextInt();
      while ((playermove < 1) || (playermove > 2)){ //checks to see if number is within range
        System.out.println("Please enter 1 or 2: ");
        playermove = in.nextInt();
      }
      pieces -= playermove;
      if (pieces == 1){
        System.out.println("Computer loses.");
        
        
      }
      else System.out.println("There are " + pieces + " pieces remaining.");
      int compmove = test.play(pieces);
      pieces -= compmove;
      System.out.println("The computer took " + compmove + " pieces.");
      if (pieces == 1){
        System.out.println("You lose.");
      }
    }
  }
}


