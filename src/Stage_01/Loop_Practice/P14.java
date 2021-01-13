package Stage_01.Loop_Practice;

public class P14 {

	public static void main(String[] args) {

		for (int i = 1000; i <= 9999; i++) {
			int a = i / 1000;
			int b = (i % 1000) / 100;
			int c = (i % 100) / 10;
			int d = i % 10;
			
			if ((a * 10 + b)*(c * 10 + d) == i && (b != 0 || d != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (a * 10 + b) + " and " + (c * 10 + d));
				continue;
			} else if ((a * 10 + b)*(d * 10 + c) == i && (b != 0 || c != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (a * 10 + b) + " and " + (d * 10 + c));
				continue;
			} else if ((a * 10 + c)*(b * 10 + d) == i && (c != 0 || d != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (a * 10 + c) + " and " + (b * 10 + d));
				continue;
			} else if ((a * 10 + c)*(d * 10 + b) == i && (c != 0 || b != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (a * 10 + c) + " and " + (d * 10 + b));
				continue;
			} else if ((a * 10 + d)*(b * 10 + c) == i && (d != 0 || c != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (a * 10 + d) + " and " + (b * 10 + c));
				continue;
			} else if ((a * 10 + d)*(c * 10 + b) == i && (d != 0 || b != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (a * 10 + d) + " and " + (c * 10 + b));
				continue;
			} else if ((b * 10 + a)*(c * 10 + d) == i && (a != 0 || d != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (b * 10 + a) + " and " + (c * 10 + d));
				continue;
			} else if ((b * 10 + a)*(d * 10 + c) == i && (a != 0 || c != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (b * 10 + a) + " and " + (d * 10 + c));
				continue;
			} else if ((b * 10 + c)*(d * 10 + a) == i && (c != 0 || a != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (b * 10 + c) + " and " + (d * 10 + a));
				continue;
			} else if ((b * 10 + d)*(c * 10 + a) == i && (d != 0 || a != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (b * 10 + d) + " and " + (c * 10 + a));
				continue;
			} else if ((c * 10 + b)*(d * 10 + a) == i && (b != 0 || a != 0)) {
				System.out.println(i + " is one of vampire number and its fangs are " + (c * 10 + b) + " and " + (d * 10 + a));
				continue;
			}
		}

	}

}
