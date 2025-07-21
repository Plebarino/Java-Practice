package PFII.LAB4;

public class Patient
{
    private int idNumber;
    private int age;
    private BloodData bloodData;

    // Default constructor.
    public Patient()
    {
        idNumber = 0;
        age = 0;
        bloodData = new BloodData();  // Uses BloodData default constructor (O, +)
    }

    // Overloaded constructor.
    public Patient(int idNumber, int age, String bloodType, String rhFactor)
    {
        this.idNumber = idNumber;
        this.age = age;
        bloodData = new BloodData(bloodType, rhFactor);
    }

    // Getter for ID number
    public int getIdNumber()
    {
        return idNumber;
    }

    // Getter for age.
    public int getAge()
    {
        return age;
    }

    // Getter for BloodData object.
    public BloodData getBloodData()
    {
        return bloodData;
    }
}