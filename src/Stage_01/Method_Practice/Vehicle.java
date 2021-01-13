package Stage_01.Method_Practice;

public class Vehicle {
	
	int speed;
	String size;
	
	public void move(int s) {
		System.out.println("The moving distance is " + s + " m.");
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void speedUP(int s) {
		this.speed += s;
	}
	
	public void speedDown(int s) {
		this.speed -= s;
	}
	
	public void show() {
		System.out.println("The speed of this car is " + this.speed + " and its size is " + this.size + " .");
	}

	public static void main(String[] args) {

		Vehicle a = new Vehicle();
		a.speed = 55;
		a.size = "Large";
		a.show();
		a.move(444444);
		a.setSpeed(100);
		System.out.println("The current speed of the car is " + a.speed + " .");
		a.speedUP(20);
		System.out.println("The current speed of the car is " + a.speed + " .");
		a.speedDown(20);
		System.out.println("The current speed of the car is " + a.speed + " .");
		
	}

}
