package PFII.LAB9;
import java.util.Scanner;

public class DemoHorses
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] horseData = new String[3]; // array of size 3

        System.out.print("Enter a name for horse >> "); // asks for a first name
        horseData[0] = input.nextLine(); // takes first input into index 0 of array

        System.out.print("Enter a color for " + horseData[0] + " >> "); // asks for a second name
        horseData[1] = input.nextLine();   // takes second input into index 1 of array
        
        System.out.print("Enter a third name >> "); // asks for a third name
        horseData[2] = input.nextLine();   // takes third input into index 2 of array


        
    
        input.close();
    }
}