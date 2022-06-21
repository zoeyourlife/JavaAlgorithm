package string;
//��ó: https://www.acmicpc.net/problem/1157

//B1157, ���ڿ� ,�ܾ����
//���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, 
//�� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�.
//��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		str = str.toUpperCase();

		int[] abcArr = new int[26]; // a~z���� ���ĺ� ����

		for (int i = 0; i < str.length(); i++) {
			abcArr[str.charAt(i) - 65]++; // �빮���� ���� 65�� ���ָ� ���� ����
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (abcArr[i] > max) {
				max = abcArr[i];
				ch = (char) (i + 65); // �빮�� ���<<
			} else if (abcArr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);

		sc.close();
	}

}
