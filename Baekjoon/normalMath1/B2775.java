package math1;

import java.util.Scanner;

// 출처: https://www.acmicpc.net/problem/2775
// 문제: 기본수학, 2775번, 부녀회장이 될테야
public class B2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] apt = new int[15][15];

		for (int i = 0; i < 15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}

		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				apt[i][j] = apt[i][j - 1] + apt[i - 1][j];
			}
		}

		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			System.out.println(apt[k][n]);
		}

		sc.close();
	}

}
