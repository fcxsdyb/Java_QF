package Stage_01.Inheritance_Practice;

class A {
	int a = 1;
	double d = 2.0;

	void show() {
		System.out.println("Class A: a=" + a + "\td=" + d);
	}

	public static void main(String[] args) {

		A a = new A();
		a.show();

		A b = new B();
		b.show();

	}

}

class B extends A {
	float a = 3.0f;
	String d = "Java program.";

	void show() {
		super.show();
		System.out.println("Class B: a=" + a + "\td=" + d);
	}

}