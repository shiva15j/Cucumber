package encapsulationddemo;

public class Phone {

	private int ram;

	private int rom;

	private String color;

	private String processor;

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRom() {
		return rom;
	}

	public void setRom(int rom) {
		this.rom = rom;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProcessor() {
		return processor;
	}

	
	public void setProcessor(String processor) {
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [ram=" + ram + ", rom=" + rom + ", color=" + color + ", processor=" + processor + "]";
	}

}
