package numbercombine;
// 출처: https://www.acmicpc.net/problem/3036
// 문제: 정수론 3036번: 링
// 방법: Scanner

import java.util.Scanner;

public class B3036 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// 첫 링
		int fring = sc.nextInt();

		for (int i = 1; i < n; i++) {
			int otherRing = sc.nextInt();
			/// 기약분수로 만들어야함!
			int gcd = gcd(fring, otherRing);
			// 분모 분자 최대공약수로 나누기
			System.out.println((fring / gcd) + "/" + (otherRing / gcd));
		}
		sc.close();
	}

	// 최대공약수 찾기 메소드
	static int gcd(int a, int b) {
		int r;

		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}
