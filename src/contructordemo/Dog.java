package contructordemo;

public class Dog {

	// Constructor name should be same as of the class name.

	// Constructor do not have any type

	// You don't need to call a Constructor it is going to initialize itself at the
	// time of object creation

	// You can Overload a Constructor
	
	
	// Constructor is of 3 types
	// 1:- Default
	// 2:- Parameterized
	// 3:- Non Parameterized

	public Dog() {

		System.out.println("I am a Constructor of The Dog ");
	}

	public Dog(String type) {
		System.out.println("The Dog is of type=:" + type);

	}

	public Dog(String type, String color) {
		System.out.println("The Dog type =:" + type);
		System.out.println("The color of the Dog=:" + color);
	}

	public void run() {
		System.out.println("This Dog can run!!!!!!!!!!!!");
	}

	public void walk() {
		System.out.println("This Dog can walk!!!");
	}

	public void sleep() {
		System.out.println("This Dog can sleep as well!!!");
	}
}
