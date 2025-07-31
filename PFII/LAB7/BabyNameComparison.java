package PFII.LAB7;
import java.util.Scanner; //import scanner utility

public class BabyNameComparison // initialize class
{
    public static void main(String[] args) // begin main program
    {
        Scanner input = new Scanner(System.in); // accept user input
        String[] names = new String[3]; // array of size 3 set to "names"

        System.out.print("Enter a name >> "); // asks for a first name
        names[0] = input.nextLine(); // takes first input into index 0 of array

        System.out.print("Enter a second name >> "); // asks for a second name
        names[1] = input.nextLine();   // takes second input into index 1 of array
        
        System.out.print("Enter a third name >> "); // asks for a third name
        names[2] = input.nextLine();   // takes third input into index 2 of array

        for (int i = 0; i < names.length; i++) // outer loop that goes through the array called "names" of size 3 (runs 3  times). This gets the first name at every idex.
        {
            for (int j = 0; j < names.length; j++) // inner loop that goes through the array called "names" of size 3 (runs 9  times). This gets the second name at every position.
            {
                if (i == j) // compares first name to second name
                {
                    continue; // skips if there is a duplicate pair
                }
            System.out.println(names[i] + " " + names[j]); // prints pair of name combination
            }
        }
        input.close(); // closes scanner
    }
}