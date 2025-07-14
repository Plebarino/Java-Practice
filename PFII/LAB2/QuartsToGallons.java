package PFII.LAB2;

public class QuartsToGallons
{
    public static void main(String[] args)
    {
    int quartsNeeded = 18;

    int gallons = quartsNeeded / 4;
    int quarts = quartsNeeded % 4;

    System.out.println("A job that needs 18 quarts requires " + gallons + " gallons plus " + quarts + " quarts.");
    }
}