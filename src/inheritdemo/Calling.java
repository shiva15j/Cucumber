package inheritdemo;

public class Calling {

	public static void main(String[] args) {

		Car cc = new Car();

		cc.run();
		cc.speed();

		System.out.println("************");

		SuperCar sc = new SuperCar();

		sc.run();
		sc.speed();
		sc.gear();
		sc.acclerator();

	}

}
