package lab10_1;

import java.util.Scanner;

public class MyGraphTest {

	public static void main(String[] args) {
		System.out.println("lab10_1: ������");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ���� �� (n)
		int e = sc.nextInt(); // ���� �� (e), ���� �� n�� ���� �׷��� ����.

		// MyGraph Ŭ������ ���� �� ��ŭ arr ��ü ����.
		MyGraph arr = new MyGraph(n);

		// 2) e���� ������ �Է¹޾� �׷����� ���� ����(�� ������ ���� ��ȣ 2���� �������� ����)
		for (int i = 0; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			arr.put(v1, v2);
		}
		// 3) �ݺ����� �̿��Ͽ� �� ������ ������ ���� ��ȣ���� ���
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "�� ������ ���� = ");
			arr.printGraph(i);
			System.out.println();
		}

		sc.close();
	}

}