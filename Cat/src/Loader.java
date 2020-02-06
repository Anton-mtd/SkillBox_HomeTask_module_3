public class Loader
{
    private static Cat getKitten(String name, double weight)
    {
        return new Cat(name,weight);
    }

    public static void main(String[] args)
    {
        Cat tigra = new Cat();
        System.out.println("Tigra weight: " +tigra.getWeight());
        while (tigra.getStatus() != "Dead")
        {
            tigra.meow();
        }
        System.out.println("Tigra weight after multiMeow: " +tigra.getWeight());
        System.out.println("Tigra status: " +tigra.getStatus() +"\n");


        System.out.println(Cat.getCount());



        Cat murka = new Cat();
        System.out.println("Murka weight: " +murka.getWeight());
        while (murka.getStatus() != "Exploded")
        {
            murka.feed(80.0);
            murka.drink(40.0);
        }
        System.out.println("Murka weight after feeding: " +murka.getWeight());
        System.out.println("Murka status: " +murka.getStatus() +"\n");



        Cat barsik = new Cat();
        System.out.println("Barsik weight: " +barsik.getWeight());
        barsik.drink(50.0);
        System.out.println("Barsik weight after drinking: " +barsik.getWeight());
        System.out.println("Barsik status: " +barsik.getStatus() +"\n");


        Cat vasya = new Cat();
        System.out.println("Vasya weight: " +vasya.getWeight());
        vasya.meow();
        System.out.println("Vasya weight after meow: " +vasya.getWeight());
        System.out.println("Vasya status: " +vasya.getStatus()+"\n");


        Cat felix = new Cat("Felix",2000.0);
        System.out.println("Felix weight: " +felix.getWeight());
        System.out.println("Felix status: " +felix.getStatus());
        System.out.println(Cat.getCount());

        System.out.println("______________Копирование кота__________________");


        Cat originCat = new Cat();
        System.out.println(originCat.getName() + originCat.getWeight() + originCat.originWeight);

        Cat copyCat = originCat.deepCopy();
        System.out.println(copyCat.getName() + copyCat.getWeight() + copyCat.originWeight);
    }
}