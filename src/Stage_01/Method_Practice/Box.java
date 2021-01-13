package Stage_01.Method_Practice;

public class Box {
	
	double length;
	double width;
	double height;

	public static void main(String[] args) {

		Box a = new Box();
		a.length = 32;
		a.width = 3;
		a.height = 32.34;
		
		System.out.println("The area of the box a is " + area(a.length, a.width, a.height) + 
				" and its volume is " + volume(a.length, a.width, a.height));
		
	}
	
	public static double area(double a, double b, double c) {
		double sum = 0;
		sum = a * b * 2 + a * c * 2 + b * c * 2;
		return sum;
	}
	
	public static double volume(double a, double b, double c) {
		double sum = 0;
		sum = a * b * c;
		return sum;
	}

}
