
public class Loader
{
    private static Cat getKitten()
    {
        return new Cat(1100);
    }

    public static void main(String[] args)
    {
        Cat doris = new Cat();
        Cat vasya = new Cat();

        doris.setColor(ColorType.RED);

        vasya.setColor(ColorType.WHITE);

        System.out.println(doris.getColor());
        System.out.println(vasya.getColor());
    }
}