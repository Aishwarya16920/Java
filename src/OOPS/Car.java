package OOPS;

public class Car extends Vehicle{
	private String make = "Chevrolet";
	private String model = "Corvette";
	private int year = 2019;
	String color = "blue";
	double price = 50000.00;
	
	void drive() {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You step on the brakes");
	}
	
	public String toString() {
		String myString = make + "\n" + model + "\n" + color + "\n" + year;
		return myString;
	}
	
	String name;
	
	Car(){
		
	}
	
	Car(String name){
		this.name = name;
	}

	int wheels = 4;
	int doors = 4;

	@Override
	void park() {
		System.out.println("The car is parked");
	}

	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}

	public String getMake(){
		return make;
	}

	public String getModel(){
		return model;
	}

	public int getYear(){
		return year;
	}

	public void setMake(String make){
		this.make = make;
	}

	public void setModel(String model){
		this.make = model;
	}

	public void setYear(int year){
		this.year = year;
	}

	public void copy(Car x){
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}

	Car(Car x){
		this.copy(x);
	}

	@Override
	void go(){
		System.out.println("The car is moving");
	}
}
