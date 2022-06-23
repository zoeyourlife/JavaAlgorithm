package string;
// ��ó: https://www.acmicpc.net/problem/1316

// ����: B1316: �׷� �ܾ� üĿ
// ���ڿ� �׷� �ܾ� ���� Ȯ�� ex) aba x aaaaa, b  <O>

import java.util.Scanner;

public class B1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // �ܾ� ���� �Է�
		int cnt = 0; // �׷� �ܾ� ����

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			boolean check[] = new boolean[26];
			boolean tmp = true; //�׷� �ܾ� ���� �ƴ���

			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j) - 'a'; 
				if (check[index]) { //������ ��� ����?
					if (str.charAt(j) != str.charAt(j - 1)) {
						tmp = false; //�׷� �ܾ �ƴ�
						break;
					}
				} else {
					check[index] = true;
				}
			}
			if(tmp)
				cnt++;
		}

		System.out.print(cnt);
		sc.close();
	}

}
