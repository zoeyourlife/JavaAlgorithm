package string;
//��ó: https://www.acmicpc.net/problem/2908

//����: B2908, ���ڿ� ���(���ڸ� ����� ���ϴ� ����)

import java.util.Scanner;

//StringBuilder�� �̿��� ���
public class B2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		// StringBuilder ��ü ������ append()�� a, b�� ���� ȣ���ϰ� ��½ÿ��� toString �ٿ�����
		// ������ ���� ���� ���ϱ� ���� Integer.parseInt()�� ���������� ��ȯ�� ���� �־���
		
		System.out.print(a > b ? a : b);
	}

}
