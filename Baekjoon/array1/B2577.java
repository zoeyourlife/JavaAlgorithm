package array1;

import java.util.Scanner;

// 1���� �迭 / ������ ����
public class B2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 3���� ���� �Է¹ް�
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int sum = a * b * c;
		// sum�� ���������� ��ȯ
		String sum1 = Integer.toString(sum);

		int[] arr = new int[sum1.length()];

		for (int i = 0; i < sum1.length(); i++) {
			arr[i] = sum1.charAt(i) - '0'; // charAt�� char���̹Ƿ� ���������� ����ϱ� ����
											// �ƽ�Ű�ڵ� 48�� �ִ� '0'�� ���ش�.
		}

		int[] count = new int[10];
		// 0�̸� count[0] ++, 1�̸� count[1]++, ... 9�� count[9]++
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}

		for (int i = 0; i < 10; i++)
			System.out.println(count[i]);

		sc.close();
	}

}
