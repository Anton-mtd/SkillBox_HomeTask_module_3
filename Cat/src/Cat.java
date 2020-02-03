
public class Cat
{
    private double originWeight;
    private double weight;

    private final double minWeight;
    private final double maxWeight;
    private double qualityEaten;
    private double qualityDrunk;
    public static int count;
    public boolean isAlive;
    ColorType color;

    public static final int EYES_COUNT = 2;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        qualityEaten = 0.0;
        qualityDrunk = 0.0;
        count = ++count;
        isAlive = true;

    }

    public Cat(double weight)
    {
        this();
        this.weight = weight;
    }

    public void setColor(ColorType color)
    {
        this.color = color;
    }

    public ColorType getColor()
    {
        return color;
    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        if (isAlive)
        {
            weight = weight + amount;
            qualityEaten = qualityEaten + amount;
            checkIsAlive();
        }
        else
        {
            System.out.println(" cat is gone :(");
        }
    }

    public void drink(Double amount)
    {
        if (isAlive)
        {
            weight = weight + amount;
            qualityDrunk = qualityDrunk + amount;
            checkIsAlive();
        }
        else
        {
            System.out.println(" cat is gone :(");
        }
    }

    public void pee()
    {
        if (isAlive)
        {
            weight = weight - weight * 0.02;
            System.out.println("pee. Weight was reduced");
            checkIsAlive();
        }
        else
        {
            System.out.println(" cat is gone :(");
        }
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight) {
            return "Dead";
        }
        else if(weight > maxWeight) {
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public void getTotalEaten()
    {
        System.out.println("\nTotal was eaten: " + qualityEaten);
        System.out.println("Total was drunk: " + qualityDrunk);
        System.out.println("Total amount of food eaten " + (qualityEaten + qualityDrunk)+"\n");
    }

    public static int getCount()
    {
        System.out.print("Общее колиство кошек: ");
        return count;
    }

    public void checkIsAlive ()
    {
        if (weight < minWeight || weight > maxWeight & isAlive)
        {
            isAlive = false;
            count = count - 1;
            System.out.println(" cat is gone :(");
        }
    }
}