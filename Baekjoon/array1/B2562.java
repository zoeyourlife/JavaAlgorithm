package array1;

import java.util.Scanner;

// 1차원 배열 - 최댓값 
public class B2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 크기가 9, 개수가 9개인 배열 생성
		int arr[] = new int[9];
		// 9개의 자연수 a를 배열 i에 삽입
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) { // 첫수도 비교해줄 수 있게 이상으로 비교 .
				max = arr[i];
				maxIndex = i + 1; // 반례존재 첫수가 가장크면 if문을 안들어가니까?
									// maxIndex는 그대로 0이 출력되버리네.
			}
		}

		System.out.println(max);
		System.out.println(maxIndex);

		sc.close();
	}

}
