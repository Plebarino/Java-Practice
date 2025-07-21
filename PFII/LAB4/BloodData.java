package PFII.LAB4;

public class BloodData
{
    // Fields that hold a blood types and Rh factor.
    String bloodType;   // O, A, B, or AB
    String rhFactor;    // + or -

    // Default constructor.
    public BloodData()
    {
        bloodType = "O";
        rhFactor = "+";
    }

    // Overloaded BloodData constructor to overwrite default values.
    public BloodData(String bloodType, String rhFactor)
    {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    // BloodType getter.
    public String getBloodType()
    {
        return bloodType;
    }
    // BloodType setter.
    public void setBloodType(String newbloodType)
    {
        bloodType = newbloodType;
    }

    // RhFactor getter.
        public String getRhFactor()
    {
        return rhFactor;
    }
    // RhFactor setter.
    public void setRhFactor(String newRhFactor)
    {
        rhFactor = newRhFactor;
    }
}