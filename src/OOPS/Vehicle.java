package OOPS;

public abstract class Vehicle {

    double speed;

    abstract void park();

    void go(){
        System.out.println("The vehicle is moving");
    }

    void stop(){
        System.out.println("This vehicle is stopped");
    }
}
