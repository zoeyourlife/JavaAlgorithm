package baekjoon;

import java.util.Scanner;

public class B2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();

		if (min < 45) {
			if (hour == 0) {
				hour = 23;
				System.out.println(hour + " " + (15 + min));
			} else {
				System.out.println((hour - 1) + " " + (15 + min));
			}
		} else {
			System.out.println(hour + " " + (min - 45));
		}
		sc.close();

	}

}
