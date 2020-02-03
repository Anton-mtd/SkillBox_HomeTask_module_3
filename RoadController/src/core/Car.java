package core;

public class Car
{
    public String number;
    public int height;
    public double weight;
    public boolean hasVehicle;
    public boolean isSpecial;

    //_______________________________________________________________________________________
    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }
    //_______________________________________________________________________________________
    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }
    //_______________________________________________________________________________________
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }
    //_______________________________________________________________________________________
    public void setHasVehicle(boolean hasVehicle)
    {
        this.hasVehicle=hasVehicle;
    }

    public boolean getHasVehicle()
    {
        return hasVehicle;
    }
    //_______________________________________________________________________________________
    public void setIsSpecial(boolean isSpecial)
    {
        this.isSpecial=isSpecial;
    }

    public boolean getIsSpecial()
    {
        return isSpecial;
    }
//_______________________________________________________________________________________

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }
}