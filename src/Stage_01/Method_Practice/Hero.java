package Stage_01.Method_Practice;

public class Hero {
	
	int power = 100;;
	String name;

	void go() {
		if (this.power == 0) {
			System.out.println("The power of the hero is 0. He is dead.");
		}
		else {
			System.out.println("Keep going!");
		}
	}
	
	void eat(int n) {
		this.power += n;
		if (this.power > 100) {
			this.power = 100;
		}
	}
	
	void hurt() {
		this.power -= 10;
		if (this.power <= 0) {
			System.out.println("Hero is going to die.");
		}
	}
	
	public static void main(String[] args) {

		Hero Bob = new Hero();
		Bob.go();
		System.out.println(Bob.power);
		Bob.hurt();
		System.out.println(Bob.power);
		Bob.eat(3434);
		System.out.println(Bob.power);

	}

}
