package classandobject1;

public class Dog {
	
	
	// Constructors
	
	public Dog() {
		
	}
	
	
	public Dog(String breed) {
		System.out.println("The dog has breed"+breed);
	}

	int tail = 1;

	String color = "White";

	int age = 4;

	public void run() {
		System.out.println("This dog can run!!!!!!!");
	}

	public void bark() {
		System.out.println("This dog can barkkkkkkkkkkkkkkkkkkk");
	}

	public void eat() {
		System.out.println("This dog can eat");
	}

	public void sleep() {
		System.out.println("This dog can sleep");
	}

}
