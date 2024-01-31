package Basics;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Zara";
		int age = 23;
		hello(name, age);
		
		int x = 3;
		int y = 4;
		
		int sum = add(x, y);
		
		System.out.println(sum);
	}
	
	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("You are " + age);
	}
	
	static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
