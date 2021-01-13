package Stage_01.Object_Oriented_Practice;

public class Animal {
	
	String name;
	int age;
	String type;
	Zoo zoo;

	public void move(){
		System.out.println("Animals can move.");
	}
	
	public Zoo getZoo() {
		return this.zoo;
	}
	
	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}
	
}

class Dog extends Animal{
	
	public void move(){
		super.move();
		System.out.println("Dog can walk and run.");
	}
	
	public void bark(){
		System.out.println("Dog can bark.");
	}
	
}
