package algo.algorithm;

import java.util.Scanner;

//숫자
public class B10093 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long a = sc.nextLong();
		long b = sc.nextLong();

		if (b > a) {
			System.out.println(b - a - 1);

			for (int i = 1; i < b - a; i++) {
				System.out.print(a + i+" ");
			}
		} else if (a > b) {
			System.out.println(a - b - 1);

			for (int i = 1; i < a - b; i++) {
				System.out.print(b + i+" ");
			}
		} else {
			System.out.println(0);
		}
	}
}