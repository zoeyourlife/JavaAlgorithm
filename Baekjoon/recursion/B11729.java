package recursion;
// 출처: https://www.acmicpc.net/problem/11729
// 문제: 재귀, 11729번: 하노이 탑 이동순서
// 방법: Scanner 방법

import java.util.Scanner;

public class B11729 {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sb.append((int) (Math.pow(2, n) - 1)).append('\n');

		HanoiTop(n, 1, 2, 3);
		System.out.println(sb);
		
		sc.close();

	}

	public static void HanoiTop(int n, int start, int mid, int to) {
		if (n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}

		HanoiTop(n - 1, start, to, mid);

		sb.append(start + " " + to + "\n");

		HanoiTop(n - 1, mid, start, to);
	}

}
