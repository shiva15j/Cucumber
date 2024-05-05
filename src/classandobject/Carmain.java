package classandobject;

public class Carmain {

	public static void main(String[] args) {

		Car cc = new Car();

		cc.speed();
		cc.accelerator();
		cc.breaks();
		cc.clutch();
		cc.headlight();

		System.out.println("**************");

		Car cd = new Car("Green");
		cd.accelerator();
		cd.breaks();
		cd.clutch();
		cd.headlight();
		cd.speed();

		System.out.println("********************");

		Car cf = new Car(20000);
		cf.accelerator();
		cf.clutch();
		cf.breaks();
		cf.headlight();
		cf.speed();

	}

}
