package array1;

import java.util.Scanner;

// 1차원 배열 / 숫자의 개수
public class B2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3개의 숫자 입력받고
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int sum = a * b * c;
		// sum을 문자형으로 변환
		String sum1 = Integer.toString(sum);

		int[] arr = new int[sum1.length()];

		for (int i = 0; i < sum1.length(); i++) {
			arr[i] = sum1.charAt(i) - '0'; // charAt는 char형이므로 정수형으로 계산하기 위해
											// 아스키코드 48에 있는 '0'을 빼준다.
		}

		int[] count = new int[10];
		// 0이면 count[0] ++, 1이면 count[1]++, ... 9면 count[9]++
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		for (int i = 0; i < 10; i++)
			System.out.println(count[i]);

		sc.close();
	}

}
