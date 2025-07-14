package PFII.LAB2;
import java.util.Scanner;

public class QuartsToGallonsInteractive
{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
    System.out.print("How many quarts do you need?: ");
    int quartsNeeded = input.nextInt();

    int gallons = quartsNeeded / 4;
    int quarts = quartsNeeded % 4;

    System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallons + " gallon(s) plus " + quarts + " quart(s).");
    }
}