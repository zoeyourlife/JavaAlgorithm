package numbercombine;
// 출처 : https://www.acmicpc.net/problem/2609

// 문제 : 정수론 및 조합론 / 2609번: 최대공약수와 최소공배수
// Greatest Common Divisor: 가장 큰 공통된 약수
// "A와 B 두 수가 주어지면 A의 약수들을 모두 구하고. B의 약수들을 모두 구하고 공통된 약수들만 찾아서 곱한다.
// 약수가 매우 많은 경우 시간이 오래 걸릴 것이다. --> 더 나은 방법? '유클리드 호제법'
/*
 두 수 a,b ( Z, r= a mod b 
 이 때 r은 (0<= r < b )이고 a>=b 이다.
 이 때 a와 b의 최대공약수를 (a, b)라고 할때 (a, b)의 최대공약수는 (b, r)의 최대공약수와 같다.
 즉 gcd(a,b) = gcd(b,r) < 이걸 적용해서 푼다.
 */

import java.util.Scanner;

public class B2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		// 최대공약수
		int d = gcd(a, b);

		System.out.println(d);
		System.out.println(a * b / d);
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		// gcd(a,b) = gcd(b,r), r= a%b
		return gcd(b, a % b);
	}

}
