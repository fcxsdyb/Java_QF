package Stage_01.Inheritance_Practice;

class Auto {

	int wheelNum;
	String color;
	double weight;
	double speed;
	String name;
	String type;

	public Auto(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Auto(int wheelNum, String color, double weight, double speed, String name, String type) {
		this.wheelNum = wheelNum;
		this.color = color;
		this.weight = weight;
		this.speed = speed;
		this.name = name;
		this.type = type;
	}

	public void speedUp() {
		System.out.println("It goes faster!");
	}

	public void speedDown() {
		System.out.println("It goes slower!");
	}

	public void parking() {
		System.out.println("It stops.");
	}

}
