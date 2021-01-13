package Stage_01.Object_Oriented_Practice;

public class AnimalTest {

	public static void main(String[] args) {

		Animal a = new Animal(); // Animal 对象
		Dog b = new Dog(); // Dog 对象
		 
		a.move();// 执行 Animal 类的方法
		b.move();//执行 Dog 类的方法
		b.bark();

	}

}
