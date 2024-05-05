package classandobject1;

public class Calling {

	public static void main(String[] args) {

		Car cc = new Car();

		cc.run();
		cc.brakes("disc brakes");
		cc.model("BMW");

		System.out.println(cc.color);
		System.out.println(cc.price);
		System.out.println(cc.speeed);
		
		

	}

}
