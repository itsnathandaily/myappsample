import java.util.*;
import java.io.Console;

public class GuessingGame {
    public static void main(String[] args) {

        Console console = System.console();
        SideCalculator game = new SideCalculator();
      Prompter prompt = new Prompter();
        boolean correctGuess = false;

        System.out.println("");
        System.out.println("WELCOME TO THE GUESSING GAME");
        System.out.println("------------------------------\n");

        
      String itemInJar = prompt.nameOfItems();
      
        int numberOfItems = prompt.MaxNumberOfItems(itemInJar);

        int randomNumber = game.getRandom(numberOfItems);

        //System.out.printf("random number is %d\n",randomNumber);
      
      boolean yanswer = prompt.CheckGuess(randomNumber);


        System.out.println("");
        if (yanswer==true){

            System.out.println("You did well. Thanks for playing Guessing Game");
        }

        if(yanswer==false){
            System.out.println("Sorry you ran out of guesses.  Thanks for playing Guessing Game");
        }

    }
}