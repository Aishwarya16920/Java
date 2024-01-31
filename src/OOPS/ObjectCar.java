package OOPS;
public class ObjectCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		
		System.out.println(car.getModel());
		System.out.println(car.getMake());
		car.drive();
		car.brake();
		
		System.out.println(car.toString());
		System.out.println(car);

		car.setYear(2022);
    	System.out.println(car.getYear());

		Car car1 = new Car("Chevrolet", "Camaro", 2021);
//		Car car2 = new Car("Ford", "Mustang", 2022);
//		car1.copy(car2);
		Car car2 = new Car(car1);

	}
}
