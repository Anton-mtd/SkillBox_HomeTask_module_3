
public class Loader
{
    public static void main(String[] args)
    {
        Cat vasya = new Cat();
        Cat doris = new Cat();

        System.out.println(Cat.getCount());

        while (vasya.isAlive)
        {
            vasya.feed(150.0);
        }
        System.out.println(vasya.getWeight() + " Vasya " + vasya.getStatus());
        System.out.println(Cat.getCount());

        while (doris.isAlive)
        {
            doris.pee();
        }
        System.out.println(doris.getWeight() + " Doris " + doris.getStatus());
        System.out.println(Cat.getCount());
    }
}