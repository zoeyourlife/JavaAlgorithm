package math2;
// 출처: https://www.acmicpc.net/problem/1978

// 문제: 기본 수학2, 1978번: 소수 찾기
// 방법: 에라토스테네스의 체

import java.util.Scanner;

public class B1978 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int cnt = 0;

		for (int i = 0; i < n; i++) {
			boolean isPrime = true;

			int num = sc.nextInt();

			if (num == 1) {
				continue;
			}
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				cnt++;
			}
		}
		System.out.println(cnt);

		sc.close();
	}

}
