package hw6_1;

import java.util.Scanner;

public class MonSea {

	public static void main(String[] args) {
		System.out.println("hw6_1: ������");

		Scanner sc = new Scanner(System.in);
		int month;
		// �� �Է� �ޱ�, ���� �߸� �Է����� ��� �ٽ� �Է¹ޱ�.
		while (true) {
			System.out.println("���� �Է��ϼ���: ");
			month = sc.nextInt();
			if (month > 0 && month <= 12) {
				break; //���� ���ǿ� �����ϸ� ���� Ż��
			}
		}
		// switch-case ���� ���, switch�� �Էº��� month�� ����
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("��"); // month�� 3,4,5�� ��� �� ���
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����"); // month�� 6,7,8�� ��� ���� ���
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����"); // month�� 9,10,11�� ��� ���� ���
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�"); // month�� 12,1,2�� ��� �ܿ� ���
			break; // �ش� case���� �����ϰ� switch���� ���������� ���� ��.
		}

		sc.close();

	}

}
