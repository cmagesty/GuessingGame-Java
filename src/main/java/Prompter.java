import java.util.*;
import java.io.*;

public class Prompter{
  Scanner scanner = new Scanner(System.in);
  String itemName;
  int MAX_NUMBER;
  int guess;
 
  public void adminSetup(){
    System.out.printf("ADMINISTRATOR SETUP \n");
    System.out.printf("=================== \n");
  }
  public void playerStart(){
    System.out.printf("Player \n");
    System.out.printf("=================== \n");
  }
  public String promptForItem(){
    System.out.printf("What type of item? ");
    return itemName = scanner.nextLine();
  }
  public int promptForNumber(){
    System.out.printf("What is the maximum amount of %s? ", itemName); 
    return MAX_NUMBER = scanner.nextInt();
  }
  public void promptForGuess(){
    System.out.printf("How many %s are in the jar? Pick a number between 1 and %d \n", itemName, MAX_NUMBER);  
  }
  public int guess(){
    System.out.printf("Guess: ");
    return guess = scanner.nextInt();
  }
  public int guessNumber(){
    return guess;
  }
  public void error(){
    System.out.printf("Your guess must be less than %s \n" , MAX_NUMBER); 
  }
  public void correctTries(int tries){
    System.out.printf("You got it in %s tries", tries);
  }  
  public void guessTooLow(){
    System.out.printf("Your guess is too low \n");
  }
  public void guessTooHigh(){
    System.out.printf("Your guess is too high \n");
  }
}