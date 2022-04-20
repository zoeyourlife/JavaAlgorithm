package hw1_1;

import java.util.Scanner;

public class IndexSum {

	public static void main(String[] args) {
		System.out.println("hw1_1 : ������");
		// �迭 array �ʱ�ȭ
		int[] array = { -10, -20, 30, 40, 50, 60, 70, 80, 90, 100, 10, 20 };
		// Scanner
		Scanner sc = new Scanner(System.in);
		// ���� �Է� �ް� lb�� �ֱ�
		System.out.print("���� �Է�(0~11) :");
		int lb = sc.nextInt();
		// lb�� ����
		if (lb < 0 || lb > 12) {
			System.out.print("�ٽ� �Է��ϼ���.");
		}
		// ���� �Է� �ް� ub�� �ֱ�
		System.out.print("���� �Է�(0~11) :");
		int ub = sc.nextInt();
		if (ub < 0 || ub > 12) {
			System.out.print("�ٽ� �Է��ϼ���.");
		}
		// �ݺ� �˰����� ���Ͽ� �迭 ���� array ���
		System.out.print("��� = ");
		iterativeArrayPrint(array, lb, ub);
		System.out.print("\n");
		// ����Լ��� �̿��� ���� ������ ���ϰ� ���
		System.out.print("�� = " + recursiveArrayPrint(array, lb, ub));

		sc.close();

	}

	// array, ib, ub�� �Ű������� �ް�, �ݺ����� ���ؼ� array�� ���ʴ�� ���
	public static void iterativeArrayPrint(int[] array, int lb, int ub) {
		for (int i = lb; i <= ub; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// �Ű������� �ް� lb�� ub�� ������ �� ���� ����Լ� ȣ���ؼ� ���� ���ϱ�
	public static int recursiveArrayPrint(int[] array, int lb, int ub) {
		if (lb <= ub) {
			recursiveArrayPrint(array, lb + 1, ub);
			return array[lb] + recursiveArrayPrint(array, lb + 1, ub);
		}
		// lb�� ub�� ������ ����Լ� ����
		else {
			return 0;
		}
	}

}
