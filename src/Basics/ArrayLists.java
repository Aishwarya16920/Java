package Basics;
import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		food.remove(2);
		food.clear();
		
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
