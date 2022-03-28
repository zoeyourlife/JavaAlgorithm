package baekjoon;

import java.util.Scanner;

//주사위 세개 문제
public class B2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int pMoney = 0;
		if ((a == b) && (b == c)) {
			pMoney = 10000 + (a * 1000);
		} else if (a != b && a != c && b != c) {
			if (a > b) {
				if (a > c) {
					pMoney = a * 100;
				} else
					pMoney = c * 100;
			} else if (b > c) {
				pMoney = b * 100;
			} else {
				pMoney = c * 100;
			}
		} else {
			pMoney = 1000;
			int same = 0;
			
			if (a == b) {
				same = a;
			} else if (a == c) {
				same = a;
			} else if (b == c) {
				same = b;
			}

			pMoney += same * 100;
		}

		System.out.println(pMoney);
		sc.close();

	}

}
