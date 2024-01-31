package OOPS;

public class Bicycle extends Vehicle{

    int wheels = 2;
    int pedals = 2;

    @Override
    void park() {
        System.out.println("The bike is parked");
    }

    @Override
    void go(){
        System.out.println("The bicycle is moving");
    }
}
