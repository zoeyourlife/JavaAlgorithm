package hw5_1;

import java.util.Scanner;

public class BirthDate {

	public static void main(String[] args) {
		System.out.println("hw5_1: ������");

		Scanner sc = new Scanner(System.in);

		int firstNumber;
		int lastNumber;

		System.out.print("�ֹε�Ϲ�ȣ ���ڸ� �Է�: ");
		firstNumber = sc.nextInt();

		System.out.print("�ֹε�Ϲ�ȣ ���ڸ� �Է�: ");
		lastNumber = sc.nextInt();

		System.out.println("��������� ������ �����ϴ�.");
		int birth = (lastNumber >= 3000000) ? 20 : 19;
		String year = (firstNumber / 10000 < 10) ? "0" + firstNumber / 10000 : "" + firstNumber / 10000;

		System.out.println("" + birth + year);
		System.out.println(firstNumber % 10000 / 100);
		System.out.println(firstNumber % 100);
		
		sc.close();

	}

}
//***************
//���ϸ�: BirthDate.java
//�ۼ���: ������
//�ۼ���: 2022-03-23
//����: �ֹε�Ϲ�ȣ�� ������� ����ϱ�
//***************