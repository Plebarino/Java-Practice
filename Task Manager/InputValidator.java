import java.util.Scanner;

// This class handles safe integer input from the user
public class InputValidator
{
    // This method keeps asking for input until the user gives a valid integer
    public static int getIntInput()
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Get user input as a string

        try
        {
            // Try to convert it to an integer
            return Integer.parseInt(input);
        }
        catch (NumberFormatException e)
        {
            // If it fails, tell the user and try again.
            System.out.println("Invalid input. Enter an integer:");
            return getIntInput(); // Recursive retry
        }
    }
}