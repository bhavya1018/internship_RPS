import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper" , "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {
            
            System.out.print("Enter your move (rock, paper, scissors): ");
        playerChoice = scanner.nextLine().toLowerCase();
       
         if(!playerChoice.equals("rock") && 
                !playerChoice.equals("paper") && 
                !playerChoice.equals("scissors")) {

            System.out.println("The input is invalid");
            continue;
        }

        computerChoice = choices[random.nextInt(3)]; 
        System.out.println("Computer choice : " + computerChoice);                       

        if (playerChoice.equals(computerChoice)) {
            System.out.println("Its a Tie!");
        }
        else if(playerChoice.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("You Win!");
        }
        else if(playerChoice.equals("paper") && computerChoice.equals("rock")) {
            System.out.println("You Win!");
        }
        else if(playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You Win!");
        }
        else{
            System.out.println("You Lose!");
        }

        System.out.print("Play Again (yes/no) :");
        playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

    System.out.println("Thanks for Playing!!");        
    }
}
