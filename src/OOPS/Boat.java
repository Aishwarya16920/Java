package OOPS;

public class Boat extends Vehicle{
    @Override
    void park() {
        System.out.println("The boat is parked");
    }

    @Override
    void go(){
        System.out.println("The boat is moving");
    }
}
