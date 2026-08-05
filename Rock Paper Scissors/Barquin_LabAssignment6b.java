import java.util.Scanner;   
import java.util.Random;

public class Barquin_LabAssignment6b
{
   public static Scanner keyboard = new Scanner(System.in);
   
   public static void main(String[] args)
   {
      String user;
      String computer;
      int computerNumber;
      
      do
      {
         computerNumber = computerChoice();
         computer = convertChoice(computerNumber);
         user = userChoice();
         
         System.out.println("You chose: " + user);
         System.out.println("Computer chose: " + computer);
         
         determineWinner(user, computer);
      } while (user.equals(computer));
      
      keyboard.close();
   }
   
   public static int computerChoice()
   {
      Random rand = new Random();
      
      return rand.nextInt(3) + 1;
   }
   
   public static String userChoice()
   {
      String userChoice;
      
      System.out.print("Enter your choice (rock, paper, or scissors): ");
      userChoice = keyboard.next();
      userChoice = userChoice.toLowerCase();
      
      while(!userChoice.equals("rock") &&
            !userChoice.equals("paper") &&
            !userChoice.equals("scissors"))
      {
         System.out.print("Invalid choice, please enter again: ");
         userChoice = keyboard.next();
         userChoice = userChoice.toLowerCase();
      }
      
      return userChoice;
   }
   
   public static String convertChoice(int rand)
   {
      String convertedChoice;
      
      if(rand == 1)
      {
         convertedChoice = "rock";
      }
      else if (rand == 2)
      {
         convertedChoice = "paper";
      }
      else
      {
         convertedChoice = "scissors";
      }
      
      return convertedChoice;
   }
   
   public static void determineWinner(String user, String computer)
   {
      if (user.equals(computer))
      {
         System.out.println("Tie. Play again.");
      }
      else if ((user.equals("rock") && computer.equals("scissors")) ||
                 (user.equals("scissors") && computer.equals("paper")) ||
                 (user.equals("paper") && computer.equals("rock")))
      {
         System.out.println("You win!");
      }
      else
      {
         System.out.println("Computer wins!");
      }
   }
}
