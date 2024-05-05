package classandobject;

public class Car {

	// Constructor:-
	// Same name as of the class name
	// No type
	// Can not be called invoked automatically at the time of the object creation

	public Car() {
		System.out.println("I am a car construcor");
	}

	public Car(String color) {
		System.out.println("The color of the car is green");
	}

	public Car(int price) {
		System.out.println("The price of the car is=:" + price);
	}

	public void speed() {
		System.out.println("The speed of the car is 200 km/h");
	}

	public void accelerator() {
		System.out.println("The car has good acceleration");
	}

	public void headlight() {
		System.out.println("This cas has good headlights");
	}

	public void clutch() {
		System.out.println("The car has smooth clutch");
	}

	public void breaks() {
		System.out.println("The car has disc break");
	}

}
