package greedyAlgo;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

// ��ó: https://www.acmicpc.net/problem/1931
// ����: ȸ�ǽ� ����, 1931��, �׸��� �˰���
// �Է�: ȸ���� ��, ��° �ٺ��� N+1 �ٱ��� �� ȸ���� ����(����)���̿� ȸ�� ���۽ð� ������ �ð�.
// ���: ù°�ٿ� �ִ� ����� �� �ִ� ȸ���� �ִ� ������ ���

public class B1931 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] meeting = new int[N][2];

		for (int i = 0; i < N; i++) {
			meeting[i][0] = sc.nextInt(); // ���� �ð�
			meeting[i][1] = sc.nextInt(); // ���� �ð�
		}
		// [0][0] [0][1] ù��° ���۽ð�, ����ð�
		// ...
		// [N-1][0] [N-1][1] ������ �Է� ȸ�� ���۽ð�, ����ð�

		// Array.sort()�� �迭�� �Ķ����ͷ� �޴� ���� �ƴ϶� Comparator ���� �Ķ���ͷ� �޴°� ����
		// Comparator�� ��ü ������ ���ÿ� ��ü�迭 meeting�� ����
		// �͸��Լ� �κ����� �ٷ� �Լ� ����
		Arrays.sort(meeting, new Comparator<int[]>() {

			@Override
			public int compare(int[] t1, int[] t2) {

				if (t1[1] == t2[1]) {
					return t1[0] - t2[0];
					// ���� ������ �ð��� ���ٸ�, �����ϴ� �ð��� �������� ������ ���ش�.
				}

				return t1[1] - t2[1];
			}
			// ��ü�� ���� �� ���࿡�� ������ �� ���� ������� ��ġ�� �ٲ��� �ʰ�
			// ������ �ƴ϶� ����� ������ ��ġ�� �ٲ㼭 �������� ������ ���ش�.
		});

		int count = 0;
		int endTime = 0;

		for (int i = 0; i < N; i++) {

			if (endTime <= meeting[i][0]) {
				endTime = meeting[i][1];
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}
}
