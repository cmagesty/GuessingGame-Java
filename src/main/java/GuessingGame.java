public class GuessingGame
{
    public static void main(String[] args) {
      
      int count = 1;
      Prompter prompter = new Prompter();
      prompter.adminSetup();
      Jar jar = new Jar(prompter.promptForItem(), prompter.promptForNumber());
      jar.fill();
      prompter.playerStart();
      prompter.promptForGuess();
      prompter.guess();
      while (prompter.guessNumber() != jar.getNumber()){ 
        if(!jar.isValidNumber(prompter.guessNumber())){
          prompter.error();
        }
        else {
          count++;
          if(prompter.guessNumber() > jar.getNumber()){
            prompter.guessTooHigh();
          } 
          if(prompter.guessNumber() < jar.getNumber()){
            prompter.guessTooLow();
          }
        }
        prompter.guess();
      }
      prompter.correctTries(count);
     }
}