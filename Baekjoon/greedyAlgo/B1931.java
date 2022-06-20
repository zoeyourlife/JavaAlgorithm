package greedyAlgo;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// 출처: https://www.acmicpc.net/problem/1931
// 문제: 회의실 배정, 1931번, 그리디 알고리즘
// 입력: 회의의 수, 둘째 줄부터 N+1 줄까지 각 회의의 정보(공백)사이에 회의 시작시간 끝나는 시간.
// 출력: 첫째줄에 최대 사용할 수 있는 회의의 최대 개수를 출력

public class B1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] meeting = new int[N][2];

		for (int i = 0; i < N; i++) {
			meeting[i][0] = sc.nextInt(); // 시작 시간
			meeting[i][1] = sc.nextInt(); // 종료 시간
		}
		// [0][0] [0][1] 첫번째 시작시간, 종료시간
		// ...
		// [N-1][0] [N-1][1] 마지막 입력 회의 시작시간, 종료시간

		// Array.sort()는 배열만 파라이터로 받는 것이 아니라 Comparator 또한 파라미터로 받는게 가능
		// Comparator로 객체 생성과 동시에 객체배열 meeting을 정렬
		// 익명함수 부분으로 바로 함수 구현
		Arrays.sort(meeting, new Comparator<int[]>() {

			@Override
			public int compare(int[] t1, int[] t2) {

				if (t1[1] == t2[1]) {
					return t1[0] - t2[0];
					// 만약 끝나는 시간이 같다면, 시작하는 시간을 오름차순 정렬을 해준다.
				}

				return t1[1] - t2[1];
			}
			// 객체를 비교할 때 선행에서 후행을 뺀 값이 음수라면 위치를 바꾸지 않고
			// 음수가 아니라 양수가 나오면 위치를 바꿔서 오름차순 정렬을 해준다.
		});

		int count = 0;
		int endTime = 0;

		for (int i = 0; i < N; i++) {

			if (endTime <= meeting[i][0]) {
				endTime = meeting[i][1];
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}
}
