import java.util.Scanner;
import java.util.Random;
class Game{
    public int number;
    public int inPutNumber;
    public int noOfGuesses=0;
    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    Game(){
        Random rd=new Random();
        this.number=rd.nextInt(100);

    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc=new Scanner(System.in);
        inPutNumber =sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inPutNumber==number){
            System.out.format("yes you Guesses it right ,it was %d \n you guessed in %d attempts",number,noOfGuesses);
        }
        else if(inPutNumber<number){
            System.out.println("Too Low!...");
        }
        else if(inPutNumber>number){
            System.out.println("Too high!...");
        }
        return false;
    }
}
public class day2{
    public static void main(String[] args) {
        Game g=new Game();
        boolean b=false;
        while(!b){
            g.takeUserInput();
            b=g.isCorrectNumber();
        }
        
    }
}