
public class Main {
    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());

        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13

        Cat plainCat = new Cat(8.6);
        HouseCat chesireCat = new HouseCat("Chesire", 12);
        System.out.println(plainCat.noise());
        System.out.println(chesireCat.noise());
        Cat suki = new HouseCat("Suki", 8);
        System.out.println(suki.noise());

    }

}