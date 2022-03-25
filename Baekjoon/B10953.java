package baekjoon;

import java.util.Scanner;

public class B10953 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 테스트의 개수 입력
		int t = sc.nextInt();
		// 정수 A, B 입력
		for (int i = 1; i <= t; i++) {
			String s = sc.next();
			String[] arr = s.split(",");
			System.out.println(Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
		}
		sc.close();
	}

}
