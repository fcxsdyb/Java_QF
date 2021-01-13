package Stage_01.Loop_Practice;

public class P11 {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++) {
			if (i <= 4) {
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print(" * ");
				}
				System.out.println();
			} else {
				for (int k = 1; k <= 7 - (i - 4) * 2; k++) {
					System.out.print(" * ");
				}
				System.out.println();
			}
			
		}

	}

}
