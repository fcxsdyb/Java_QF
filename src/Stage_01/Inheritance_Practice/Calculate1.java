package Stage_01.Inheritance_Practice;

public class Calculate1 {

	public int add(int a, int b) {
		int result = a + b;
		return result;
	}

	public int sub(int a, int b) {
		int result = a - b;
		return result;
	}

}

class Calculate2 extends Calculate1 {

	public int mul(int a, int b) {
		int result = a * b;
		return result;
	}

	public int div(int a, int b) {
		int result = a / b;
		return result;
	}

}