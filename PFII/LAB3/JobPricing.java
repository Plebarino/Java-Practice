package PFII.LAB3;
import java.util.Scanner;

public class JobPricing
{
    // accepts user input
    static Scanner input = new Scanner(System.in);

    /* --- MAIN method ---
        - user inputs all data needed
        - method is called to main
        - estimated price for the job is displayed as the result
    */
    public static void main(String[] args)
    {
        System.out.print("JOB NAME: "); // asks user
        String jobName = input.nextLine();

        System.out.print("COST OF MATERIALS: $"); // asks user
        double allMaterials = input.nextDouble();

        System.out.print("HOURS OF WORK: "); // asks user
        double workHours = input.nextDouble();

        System.out.print("HOURS OF TRAVEL: "); // asks user
        double travelHours = input.nextDouble();

        double estimate = totalPrice(workHours, travelHours, allMaterials); // calls estimate calculation method

        System.out.printf("Estimate for %s: $%.2f%n", jobName, estimate); // displays estimate result (with rounding to two significant digits)
    }
    
    public static double totalPrice(double workHours, double travelHours, double allMaterials)
    {
    double labor = workHours * 35; // multiplies user given hours by rate of $35/hour
    double travel = travelHours * 12; // multiplies user given hours by rate of $12/hour
    double materials = allMaterials; // defines passed in material

    double totalPrice = labor + travel + materials; // sum of all costs
    return totalPrice; // returns sum to method
    }
}