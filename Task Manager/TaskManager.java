import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

// Handles all logic for managing tasks
public class TaskManager
{
    private ArrayList<String> pendingTasks; // Holds tasks that haven't been completed yet
    private String[] completedTasks; // Holds completed tasks (fixed size array)
    private int completedCount; // Keeps track of how many tasks are completed

    // File names for saving/loading tasks
    private final String PENDING_FILE = "pending.txt";
    private final String COMPLETED_FILE = "completed.txt";

    // Constructor initializes empty task list and array
    public TaskManager()
    {
        pendingTasks = new ArrayList<>();
        completedTasks = new String[100]; // max 100 completed tasks
        completedCount = 0;
    }

    // Add a new task to the pending list
    public void addTask()
    {
        System.out.print("Enter task name: ");
        Scanner scanner = new Scanner(System.in);
        String task = scanner.nextLine().trim();

        // Will not accept empty tasks
        if (task.isEmpty())
        {
            System.out.println("Task cannot be empty.");
            addTask(); // Try again
            return;
        }

        pendingTasks.add(task);
        System.out.println("Task added.");
    }

    // Show all tasks that haven't been completed yet
    public void viewPending()
    {
        if (pendingTasks.isEmpty())
        {
            System.out.println("No pending tasks.");
            return;
        }

        System.out.println("--- Pending Tasks ---");
        for (int i = 0; i < pendingTasks.size(); i++)
        {
            System.out.println((i + 1) + ". " + pendingTasks.get(i));
        }
    }

    // Move a task from pending list to completed array
    public void completeTask()
    {
        viewPending(); // Show current pending tasks first
        if (pendingTasks.isEmpty()) return;

        System.out.print("Enter the number of the task to mark complete: ");
        int index = InputValidator.getIntInput() - 1; // User sees 1-based index

        try
        {
            String task = pendingTasks.remove(index); // Remove from pending list

            // Check if there's space in the completed array
            if (completedCount < completedTasks.length)
            {
                completedTasks[completedCount++] = task;
                System.out.println("Task marked as complete.");
            }
            else
            {
                // If full it puts back
                System.out.println("Completed task storage is full.");
                pendingTasks.add(index, task); // undo remove
            }
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Invalid index. Try again.");
            completeTask(); // Try again
        }
    }

    // Show all completed tasks
    public void viewCompleted()
    {
        if (completedCount == 0)
        {
            System.out.println("No completed tasks.");
            return;
        }

        System.out.println("--- Completed Tasks ---");
        for (int i = 0; i < completedCount; i++)
        {
            System.out.println((i + 1) + ". " + completedTasks[i]);
        }
    }

    // Save both pending and completed tasks to files
    public void saveData()
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PENDING_FILE)))
        {
            for (String task : pendingTasks)
            {
                writer.write(task);
                writer.newLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error saving pending tasks: " + e.getMessage());
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(COMPLETED_FILE)))
        {
            for (int i = 0; i < completedCount; i++)
            {
                writer.write(completedTasks[i]);
                writer.newLine();
            }
        }
        catch (IOException e)
        {
            System.out.println("Error saving completed tasks: " + e.getMessage());
        }
    }

    // Load tasks from saved files (if they exist)
    public void loadData()
    {
        // Load pending tasks
        try (BufferedReader reader = new BufferedReader(new FileReader(PENDING_FILE)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                pendingTasks.add(line);
            }
        }
        catch (IOException e)
        {
            System.out.println("No pending task file found. Starting fresh.");
        }

        // Load completed tasks
        try (BufferedReader reader = new BufferedReader(new FileReader(COMPLETED_FILE)))
        {
            String line;
            while ((line = reader.readLine()) != null && completedCount < completedTasks.length)
            {
                completedTasks[completedCount++] = line;
            }
        }
        catch (IOException e)
        {
            System.out.println("No completed task file found. Starting fresh.");
        }
    }
}