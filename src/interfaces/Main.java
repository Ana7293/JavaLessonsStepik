package interfaces;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Cat oneCat = new Cat();
        Dog twoDog = new Dog();
        Bird threeBird = new Bird();
        Fish fourFish = new Fish();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(oneCat);
        animals.add(twoDog);
        animals.add(threeBird);
        animals.add(fourFish);

        for (Animal animal : animals) {
            animal.eat();
        }

        System.out.println("----------");

        Animal oneAnimal = new Dog();
        oneAnimal.eat();

        Dog dog = (Dog) oneAnimal;
        dog.run();

        System.out.println("----------");

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Bird bird1 = new Bird();
        ArrayList<AbleToRun> runAnimals = new ArrayList<>();  //тип имя интерфейса
        runAnimals.add(cat1);
        runAnimals.add(dog1);
        runAnimals.add(bird1);
        for (AbleToRun runny : runAnimals) {
            runny.run();
        }

        System.out.println("----------");

        Bird bird2 = new Bird();
        ArrayList<AbleToFly> flyAnimals = new ArrayList<>();  //тип имя интерфейса
        flyAnimals.add(bird2);
        for (AbleToFly flyly : flyAnimals) {
            flyly.fly();
        }
        System.out.println("----------");




    }
}
