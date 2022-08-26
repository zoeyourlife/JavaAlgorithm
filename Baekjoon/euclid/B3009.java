package euclid;
// 출처 : https://www.acmicpc.net/problem/3009

// 문제 : 기하/ 3009번: 네 번째 점
// 방법 : Scanner

import java.util.Scanner;

public class B3009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] coord1 = { sc.nextInt(), sc.nextInt() }; // 첫 번째 좌표
		int[] coord2 = { sc.nextInt(), sc.nextInt() }; // 두 번째 좌표
		int[] coord3 = { sc.nextInt(), sc.nextInt() }; // 세 번째 좌표

		sc.close();

		int x;
		int y;

		// x 좌표 비교 후 쌍을 이루지 않는 x좌표를 저장
		// 1번 2번 좌표 비교
		
		if (coord1[0] == coord2[0]) {
			x = coord3[0];
		}
		// 1번 3번 좌표 비교
		else if (coord1[0] == coord3[0]) {
			x = coord2[0];
		}
		// 2번 3번 좌표 비교
		else {
			x = coord1[0];
		}
		
		// vice versa (y좌표)

		if (coord1[1] == coord2[1]) {
			y = coord3[1];
		} else if (coord1[1] == coord3[1]) {
			y = coord2[1];
		} else {
			y = coord1[1];
		}
		System.out.println(x + " " + y);
	}

}
