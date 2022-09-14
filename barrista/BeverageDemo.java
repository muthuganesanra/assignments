package barrista;

public class BeverageDemo {
	public static void main(String[] args) {
		Beverage c1 = new Coffee(50);
		c1 = new Caramel(c1, 20);
		c1 = new Cream(c1, 30);
		printCoffee(c1);

	}

	private static void printCoffee(Beverage c) {
		System.out.println("Cost: " + c.getCost() + ", Description: " + c.getDescription());
	}


}
