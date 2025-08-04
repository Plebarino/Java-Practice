package PFII.LAB8;
import java.util.Scanner;

public class DistanceFromAverage
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;
        
        double[] values = new double[15];
        int index = 0;

        while (keepRunning && index < values.length)
        {
            System.out.print("Enter a numeric value or 99999 to quit. >> ");
            double value = input.nextDouble();

            if (value == 99999)
            {
                if (index == 0)
                {
                    System.out.println("ERROR. User input nothing.");
                }
                else
                {
                    avrg(values,index);                  
                }
                keepRunning = false;
            }
            else
            {
                values[index] = value;
                index++;
                if (index == 15)
                {
                    avrg(values,index);     
                }
            }
        }        
    input.close();
    }

    public static void avrg(double[] values, int index)
    {
        double sum = 0.0;
        for (int i =0; i < index; i++)
        {
            sum += values[i];
        }

        double average = sum / index;

        System.out.println("You enetred " + index + " number(s) and their avergae is " + average);
    }
}