package PFII.LAB4;
import java.util.Scanner;

public class TestBloodData
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // First object that uses default constructor.
        BloodData blood1 = new BloodData();

        // Second object that asks user for values.
        System.out.print("Enter blood type (O, A, B, AB): ");
        String userBloodType = input.nextLine();

        System.out.print("Enter Rh factor (+ or -): ");
        String userRhFactor = input.nextLine();

        // Creates a BloodData object using user input (overloaded constructor).
        BloodData blood2 = new BloodData(userBloodType, userRhFactor);

        // Displays both objects.
        System.out.println("\nDefault BloodData object:");
        System.out.println("Blood Type: " + blood1.getBloodType());
        System.out.println("Rh Factor: " + blood1.getRhFactor());

        System.out.println("\nUser BloodData object:");
        System.out.println("Blood Type: " + blood2.getBloodType());
        System.out.println("Rh Factor: " + blood2.getRhFactor());

        // Changes default object to match user input.
        blood1.setBloodType(userBloodType);
        blood1.setRhFactor(userRhFactor);

        // Displays updated default object.
        System.out.println("\nDefault object after update:");
        System.out.println("Blood Type: " + blood1.getBloodType());
        System.out.println("Rh Factor: " + blood1.getRhFactor());

        input.close(); // Closes input as good practice.
    }
}