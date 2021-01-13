package Stage_01.Loop_Practice;

public class P16 {

	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			if (i <= 5) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 2 * i - 1; k++) {
					if (k == 1 || k == i) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
				}
				System.out.println();
			} else {
				for (int j = 5; j <= i - 1; j++) {
					System.out.print(" ");
				}
				for (int k = 1; k <= 9 - i + 1; k++) {
					if (k == 1 || k == 9 - i + 1) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}
					
				}
				System.out.println();
			}
		}

	}

}
