
public class Cat
{
    private double originWeight;
    private double weight;

    private final double minWeight;
    private final double maxWeight;
    private double qualityEaten;
    public static int count;
    public boolean isAlive;
    ColorType color;
    private String name;

    public static final int EYES_COUNT = 2;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        qualityEaten = 0.0;
        count++;
        isAlive = true;
    }

    public Cat(String name, double weight)
    {
        this();
        this.name = name;
        this.weight = weight;
        this.originWeight = weight;
    }

    public Cat deepCopy (Cat other)
    {
        this.weight = other.weight;
        this.name = other.name;
        count++;
        return other;
    }


    public String getName()
    {
        return name+" ";
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
        if (isAlive)
        {
            weight = weight - 1;
            System.out.println("Meow");
            checkIsAlive();
        }
        else
        {
            System.out.println(" cat is gone :(");
        }

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
            qualityEaten = qualityEaten + amount;
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

    public double getTotalEaten()
    {
        return qualityEaten;
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