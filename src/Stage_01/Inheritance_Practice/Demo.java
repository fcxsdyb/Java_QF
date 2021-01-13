package Stage_01.Inheritance_Practice;

class Test {
	Test() {
		System.out.println("Test");
	}
}

class Demo extends Test {
	Demo() {
		super();
		System.out.println("Demo");
	}

	public static void main(String[] args) {
		new Demo();
		new Test();
	}
}
