package Stage_01.Object_Oriented_Practice;

public class Person {

	int age;
	String name;
	String sex;
	
	public static void main(String[] args) {
		
		Person[] a = new Person[2];
		Person a1 = new Person();
		a1.name = "Bob";
		a1.age = 21;
		a[0] = a1;
		System.out.println(a[0]);
		
	}

}
