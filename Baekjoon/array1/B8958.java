package array1;

import java.util.Scanner;

// 1���� �迭 / OX ����
public class B8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �׽�Ʈ�� ���� N�� �Է�
		String N = sc.nextLine();
		int num = Integer.parseInt(N);

//nextInt���ϸ� ���ڸ� �Է¹ް� ����\n�� �����ִ�. �̴��
// nextLine�� �ϸ� �� ������ �а�, �Է��� ���ڰ� �ϳ� ����������.
// �׷��Ƿ� nextLine���� �ް�, int������ ��ȯ��Ű�� �۾��� ����.

		String[] test = new String[num]; // ox�� �Է¹��� �迭
		int[] result = new int[num]; // ���� �޴� �迭

		for (int i = 0; i < num; i++) {
			test[i] = sc.nextLine();
			String[] str = test[i].split("");
			int count = 0;
			int sum = 0;

			for (int j = 0; j < str.length; j++) {
				if (str[j].equals("O")) {
					sum += ++count;
				} else {
					count = 0;
				}
			}
			result[i] = sum;
		}
		for (int i = 0; i < num; i++) {
			System.out.println(result[i]);
		}

		sc.close();
	}

}
