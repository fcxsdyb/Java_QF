package Stage_01.Inheritance_Practice;

public class Vehicles {

	String brand;
	String color;

	void run() {
		System.out.println("I have already started!");
	}

	void showInfo() {
		System.out.println("The brand of the car is " + this.brand + " and its color is " + color + ".");
	}

	public static void main(String[] args) {

		Vehicles a = new Vehicles();
		Car b = new Car();
		Truck c = new Truck();

		a.brand = "BWM";
		a.color = "Blue";
		b.brand = "Benz";
		b.color = "Black";
		b.seats = 5;
		c.brand = "Audi";
		c.color = "Grey";
		c.load = 70.5f;

		a.run();
		b.run();
		c.run();

		a.showInfo();
		b.showInfo();
		b.showCar();
		c.showInfo();
		c.showTruck();

	}

}

class Car extends Vehicles {

	int seats;

	void showCar() {
		System.out.println("The brand of the car is " + this.brand + " and its color is " + this.color
				+ " and it can carry " + seats + " people.");
	}

}

class Truck extends Vehicles {
	float load;

	void showTruck() {
		System.out.println("The brand of the car is " + this.brand + " and its color is " + this.color
				+ " and it can carry " + load + " goods.");
	}
}