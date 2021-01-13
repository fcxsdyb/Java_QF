package Stage_01.Loop_Practice;

public class P13 {

	public static void main(String[] args) {

		int count = 0;
		
		for (int i = 1; i <= 1000; i++) {
			count = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					count += j;
				}
			}
			
			if (count == i) {
				System.out.println(count + " is one of the ÍêÊý.");
			}
		}

	}

}
