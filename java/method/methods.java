import java.util.Random;
import java.util.Scanner;

  class Game{
    int randint,userint,noOfGuesses=0;
    public Game(){
        Random rand=new Random();
        randint = rand.nextInt(101);
    }
    public void TakeUserInput() 
    {
        Scanner gameinput = new Scanner(System.in);
        System.out.println("Guess any number (0 to 100)= ");
        userint=gameinput.nextInt();
    }
    public void isCurrectNumber(){
        if(userint>randint){
            System.out.println("\t TOO HIGH !");
        }
        else if(userint < randint)
        {
            System.out.println("\t TOO LOW!");
        }
        else if(userint == randint)
        {
            System.out.println("\n\t COURRECT NUMBER!");
        }
    }
    public void setnoOfGuesses(int i) {
        noOfGuesses=i;
    }
    
    public int getnoOfguesses() {
        return noOfGuesses;
    }
    
  }
public class methods{
    public static void main(String args[])
    {
        Game game=new Game();
        do{
            game.TakeUserInput();
            if(game.userint<0 || game.userint>100){
                System.out.println("\t NUMBER OUT OF RANGE ! \t\n Try Again!.\n");
                continue;
            }
            game.setnoOfGuesses(+ game.noOfGuesses);
            game.isCurrectNumber();
            
        }
        while(game.userint!=game.randint);
        System.out.println("\t Number of Guesses "+ game.getnoOfguesses());
    }
}