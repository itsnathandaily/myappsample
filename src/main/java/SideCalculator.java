import java.util.*;


public class SideCalculator{

    private int maxItemsAllowed;
    int RAND;
  
  public void SideCalculator(){
    RAND = 1;
  }


    public int getRandom(int number){
        Random random = new Random();
        maxItemsAllowed = number;
        this.RAND = random.nextInt(number);
        return RAND;
    }


    public boolean checkAnswer(int answer, int random){
      
       
        return (answer==random);

    }
  
  public boolean HigherThanMax(int checknumber, int MaxNumber){
   
   boolean higher = true;
   
   if (checknumber>MaxNumber){
   return higher;}
   else {
     return !higher;} 
   }

}