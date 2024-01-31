package Basics;


public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 123;
		long l = 123456789123456789L;
		byte b = 127;
		float f = 3.14f;
		double d = 3.14;
		boolean bn = true;
		char c = '@';
		String s = "Name";
		System.out.println("My number is " + i);
		
		String x = "Water";
		String y = "Coke";
		String temp;
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}
