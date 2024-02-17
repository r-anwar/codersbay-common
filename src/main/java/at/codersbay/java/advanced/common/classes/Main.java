package at.codersbay.java.advanced.common.classes;

public class Main {

    public static void main(String[] arguments) {

        Animal myAnimal = new Animal();
        myAnimal.age = 10;

        myAnimal.run("myAnimal");
        myAnimal.ausgabe();

        Dog myDog = new Dog();
        myDog.age = 3;
        myDog.pfoten = 4;
        myDog.run("myDog");
        myDog.ausgabe();

        Windhund windhund = new Windhund();
        windhund.age = 2;
        windhund.pfoten = 4;
        windhund.run("windhund");
        windhund.ausgabe();


    }
}
