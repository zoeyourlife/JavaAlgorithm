package array1;

import java.util.Scanner;

//1���� �迭/ �ּ�, �ִ�
public class B10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ������ ���� c
		int c = sc.nextInt();

		// arr�̶�� �迭�� �Է¹��� ������ ���� ũ�� ��ŭ int�� �迭�� ����
		int arr[] = new int[c];

		// c�� ����ŭ ���� �Է��� �ް� �� ������ �迭�� ���ʴ�� ����
		for (int i = 0; i < c; i++) {
			int a = sc.nextInt();
			arr[i] = a;
		}
		// �ִ밪 ���ϱ�, �� ó�� �ε����� max�� ����
		int max = arr[0];
		// �ݺ����� ���ؼ� �� ū ���� max�� ������ ��
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
