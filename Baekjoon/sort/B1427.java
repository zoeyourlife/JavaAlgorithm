package sort;
// 출처: https://www.acmicpc.net/problem/1427

// 문제: 1427번: 소트인사이드
// 방법: Scanner

import java.util.Scanner;

public class B1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] count = new int[10];

		int n = sc.nextInt();

		while (n != 0) {
			count[n % 10]++;
			n /= 10;
		}

		for (int i = 9; i >= 0; i--) {
			while (count[i]-- > 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
