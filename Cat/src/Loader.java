
public class Loader
{
    private static Cat getKitten(String name, double weight)
    {
        return new Cat(name,weight);
    }

    public static void main(String[] args)
    {
        Cat filip = new Cat("Filip",4000);
        System.out.println(filip.getWeight());
        System.out.println(filip.getName());
        System.out.println(filip.getStatus());

        System.out.println();

        Cat murka = new Cat("Filip",4000);
        System.out.println(murka.getWeight());
        System.out.println(murka.getName());
        System.out.println(murka.getStatus());
    }
}