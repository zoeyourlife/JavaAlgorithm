package math1;
// 출처: https://www.acmicpc.net/problem/2292

// 문제: 기본수학, 2292번, 벌집문제

import java.util.Scanner;

public class B2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int count = 1;
		int range = 2;

		if (n == 1) {
			System.out.print(1);
		}

		else {
			while (range <= n) {
				range = range + (6 * count);
				count++;
			}

			System.out.print(count);
			sc.close();
		}
	}

}
