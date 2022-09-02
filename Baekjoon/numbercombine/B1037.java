package numbercombine;

import java.util.Scanner;

// 출처 : https://www.acmicpc.net/problem/1037
// 문제 : 정수론과 조합론 1037번: 약수
// 방법: Scanner

// 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다.
// 어떤 수 N의 진짜 약수가 모두 주어질 때 N을 구하여라
// 에제 입력 2    4 2   출력  8
// 이를 토대로 보아
// 약수의 최솟값과 최댓값을 곱하면 된다. 
public class B1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt(); // N의 진짜 약수의 개수

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		while (t --> 0) { // t -- ; , t >0 이 뜻
			int n = sc.nextInt();
			if (n > max)
				max = n;
			if (n < min)
				min = n;
		}
		System.out.println(max * min);
		sc.close();
	}

}
