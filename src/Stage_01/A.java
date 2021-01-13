package Stage_01;

class A {

	A() {
		System.out.println("A");
	}

	public static void main(String[] args) {
		C c = new C();
	}

}

class B {

	B() {
		System.out.println("B");
	}

}

class C extends A {

	B b;

	C() {
		System.out.println("C");
	}

}