package Stage_01.Variable_Calculation_Practice;

public class P3 {

	public static void main(String[] args) {

		int a = 3;
		int b = 8;
		int c = (a > b) ? a++ : b++;
		System.out.println("a = " + a + "\t b = " + b + "\t c = " + c);
		
		int d = (a > b) ? ++a : ++b;
		System.out.println("a = " + a + "\t b = " + b + "\t d = " + d);
		
		int e = (a < b) ? a++ : b++;
		System.out.println("a = " + a + "\t b = " + b + "\t e = " + e);
		
		int f = (a < b) ? ++a : ++b;
		System.out.println("a = " + a + "\t b = " + b + "\t f = " + f);


	}

}
