package Stage_01.Object_Oriented_Practice;

public class Point {

	private int x;
	private int y;
	private int z;

	public Point() {

	}

	public Point(int a, int b, int c) {
		x = a;
		y = b;
		z = c;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int aa() {
		return x * x + y * y + z * z;
	}

	public static void main(String[] args) {

		Point p = new Point(10, 20, 30);
		System.out.println(p.aa());

	}

}
