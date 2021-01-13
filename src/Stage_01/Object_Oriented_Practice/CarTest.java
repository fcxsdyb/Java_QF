package Stage_01.Object_Oriented_Practice;

public class CarTest {
	
	public static class Car{
		
		public String color;
		public String brand;
		public String car_id;
		public double cost;
		
		public void accelerate() {
			System.out.println("Keep going!");
		}
	}

	public static void main(String[] args) {

		Car car_a = new Car();
		car_a.color = "red";
		car_a.brand = "BMW";
		car_a.car_id = "’„A99999";
		car_a.cost = 888888.88;
		car_a.accelerate();

	}

}
