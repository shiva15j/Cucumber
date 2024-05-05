package polydemo;

public class racingcar extends supercar {
	
	public void speed() {
		System.out.println("The speed of the racing car is 700 km/h");
	}
	
	public void display() {
		this.speed();
		super.speed();
	}
	

}
