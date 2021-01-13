package Stage_01.Inheritance_Practice;

public class Car_a extends Auto {

	public Car_a(String name, String type) {
		super(name, type);
	}

	String air;
	String CD;
	
	public void speedUp() {
		System.out.println("The car is speeding up!");
	}
	
	public void speedDown() {
		System.out.println("The car is slowing down!");
	}
	
}
