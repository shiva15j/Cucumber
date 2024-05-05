package classandobject1;

public class Dogmain {

	public static void main(String[] args) {

		Dog dd = new Dog();
		System.out.println("I am a Dog having Behaviors and Attributes=:");
		System.out.println(" ");
		System.out.println("Behaviors=:");
		dd.bark();
		dd.run();
		dd.eat();
		dd.sleep();
		System.out.println(" ");
		System.out.println("Attributes=:");
		dd.tail = 2;
		System.out.println("This dog has tail=:" + dd.tail);
		System.out.println("This dog has age=:" + dd.age);
		System.out.println("This dog has color=:" + dd.color);

		System.out.println("*************");

		Dog ds = new Dog("German Shpeard");

	}

}
