package Basics;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 18;
		if(age >= 18) {
			System.out.println("You are an Adult!");
		}
		
		else if(age >= 13 & age <=19){
			System.out.println("You are a Teenager!");
		}
		
		else {
			System.out.println("You are not an Adult");
		}

	}

}
