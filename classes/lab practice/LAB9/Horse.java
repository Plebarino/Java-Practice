package PFII.LAB9;


public class Horse
{
    // 🔹 These are data fields
    String name;        // instance field
    String color;            // instance field
    int birthYear;   // "static field" (shared by all Horse objects)

    // Constructor
    public Horse(String horseName, String horseColor, int horseBirthYear)
    {
        name = horseName;
        color = horseColor;
        birthYear = horseBirthYear;
    }
}