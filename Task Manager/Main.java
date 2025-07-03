import java.util.Scanner;

// This is the start of the program.
public class Main
{
    public static void main(String[] args)
    {
        TaskManager manager = new TaskManager(); // Create task manager instance
        manager.loadData(); // Load saved tasks from files

        Scanner scanner = new Scanner(System.in);
        boolean running = true; // Loop flag

        // Main program loop
        while (running)
        {
            System.out.println("\n--- Task Manager ---");
            System.out.println("1. View pending tasks");
            System.out.println("2. Add new task");
            System.out.println("3. Mark task as complete");
            System.out.println("4. View completed tasks");
            System.out.println("5. Exit and save");
            System.out.print("Choose an option: ");

            // Get user input safely
            int choice = InputValidator.getIntInput();

            // Handle user's menu choice
            switch (choice)
            {
                case 1:
                    manager.viewPending();
                    break;
                case 2:
                    manager.addTask();
                    break;
                case 3:
                    manager.completeTask();
                    break;
                case 4:
                    manager.viewCompleted();
                    break;
                case 5:
                    manager.saveData(); // Save before exiting
                    running = false;
                    System.out.println("Data saved. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
    }
}