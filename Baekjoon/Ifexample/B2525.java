package baekjoon;

import java.util.Scanner;

public class B2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 시 time, 분min 입력
		int time = sc.nextInt();
		int min = sc.nextInt();

		// 걸리는 시간 cookTime 입력
		int cookTime = sc.nextInt();

		int totalTime = time * 60 + min + cookTime;

		int hour = totalTime / 60;

		if (hour > 23) {
			hour -= 24;
		}

		int min2 = totalTime % 60;

		System.out.println("" + hour+" "+min2);

		sc.close();

	}

}
