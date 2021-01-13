package Stage_01;

public class char_test {

	public static void main(String[] args) {
		
		char ch[] = new char[] {'3', 'f', 'v', '0', '4'};
		String s = new String(ch);
		System.out.println(s);
		
		long result = 0;
		for (int i = 1; i < 5; i++) {
			result += i * (i + 1);
		}
		System.out.println(result);
		
		String[] s1 = {"3435", "fdgsfg", "455f", "fdsfg", "f34gs"};
	}
	
}
