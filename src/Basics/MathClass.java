package Basics;
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14;
		double y = -10;
		
		double m = Math.max(x, y);
		double a = Math.abs(y);
		double s = Math.sqrt(x);
		double r = Math.round(x);
		double f = Math.floor(x);
		double c = Math.ceil(x);
		
		
		System.out.println(m);
		System.out.println(a);
		System.out.println(s);
		System.out.println(r);
		System.out.println(f);
		System.out.println(c);
		
		double side1, side2, result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side 1: ");
		side1 = scanner.nextDouble();
		System.out.println("Enter side 2: ");
		side2 =scanner.nextDouble();
		
		result = Math.sqrt((side1*side1)+(side2*side2));
		
		System.out.println("The hyptenuse is " + result);
		scanner.close();
		
		
		
	}

}
