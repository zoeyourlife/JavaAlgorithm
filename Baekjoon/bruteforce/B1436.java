package bruteforce;
// 출처: https://www.acmicpc.net/problem/1436

// 문제: 백준 1436번: 영화감독 숌
// 방법: Scanner

import java.util.Scanner;

public class B1436 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int num = 666;
		int cnt = 1;

		while (cnt != n) {
			num++;
			if (String.valueOf(num).contains("666")) {
				cnt++;
			}
		}
		System.out.println(num);
		sc.close();
	}

}
