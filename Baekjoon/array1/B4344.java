package array1;

import java.util.Scanner;

// 1�����迭/ ����� �Ѱ���
public class B4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt(); // �׽�Ʈ�� ���� c

		for (int i = 0; i < c; i++) {
			int n = sc.nextInt(); // �л��� n �Է�
			int score[] = new int[n]; // �л� �� ��ŭ�� score ��ü �迭 ����
			int sum = 0; // �л����� �� ����
			double average = 0; // �л����� ��� ���� ������ �ʱ�ȭ

			for (int j = 0; j < n; j++) { // �л����� ���� �迭�� �Է¹ް� �հ� ����
				score[j] = sc.nextInt();
				sum += score[j];
			}

			average = (double) sum / n; // ��� ���� ��

			int count = 0;
			for (int j = 0; j < n; j++) { //�л� �� ��ŭ �迭 �����鼭 �迭�� ��պ��� ũ�� count ����
				if (average < score[j]) {
					count++;
				}
			}
			// count�� ����� �Ѵ� �л����� ���̰�, 100�� ���ϰ� �л����� ������ ������ ����.
			// String.format("%.xf",n)�� �Ҽ��� x+1��° �ڸ��� �ݿø��Ͽ� �Ҽ��� x��° �ڸ������� ǥ���ϴ� ��
			System.out.println(String.format("%.3f", (double) count * 100 / n) +"%");
		}
		sc.close();

	}

}
