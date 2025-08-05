package PFII.LAB9;
import java.util.Scanner;

public class DemoHorses
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // creates Horse object
        Horse horse = new Horse(); 
        System.out.print("Enter name for horse >> ");
        horse.setName(input.nextLine());

        System.out.print("Enter color for " + horse.getName() + " >> ");
        horse.setColor(input.nextLine());

        System.out.print("Enter year of birth >> ");
        horse.setBirthYear(input.nextInt());
        input.nextLine();


        // creates RaceHorse object
        RaceHorse raceHorse = new RaceHorse(); 
        System.out.print("Enter name for race horse >> ");
        raceHorse.setName(input.nextLine());

        System.out.print("Enter color for " + raceHorse.getName() + " >> ");
        raceHorse.setColor(input.nextLine());

        System.out.print("Enter year of birth >> ");
        raceHorse.setBirthYear(input.nextInt());

        System.out.print("Enter number of races for " + raceHorse.getName() + " >> ");
        raceHorse.setRaces(input.nextInt());

        
        // final output
        System.out.println(horse.getName() + " is " + horse.getColor() + " and was born in " + horse.getBirthYear() + ".");
        System.out.println(raceHorse.getName() + " is " + raceHorse.getColor() + " and was born in " + raceHorse.getBirthYear() + ".");
        System.out.println(raceHorse.getName() + " has been in " + raceHorse.getRaces() + " races.");

        input.close();
    }
}