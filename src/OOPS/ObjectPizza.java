package OOPS;

public class ObjectPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza pizza1 = new Pizza("thick crust", "tomato", "mozzerella", "pepperoni");
		Pizza pizza2 = new Pizza("thick crust", "tomato", "mozzerella");
		Pizza pizza3 = new Pizza("thick crust", "tomato");
		Pizza pizza4 = new Pizza("thick crust");
		Pizza pizza = new Pizza();
		System.out.println("Here are the ingredients of your pizza:");
		System.out.println(pizza1.bread);
		System.out.println(pizza1.sauce);
		System.out.println(pizza1.cheese);
		System.out.println(pizza1.topping);
	}

}
