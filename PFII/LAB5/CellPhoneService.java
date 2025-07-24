package PFII.LAB5;
import java.util.Scanner;

public class CellPhoneService
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning)
        {
            /* Prompt user for maximum monthly values for talk, text, and data.
            Then display a recommendation for the best plan for the customer’s needs.
            */
            System.out.print("TALK MINUTES NEEDED: ");
            int talk = input.nextInt();

            System.out.print("TEXT MESSAGES NEEDED: ");
            int text = input.nextInt();        

            System.out.print("GIGABYTES OF DATA NEEEDED: ");
            int data = input.nextInt();
            

            
            if (talk < 500 && text == 0 && data == 0) // talk less than 500 & text less than or equal to 0 & data less than or equal to 0
                {
                    System.out.println("The customer should buy plan A at $49 per month.");
                }
            else    
                if (talk < 500 && text > 0 && data == 0)  // talk less than 500 & text greater than 0 & data less than or equal to 0
                    {
                        System.out.println("The customer should buy plan B at $55 per month.");                    
                    }
            else    
                if (talk >= 500 && text > 0 && data == 0)  // talk greater than or equal to 500 & text greater than 0 & data less than or equal to 0
                    {
                        if (text < 100) // text less than 100
                        {
                            System.out.println("The customer should buy plan C at $61 per month.");
                        }              
                        else
                            if (text >= 100) // text greater than or equal to 100
                            {
                                System.out.println("The customer should buy plan D at $70 per month.");
                            }
                    }
            else
                if (data > 0 && data < 3) // data less than 3 gigabytes
                    {
                        System.out.println("The customer should buy plan E at $79 per month.");
                    }
            else
                if (data >= 3) // data greater than or equal to 3 gigabytes
                    {
                        System.out.println("The customer should buy plan F at $87 per month.");
                    }
            else
                {
                    System.out.println("Invalid input.");
                }
          
            System.out.print("\nWould you like to check another plan? (yes/no): "); // asks if user wants to run again
            input.nextLine();
            String answer = input.nextLine();

            if (!answer.equalsIgnoreCase("yes")) // checks yes or no
            {
                keepRunning = false;
            }
            
        }
        input.close(); // good practice to close the scanner
    }
}