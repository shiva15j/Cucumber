package polydemo;

public class supercar extends car {
	
	public void speed() {
		System.out.println("The speed of the supercar is 500 km/h");
	}
	
	public void accelerator() {
		System.out.println("The accelrator of the supercar is high");
	}
	
	public void display() {
		// local refrence 
		this.speed();
		// parent
		super.speed();
	}

}
