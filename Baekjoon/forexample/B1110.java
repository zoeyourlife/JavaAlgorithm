package baekjoon.baekjoon_practice;

import java.util.Scanner;

//���ϱ� ����Ŭ
public class B1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1~99 ���� n �Է�
		int a = sc.nextInt();

		int copy = a; // copy�� a ����
		int n = 1;// Ƚ�� n �ʱ�ȭ
		int check = a / 10 + a % 10; // ���� �� = 10���γ��� ��+������
		if (check >= 10) // ���� �� ���� 10���� ũ��
			check %= 10; // �� ���� 10���� ���� �������� ����

		a = (a % 10) * 10 + check; // �� �� a�� a�� 10���� ���� �� 10�� ���ϰ� �Ʊ� ���� �� ���� ������.

		while (copy != a) { // �ʱ� �� copy�� a�� �������� ���� Ż��
			check = a / 10 + a % 10; // check�� ���� ���� �� ����
			if (check >= 10) // �� check ���� 10���� ũ�� 10���� ���� ������ ���� check�� ����
				check %= 10;

			a = (a % 10) * 10 + check; // a�� �� ���� �ݺ��ؼ� �������ش�
			n += 1; // �׶����� Ƚ�� 1ȸ ����.
		}
		System.out.println(n); // �� Ƚ���� ���
		// ���� while���� ���� ������ ù �ϸ���(n=1)�� ����̹Ƿ� �ٷ� 1�� ���.

		sc.close();

	}

}
