import java.util.Scanner;

public class Barquin_LabAssignment9
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      //Create correct array
      char[] correct = {
         'A','D','B','B','C',
         'B','A','B','C','D',
         'A','C','D','B','D',
         'C','C','A','D','B'
         };
         
      //Create student answer array
      char[] student = new char[20];
      
      //Loop 20
      for (int i = 0; i < 20; i++)
      {
         System.out.print("Question " + (i + 1) + ": ");
         student[i] = keyboard.next().toUpperCase().charAt(0);
         
         while(student[i] != 'A' &&
               student[i] != 'B' &&
               student[i] != 'C' &&
               student[i] != 'D')
               
         {
            System.out.print("Invalid. Please enter A, B, C or D.");
            student[i] = keyboard.next().toUpperCase().charAt(0);
         }   
      }
      
      //Initialize counters
      int correctCount = 0;
      int incorrectCount = 0;
      
      System.out.println("\nIncorrectly answered questions: ");
      
      for (int i = 0; i < 20; i++)
      {
         if(student[i] == correct [i])
         {
            correctCount++;
         }
         else
         {
            incorrectCount++;
            System.out.println((i + 1));
         }
      }
           
      //Determine pass/fail
      if(correctCount >= 15)
      {
         System.out.println("Passed");
      }
      else
      {
         System.out.println("Failed");
      }
      
      //print total
      System.out.println("Correct Answers: " + correctCount);
      System.out.println("Incorrect Answers: " + incorrectCount);
      
      keyboard.close();
   }
}