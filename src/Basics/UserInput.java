package Basics;


import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scanner.next();
		System.out.println("Hello " + name);
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("You are " + age + " years old.");
		
		System.out.println("What is your favourite food?");
		String food = scanner.nextLine();
		System.out.println("You like " + food);
		scanner.close();
	}

}
