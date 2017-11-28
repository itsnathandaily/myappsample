import java.util.*;
import java.io.Console;

public class Prompter{
 Console console = System.console();
 SideCalculator game2 = new SideCalculator();
  
  
  boolean correctGuess = false;
  int number;
  
  protected String nameOfItems(){
  String name = console.readLine("What type of item is in the Jar: ");
  return name;
  
  }
  
  protected int MaxNumberOfItems(String itemName){
  
        System.out.printf("What is the maximum number of %s that can be in the jar? ",itemName);
        number = Integer.parseInt(console.readLine());
        return number;
  }
   
  protected boolean CheckGuess(int madeupnumber){
  
  int loopCount=number;
    int madeup = madeupnumber;


        while (!correctGuess||loopCount!=0){

            int yourGuess = Integer.parseInt(console.readLine("Guess how many are currently in the jar: "));
            boolean higher = game2.HigherThanMax(yourGuess,number); 
          
            if (higher){
             
              //yourGuess = Integer.parseInt(console.readLine("Your guess is higher than the maximum number.  Guess again: "));
              System.out.println("Your guess must be less than maximum fill amount. Try again");
            } 
          
            if(!higher){
            
            correctGuess = game2.checkAnswer(yourGuess, madeup);

                      if (correctGuess){
                          System.out.println("Yes! That's correct, congratulations!");
                          break;
          
                      }
                    if(!correctGuess){
        
                        loopCount--;
                        System.out.printf("Wrong, please try again. You have %d guesses left. \n",loopCount);
        
                        if(loopCount==0){break;}
                    }
            }    
        }
    
    return correctGuess;

  }
}