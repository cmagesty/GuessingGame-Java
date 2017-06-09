import java.util.*;

public class Jar{
  
  private String itemName;
  private int MAX_NUMBER;
  private int randomNumber;
  
  public Jar(String itemName, int MAX_NUMBER){
    this.itemName = itemName;
    this.MAX_NUMBER = MAX_NUMBER;
  }
  public void fill(){
     Random random = new Random();
     this.randomNumber = random.nextInt(MAX_NUMBER-1) + 1;
     System.out.printf("random number: %s \n", randomNumber);
   }
  public int getNumber(){
    return randomNumber;
  }
  public boolean isValidNumber(int guess){
    if (guess > MAX_NUMBER){
      return false;
    }
    return true;
  }
}