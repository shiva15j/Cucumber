package polydemo;

public class carmain {

	
	public static void main(String[] args) {
		
		
		car cc = new car();
		cc.speed();
		cc.breaks();
		cc.color();
		
		System.out.println("*****************");
		
		supercar sc = new supercar();
		sc.speed();
		sc.breaks();
		sc.accelerator();
		sc.color();
		
		System.out.println("******************");
		sc.display();
		
		System.out.println("*************");
		
		racingcar rc = new racingcar();
		rc.display();
	}
	
}
