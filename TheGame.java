import java.util.Scanner;
import java.util.Random;
public class TheGame{
    public static void main(String[] args){
        int userChoice;
        int pcChoice;
        System.out.println("This Game allows you to play a Rock Paper Scissors with the computer");
        System.out.println("To make your choice enter 1:Rock 2:Papper 3:Scissors");
                Scanner input=new Scanner(System.in);
                userChoice=input.nextInt();
                Random RandNum=new Random();
                pcChoice= RandNum.nextInt(3)+1;
                switch (pcChoice)
                {
                    case 1:
                        System.out.println("Rock");
                        break;
                    case 2:
                        System.out.println("Papper");
                    case 3:
                        System.out.println("Scissors");
                }
                if(userChoice==pcChoice)
                {
                    System.out.println("It is a draw");
                }
                else if(userChoice<pcChoice)
                {
                    System.out.println("")
                }

    }
}