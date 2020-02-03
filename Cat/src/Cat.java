
public class Cat
{
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    private double qualityEaten;
    private double qualityDrunk;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        qualityEaten = 0.0;
        qualityDrunk = 0.0;

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        qualityEaten = qualityEaten + amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        qualityDrunk = qualityDrunk + amount;
    }

    public void pee()
    {
        weight = weight - weight * 0.02;
        System.out.println("pee. Weight was reduced");
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
}