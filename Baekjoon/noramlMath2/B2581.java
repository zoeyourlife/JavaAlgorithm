package math2;

import java.util.Scanner;

// 출처: https://www.acmicpc.net/problem/2581
// 문제: 기본수학2, 소수, 2581번
// 방법: Scanner

public class B2581 {

	public static boolean prime[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		prime = new boolean[n + 1];
		get_prime();

		int sum = 0;
		int min = Integer.MAX_VALUE;

		for (int i = m; i <= n; i++) {
			if (prime[i] == false) {
				sum = sum + i;
				if (min == Integer.MAX_VALUE) {
					min = i;
				}
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
		sc.close();
	}

	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			for (int j = i * i; j < prime.length; j = j + i) {
				prime[j] = true;
			}
		}
	}
}
