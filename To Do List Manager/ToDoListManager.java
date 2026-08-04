import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      ArrayList<String> tasks = new ArrayList<String>();
   
      int choice;
   
      do
      {
         // Display Menu
         System.out.println("\n======== TO-DO LIST MANAGER ========");
         System.out.println("1. Add a Task");
         System.out.println("2. View All Tasks");
         System.out.println("3. Remove a Task");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         choice = keyboard.nextInt();
         keyboard.nextLine(); // Clear newline
      
         switch (choice)
         {
            case 1:
               System.out.print("Enter a task: ");
               String task = keyboard.nextLine();
               tasks.add(task);
               System.out.println("Task added.");
               break;
         
            case 2:
               if (tasks.size() == 0)
               {
                  System.out.println("No tasks in the list.");
               }
               else
               {
                  System.out.println("\nCurrent Tasks:");
               
                  for (int i = 0; i < tasks.size(); i++)
                  {
                     System.out.println((i + 1) + ". " + tasks.get(i));
                  }
               }
               break;
         
            case 3:
               if (tasks.size() == 0)
               {
                  System.out.println("No tasks to remove.");
               }
               else
               {
                  System.out.println("\nCurrent Tasks:");
               
                  for (int i = 0; i < tasks.size(); i++)
                  {
                     System.out.println((i + 1) + ". " + tasks.get(i));
                  }
               
                  System.out.print("Enter task number to remove: ");
                  int remove = keyboard.nextInt();
               
                  while (remove < 1 || remove > tasks.size())
                  {
                     System.out.print("Invalid task number. Enter again: ");
                     remove = keyboard.nextInt();
                  }
                  
                  keyboard.nextLine();
               
                  tasks.remove(remove - 1);
                  System.out.println("Task removed.");
               }
               break;
         
            case 4:
               System.out.println("Exited!");
               break;
         
            default:
               System.out.println("Invalid menu choice.");
         }
      
      } while (choice != 4);
   
      keyboard.close();
   }
}