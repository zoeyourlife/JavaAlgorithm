package array1;

import java.util.Scanner;

// 1차원 배열 / OX 퀴즈
public class B8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 테스트의 개수 N개 입력
		String N = sc.nextLine();
		int num = Integer.parseInt(N);

//nextInt로하면 숫자를 입력받고 개행\n이 남아있다. 이대로
// nextLine을 하면 그 공백을 읽고, 입력할 숫자가 하나 부족해진다.
// 그러므로 nextLine으로 받고, int형으로 변환시키는 작업을 하자.

		String[] test = new String[num]; // ox값 입력받을 배열
		int[] result = new int[num]; // 점수 받는 배열

		for (int i = 0; i < num; i++) {
			test[i] = sc.nextLine();
			String[] str = test[i].split("");
			int count = 0;
			int sum = 0;

			for (int j = 0; j < str.length; j++) {
				if (str[j].equals("O")) {
					sum += ++count;
				} else {
					count = 0;
				}
			}
			result[i] = sum;
		}
		for (int i = 0; i < num; i++) {
			System.out.println(result[i]);
		}

		sc.close();
	}

}
