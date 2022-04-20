package hw1_1;

import java.util.Scanner;

public class IndexSum {

	public static void main(String[] args) {
		System.out.println("hw1_1 : 최재훈");
		// 배열 array 초기화
		int[] array = { -10, -20, 30, 40, 50, 60, 70, 80, 90, 100, 10, 20 };
		// Scanner
		Scanner sc = new Scanner(System.in);
		// 하한 입력 받고 lb에 넣기
		System.out.print("하한 입력(0~11) :");
		int lb = sc.nextInt();
		// lb의 조건
		if (lb < 0 || lb > 12) {
			System.out.print("다시 입력하세요.");
		}
		// 상한 입력 받고 ub에 넣기
		System.out.print("상한 입력(0~11) :");
		int ub = sc.nextInt();
		if (ub < 0 || ub > 12) {
			System.out.print("다시 입력하세요.");
		}
		// 반복 알고리즘을 통하여 배열 원소 array 출력
		System.out.print("출력 = ");
		iterativeArrayPrint(array, lb, ub);
		System.out.print("\n");
		// 재귀함수를 이용해 합을 구한후 리턴값 출력
		System.out.print("합 = " + recursiveArrayPrint(array, lb, ub));

		sc.close();

	}

	// array, ib, ub를 매개변수로 받고, 반복문을 통해서 array를 차례대로 출력
	public static void iterativeArrayPrint(int[] array, int lb, int ub) {
		for (int i = lb; i <= ub; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// 매개변수를 받고 lb가 ub랑 같아질 때 까지 재귀함수 호출해서 총합 구하기
	public static int recursiveArrayPrint(int[] array, int lb, int ub) {
		if (lb <= ub) {
			recursiveArrayPrint(array, lb + 1, ub);
			return array[lb] + recursiveArrayPrint(array, lb + 1, ub);
		}
		// lb가 ub를 넘으면 재귀함수 종료
		else {
			return 0;
		}
	}

}
