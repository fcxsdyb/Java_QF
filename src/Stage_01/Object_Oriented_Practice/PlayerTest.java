package Stage_01.Object_Oriented_Practice;

public class PlayerTest {

	static class Player{
		
		double height;
		double weight;
		String name;
		
	}
	
	
	public static void main(String[] args) {

		Player a = new Player();
		a.height = 223.5;
		a.weight = 120;
		a.name = "Ming Yao";
		
		Player b = new Player();
		b.height = 198.0;
		b.weight = 92.5;
		b.name = "Kobe Bryant";

	}

}
