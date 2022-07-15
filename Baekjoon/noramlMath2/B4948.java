package math2;
// 출처: https://www.acmicpc.net/problem/4948

// 문제: 기본수학2, 4948번: 베르트랑 공준, 소수 응용문제 1
// 방법: SCANNER

import java.util.Scanner;

public class B4948 {

	public static boolean[] prime = new boolean[246913];
	// n>123456 2n은 246912가 최대

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		getPrime();

		while (true) {
			int n = sc.nextInt();
			if (n == 0)
				break;

			int cnt = 0;

			for (int i = n + 1; i <= 2 * n; i++) {
				if (!prime[i])
					cnt++;
			}
			System.out.println(cnt);
		}
		sc.close();
	}

	public static void getPrime() {
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i * i; j < prime.length; j = j + i) {
				prime[j] = true;
			}
		}
	}

}
