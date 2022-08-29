package euclid;
// 출처: https://www.acmicpc.net/problem/4153

// 문제: 기하, 4153번: 직각삼각형

import java.util.Scanner;

public class B4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();

			if (x == 0 && y == 0 && z == 0)
				break;

			if ((x * x + y * y) == z * z) {
				System.out.println("right");
			} else if (x * x == (y * y + z * z)) {
				System.out.println("right");
			} else if (y * y == (x * x + z * z)) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}

}
