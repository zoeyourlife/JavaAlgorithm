package sort;

import java.util.Scanner;

// ����, �� �����ϱ�
public class B2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count, num;
		count = sc.nextInt(); // N���� ���� �Է¹ް�

		int[] intList = new int[count]; // �� ����ŭ ��������Ʈ�� �迭�� ������ش�

		for (int i = 0; i < count; i++) { // N��ŭ ���ڸ� �Է¹޾Ƽ� ����Ʈ�� �־��ְ�
			num = sc.nextInt();
			intList[i] = num;
		}

		int temp; // ���� �ϳ� ����
		for (int i = 0; i < count; i++) { // �� N��ŭ �ݺ��� �����鼭
			for (int j = i + 1; j < count; j++) { // i for�� �ѹ� ���������� ���� ū���� ���� ���ٳ��´� : ��������
				if (intList[i] > intList[j]) {
					temp = intList[i];
					intList[i] = intList[j];
					intList[j] = temp;
				}
			}
		}

		for (int number : intList) { // �� �� ���ĵ� ��������Ʈ�� sysout.
			System.out.println(number);
		}
		sc.close();
	}

}
