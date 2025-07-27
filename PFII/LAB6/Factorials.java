package PFII.LAB6;
import java.util.Scanner;

public class Factorials
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       
        System.out.print("GET A FACTORIAL OF >> ");
        int num = input.nextInt();


        for (int i = 1; i <= num; i++)
        {
            int factorial = 1;

            for (int j = 2; j <= i; j++)
            {
                factorial *= j;
            }

            System.out.println("The factorial of " + i + " is " + factorial);
        }
            input.close();
    }
}