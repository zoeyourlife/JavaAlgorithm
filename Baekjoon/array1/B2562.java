package array1;

import java.util.Scanner;

// 1���� �迭 - �ִ� 
public class B2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ũ�Ⱑ 9, ������ 9���� �迭 ����
		int arr[] = new int[9];
		// 9���� �ڿ��� a�� �迭 i�� ����
		for (int i = 0; i < 9; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int maxIndex = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) { // ù���� ������ �� �ְ� �̻����� �� .
				max = arr[i];
				maxIndex = i + 1; // �ݷ����� ù���� ����ũ�� if���� �ȵ��ϱ�?
									// maxIndex�� �״�� 0�� ��µǹ�����.
			}
		}

		System.out.println(max);
		System.out.println(maxIndex);

		sc.close();
	}

}
