package PFII.LAB4;
import java.util.Scanner;

public class TestPatient
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // First patient that uses all default values.
        Patient patient1 = new Patient();

        // Second patient that prompt for all values.
        System.out.print("Enter ID number for Patient 2: ");
        int id2 = input.nextInt();

        System.out.print("Enter age for Patient 2: ");
        int age2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter blood type for Patient 2 (O, A, B, AB): ");
        String bloodType2 = input.nextLine();

        System.out.print("Enter Rh factor for Patient 2 (+ or -): ");
        String rhFactor2 = input.nextLine();

        Patient patient2 = new Patient(id2, age2, bloodType2, rhFactor2);

        // Third patient that prompts for ID and age but uses default BloodData.
        System.out.print("Enter ID number for Patient 3: ");
        int id3 = input.nextInt();

        System.out.print("Enter age for Patient 3: ");
        int age3 = input.nextInt();
        input.nextLine();

        Patient patient3 = new Patient();  // uses default constructor
        patient3 = new Patient(id3, age3, "O", "+");  // keeps blood as default

        // Displays all patients
        System.out.println("\nPATIENT 1 (Default):");
        displayPatient(patient1);

        System.out.println("\nPATIENT 2 (User Input):");
        displayPatient(patient2);

        System.out.println("\nPATIENT 3 (User ID & Age, Default BloodData):");
        displayPatient(patient3);

        input.close(); // Closes input as good practice.
    }

    public static void displayPatient(Patient patient)
    {
        System.out.println("ID Number: " + patient.getIdNumber());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Blood Type: " + patient.getBloodData().getBloodType());
        System.out.println("Rh Factor: " + patient.getBloodData().getRhFactor());
    }
}