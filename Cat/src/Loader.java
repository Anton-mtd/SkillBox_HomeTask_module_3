
public class Loader
{
    private static Cat getKitten()
    {
        return new Cat(1100);
    }

    public static void main(String[] args)
    {
        Cat tigra = new Cat(3000);
        System.out.println(tigra.getWeight());
        System.out.println(Cat.getCount());

        System.out.println();

        System.out.println("Получаем котенка с весом " + getKitten().getWeight());
        System.out.println(Cat.getCount());

        System.out.println();
        System.out.println("Получаем котенка с весом " + getKitten().getWeight());
        System.out.println(Cat.getCount());
    }
}