package array1;

import java.util.Scanner;

// 1차원배열/ 평균은 넘겠지
public class B4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt(); // 테스트의 개수 c

		for (int i = 0; i < c; i++) {
			int n = sc.nextInt(); // 학생수 n 입력
			int score[] = new int[n]; // 학생 수 만큼의 score 객체 배열 생성
			int sum = 0; // 학생들의 총 점수
			double average = 0; // 학생들의 평균 점수 더블형 초기화

			for (int j = 0; j < n; j++) { // 학생들의 점수 배열에 입력받고 합계 구함
				score[j] = sc.nextInt();
				sum += score[j];
			}

			average = (double) sum / n; // 평균 구한 후

			int count = 0;
			for (int j = 0; j < n; j++) { //학생 수 만큼 배열 돌리면서 배열이 평균보다 크면 count 증가
				if (average < score[j]) {
					count++;
				}
			}
			// count는 평균을 넘는 학생들의 수이고, 100을 곱하고 학생수로 나누면 비율이 나옴.
			// String.format("%.xf",n)은 소수점 x+1번째 자리를 반올림하여 소수점 x번째 자리까지만 표현하는 뜻
			System.out.println(String.format("%.3f", (double) count * 100 / n) +"%");
		}
		sc.close();

	}

}
