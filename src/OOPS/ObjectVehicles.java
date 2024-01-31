package OOPS;

public class ObjectVehicles {
    public static void main(String[] args){

        Car car = new Car();
        car.go();
        car.stop();
        System.out.println(car.speed);

        Bicycle bike = new Bicycle();
        bike.go();
        bike.stop();
        System.out.println(bike.speed);

        System.out.println(car.doors);
        System.out.println(bike.pedals);

        car.park();
        bike.park();

        Boat boat = new Boat();

        Vehicle[] racers = {car, bike, boat};

        for(Vehicle x: racers){
            x.go();
        }
    }
}
