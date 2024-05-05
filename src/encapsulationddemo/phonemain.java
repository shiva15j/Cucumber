package encapsulationddemo;

public class phonemain {

	public static void main(String[] args) {

		Phone pp = new Phone();
		pp.setRam(8);
		pp.setRom(256);
		pp.setColor("Green");
		pp.setProcessor("Octa core");

//		System.out.println(pp.getRam());
//		System.out.println(pp.getRom());
//		System.out.println(pp.getColor());
//		System.out.println(pp.getProcessor());

		System.out.println(pp);

	}

}
