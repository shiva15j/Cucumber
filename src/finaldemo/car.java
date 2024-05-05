package finaldemo;

public final class car {

	final int price = 20000;

	String color = "red";

	final public void price() {
		// price = 30000;
		System.out.println("The price of the car is=:" + price);
	}

	public void color() {
		color = "black";
		System.out.println("The color of the car is =:" + color);
	}

}
