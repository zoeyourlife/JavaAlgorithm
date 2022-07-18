package math2;

import java.util.Scanner;

// 출처: https://www.acmicpc.net/problem/9020
// 문제: 기본수학 2, 9020번: 골드바흐의 추측
// 방법: Scanner
public class B9020 {

	public static boolean[] prime = new boolean[10001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		getPrime();

		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int first_part = n / 2;
			int second_part = n / 2;

			while (true) {

				if (!prime[first_part] && !prime[second_part]) {
					System.out.println(first_part + " " + second_part);
					break;
				}

				first_part--;
				second_part++;
			}
		}
	}

	public static void getPrime() {
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}

}
