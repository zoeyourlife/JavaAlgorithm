package sort;

import java.util.Scanner;

// 정렬, 수 정렬하기
public class B2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count, num;
		count = sc.nextInt(); // N개의 수를 입력받고

		int[] intList = new int[count]; // 그 수만큼 정수리스트를 배열을 만들어준다

		for (int i = 0; i < count; i++) { // N만큼 숫자를 입력받아서 리스트에 넣어주고
			num = sc.nextInt();
			intList[i] = num;
		}

		int temp; // 변수 하나 선언
		for (int i = 0; i < count; i++) { // 그 N만큼 반복문 돌리면서
			for (int j = i + 1; j < count; j++) { // i for문 한번 돌릴때마다 가장 큰수를 끝에 갖다놓는다 : 선택정렬
				if (intList[i] > intList[j]) {
					temp = intList[i];
					intList[i] = intList[j];
					intList[j] = temp;
				}
			}
		}

		for (int number : intList) { // 그 후 정렬된 정수리스트를 sysout.
			System.out.println(number);
		}
		sc.close();
	}

}
