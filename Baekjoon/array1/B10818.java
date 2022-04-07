package array1;

import java.util.Scanner;

//1차원 배열/ 최소, 최대
public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 정수의 개수 c
		int c = sc.nextInt();

		// arr이라는 배열은 입력받은 정수의 개수 크기 만큼 int형 배열을 생성
		int arr[] = new int[c];

		// c의 수만큼 정수 입력을 받고 그 정수를 배열에 차례대로 대입
		for (int i = 0; i < c; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		// 최대값 구하기, 맨 처음 인덱스를 max로 지정
		int max = arr[0];
		// 반복문을 통해서 더 큰 값을 max에 대입후 끝
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		// vice versa
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println(min + " " + max);

		sc.close();
	}

}
