import java.util.Scanner;
import java.util.Random;
public class TheGame{
    public static void main(String[] args){
        int userChoice;
        int pcChoice;
        String again;
        do {
            System.out.println("This Game allows you to play a Rock Paper Scissors with the computer");
            System.out.println("To make your choice enter 1:Rock 2:Papper 3:Scissors");
            Scanner input = new Scanner(System.in);
            userChoice = input.nextInt();
            Random RandNum = new Random();
            pcChoice = RandNum.nextInt(3) + 1;
            switch (pcChoice) {
                case 1:
                    System.out.println("I chose Rock");
                    break;
                case 2:
                    System.out.println("I chose Papper");
                    break;
                case 3:
                    System.out.println("I chose Scissors");
                break;
            }
            if (userChoice == pcChoice) {
                System.out.println("It is a draw");
            } else if (userChoice < pcChoice) {
                System.out.println("You lost!");
            } else if (userChoice > pcChoice) {
                System.out.println("Congratulations! You won.");
            } else System.out.println("Please enter a Valid Selection of 1, 2 or 3");
            Scanner read=new Scanner(System.in);
            System.out.println("Do you want to play again? Y=Yes, N=No");
            again=read.nextLine();
        }while(again.equalsIgnoreCase("y"));
    }
}