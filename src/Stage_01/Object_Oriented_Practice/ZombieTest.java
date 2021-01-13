package Stage_01.Object_Oriented_Practice;

public class ZombieTest {

	static class Zombie{
		
		String name;
		int physical;
		int attack;
		
	}
		
		
	public static void main(String[] args) {

		Zombie a = new Zombie();
		a.name = "Yao";
		a.physical = 500;
		a.attack = 125;
			
		Zombie b = new Zombie();
		b.name = "Ming";
		b.physical = 1500;
		b.attack = 1250;
	}

}
