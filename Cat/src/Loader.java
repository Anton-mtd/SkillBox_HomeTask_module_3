
public class Loader
{
    public static void main(String[] args)
    {
        Cat tigra = new Cat();
        Cat murka = new Cat();

        System.out.println(tigra.getWeight()+"\n");

        tigra.feed(150.0);
        tigra.drink(50.0);

        System.out.println(tigra.getWeight());

        tigra.getTotalEaten();

        System.out.print("Tigra, ");
        tigra.pee();

        System.out.println(tigra.getWeight());

        tigra.getTotalEaten();
//______________________________________________________________

        System.out.println(murka.getWeight()+"\n");

        murka.feed(100.0);
        murka.drink(50.0);

        System.out.println(murka.getWeight());

        murka.getTotalEaten();

        System.out.print("Murka, ");
        murka.pee();

        System.out.println(murka.getWeight());

        murka.getTotalEaten();
    }
}