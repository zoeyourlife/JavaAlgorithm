package baekjoon.baekjoon_practice;

import java.util.Scanner;

//�� ���-1
public class B2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}

		sc.close();

	}

}
