package lab1_1;

import java.util.Scanner;

public class AlgorithmWork {

	public static void main(String[] args) {
		System.out.println("lab1_1 : ������");
		
		//���� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է�: ");
		int n = sc.nextInt();
		
        // iterativePrint(n) ȣ��
		System.out.print("�ݺ� ��� = ");
		iterativePrint(n);
		// recursivePrint(n) ȣ��
		System.out.print("\n��� ��� = ");
		recursivePrint(n);

		sc.close();

	}
	
    // �ݺ����� �̿��Ͽ� n�� �Ű������� �޾� 1���� n���� ������ ���
	public static void iterativePrint(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
    // ��� ȣ�� �̿��Ͽ� n�� �Ű������� 1���� n���� �������� ���
	public static void recursivePrint(int n) {
		if (n > 0) {
			recursivePrint(n - 1);
			System.out.print(n + " ");
		}

	}

}
