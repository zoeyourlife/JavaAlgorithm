package baekjoon.baekjoon_practice;

import java.util.Scanner;

// A+B = 8
public class B11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �׽�Ʈ�� ���� �Է�
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a + b;

			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + sum);

		}

		sc.close();

	}

}
