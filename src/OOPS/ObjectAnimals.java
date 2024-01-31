package OOPS;

import java.util.Scanner;

public class ObjectAnimals {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.speak();

        Animal animal = new Animal();
        animal.speak();

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you want?");
        System.out.println("(1=dog) or (2=cat)");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println();
            animal.speak();
        }

    }
}
