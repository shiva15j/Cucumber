package contructordemo;

public class Dogmain {

	public static void main(String[] args) {

//		Dog dd = new Dog();
//
//		dd.run();
//		dd.walk();
//		dd.sleep();
//
//		System.out.println("*********DOG WITH TYPE**********");
//
//		Dog df = new Dog("Labrador");
//		df.run();
//		df.walk();
//		df.sleep();
//
//		System.out.println("*********DOG WITH TYPE & COLOR**********");
//
//		Dog dh = new Dog("Labrador", "Red");
//
//		dh.walk();
//		dh.run();
//		dh.sleep();

		Dog dp;

		System.out.println("********************");
		dp = new Dog();
		dp.walk();
		dp.run();
		dp.sleep();

		System.out.println("***********DOG WITH TYPE**********");

		dp = new Dog("Lbarador");
		dp.walk();
		dp.sleep();
		dp.run();

		System.out.println("*********DOG WITH TYPE & COLOR******");

		dp = new Dog("Lbarador", "White");

		dp.run();
		dp.walk();
		dp.sleep();
	}

}
