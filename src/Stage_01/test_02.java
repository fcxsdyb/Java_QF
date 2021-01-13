package Stage_01;

public class test_02 {
	public static void main(String[] args) {
		for (int a = 1; a <= 9; a++) {
			for (int b = 1; b <= 9; b++) {
				for (int c = 1; c <= 9; c++) {
					for (int d = 1; d <= 9; d++) {
						for (int e = 1; e <= 9; e++) {
							for (int f = 1; f <= 9; f++) {
								for (int g = 1; g <= 9; g++) {
									for (int h = 1; h <= 9; h++) {
										for (int k = 1; k <= 9; k++) {
											if (((a + b + c == a + d + g) && (a + d + g == b + e + h)
													&& (a + d + g == c + f + k) && (b + e + h == c + f + k)
													&& (d + e + f == g + h + k) && (g + h + k == a + b + c)
													&& (d + e + f == a + b + c) && (c + e + g == a + e + k))
													&& ((a != b && a != c && a != d && a != e && a != f && a != g
															&& a != h && a != k))
													&& ((c != b && a != c && c != d && c != e && c != f && c != g
															&& c != h && c != k))
													&& ((a != b && b != c && b != d && b != e && b != f && b != g
															&& b != h && b != k))
													&& ((d != b && d != c && d != a && d != e && d != f && d != g
															&& d != h && d != k))
													&& ((e != b && e != c && e != d && e != a && e != f && e != g
															&& e != h && e != k))
													&& ((f != b && f != c && f != d && f != e && f != a && f != g
															&& f != h && f != k))
													&& ((g != b && g != c && g != d && g != e && g != f && g != a
															&& g != h && g != k))
													&& ((h != b && h != c && h != d && h != e && h != f && h != g
															&& h != a && h != k))
													&& ((k != b && k != c && k != d && k != e && k != f && k != g
															&& k != h && k != a))) {
												System.out.print(a + "\t");
												System.out.print(b + "\t");
												System.out.println(c + "\t");
												System.out.print(d + "\t");
												System.out.print(e + "\t");
												System.out.println(f + "\t");
												System.out.print(g + "\t");
												System.out.print(h + "\t");
												System.out.println(k + "\t");

												System.out.println();
												System.out.println();

											}

										}

									}

								}

							}

						}

					}

				}

			}

		}

	}
}
