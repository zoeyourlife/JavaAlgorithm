package math2;

import java.util.Scanner;

// 출처: https://www.acmicpc.net/problem/1929
// 문제: 기본수학2, 1929번: 소수 구하기
// 방법: Scanner!
public class B1929 {

	public static boolean[] prime;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		prime = new boolean[n + 1];
		getPrime();

		for (int i = m; i <= n; i++) {
			if (!prime[i])
				System.out.println(i);
		}
		sc.close();
	}

	public static void getPrime() {
		prime[0] = prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])
				continue;
			for (int j = i*i; j < prime.length; j = j + i) {
				prime[j] = true;
			}
		}
	}

}
