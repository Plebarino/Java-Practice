package PFII.LAB9;

public class RaceHorse
{
    // 🔹 These are data fields
    //String name;        // instance field
    int races;            // instance field
    int count;   // "static field" (shared by all Person objects)

    // Constructor
    public RaceHorse(int horseRaces)
    {
        races = horseRaces;
        count++;
    }
}