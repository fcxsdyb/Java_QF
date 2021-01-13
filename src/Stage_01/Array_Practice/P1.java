package Stage_01.Array_Practice;

public class P1 {

	public static void main(String[] args) {

		String[] stringArray = new String[3];
		for (int i = 0; i < stringArray.length; i++) { 
			System.out.println(stringArray[i]);
		}
		
		for (int i = 0; i < stringArray.length; i++) { 
			stringArray[i] = new String();
			System.out.println(stringArray[i]);
		}

	}

}
