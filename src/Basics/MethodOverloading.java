package Basics;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = add(1, 2, 3);
		double y = add(1.1, 1.2, 1.3, 1.4);
		System.out.println(x);
		System.out.println(y);
		
		
	}
	
	static int add(int a, int b) {
		System.out.println("Method 1");
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		System.out.println("Method 2");
		return a + b;
	}
	
	static int add(int a, int b, int c, int d) {
		System.out.println("Method 3");
		return a + b;
	}
	
	static double add(double a, double b) {
		System.out.println("Method 4");
		return a + b;
	}
	
	static double add(double a, double b, double c) {
		System.out.println("Method 5");
		return a + b;
	}
	
	static double add(double a, double b, double c, double d) {
		System.out.println("Method 6");
		return a + b;
	}

}
