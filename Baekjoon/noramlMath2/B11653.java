package math2;

import java.util.Scanner;

// 출처: https://www.acmicpc.net/problem/11653
// 문제: 기본수학2, 11653번, 소인수분해
// 방법: Scanner
public class B11653 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}
		if (n != 1) {
			System.out.println(n);
		}
	}

}
