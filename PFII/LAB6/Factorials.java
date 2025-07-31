package PFII.LAB6;
import java.util.Scanner;
import java.math.BigInteger;

public class Factorials
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to compute factorial >> ");
        int limit = input.nextInt();

        for (int i = 1; i <= limit; i++)
        {
            BigInteger factorial = BigInteger.ONE;

            for (int j = 2; j <= i; j++)
            {
                factorial = factorial.multiply(BigInteger.valueOf(j));
            }

            System.out.println("The factorial of " + i + " is " + factorial);
        }
        input.close();
    }
}
