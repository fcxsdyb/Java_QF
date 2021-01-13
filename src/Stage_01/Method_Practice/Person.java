package Stage_01.Method_Practice;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		name = "name";
		age = 18;
	}
	
	public void display() {
		System.out.println("The person's name is " + this.name + " and the age is " + age +" .");
	}
	
	public static void main(String[] args) {

		Person a = new Person();
		a.display();
		a.name = "Bob";
		a.age = 21;
		a.display();
		System.out.println(a.age);

	}

}
