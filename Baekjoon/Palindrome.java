package baekjoon;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// �Է� ��ĳ��, ���ڿ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		// ���ڿ��� ���� ����
		int j;
		j = str.length();
		String result = "";
		// i�� ���� ���������� ù ���縵���� char������ �ϳ��� �׾���
		for (int i = j - 1; i >= 0; i--) {
			result += str.charAt(i);
		} // ���ڿ����� ������ ã�� ���̹Ƿ� equals�� str�� result�� ������ ���ؼ� ������ '1'
		if (str.equals(result)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		sc.close();

	}

}
