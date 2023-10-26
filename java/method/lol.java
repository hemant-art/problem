import java.util.Random;
import java.util.Scanner;
public class lol
{
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter 0 for rock,1 for paper,and 2 for scissor");
        int userInput =sc.nextInt();
        Random rd =new Random();
        int computerInput=rd.nextInt(3);
        if(userInput==computerInput)
        {
            System.out.println("Drow");
        }
        else if(userInput == 0 && computerInput==2 || userInput==1 && computerInput==0 || userInput == 2 && computerInput==1)
        {
            System.out.println("You Win!");
        }
        else{
            System.out.println("computer win!");
        }
        if(computerInput==0)
        {
            System.out.println("computer choise : rock");
        }
        else if (computerInput==1)
        {
            System.out.println("computer choise : paper ");
        }
        else if(computerInput==2)
        {
            System.out.println("computer choise : scissor");
        }
    }
}