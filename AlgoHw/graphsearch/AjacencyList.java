package graphsearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class AjacencyList {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// ���� �� (n)
		// ���� �� (e), ���� �� n�� ���� �׷��� ����.
		
		String[] nums = bf.readLine().split(" ");
		int n = Integer.parseInt(nums[0]);
		int e = Integer.parseInt(nums[1]);

		// MyGraph Ŭ������ ���� �� ��ŭ arr ��ü ����.
		MyGraph arr = new MyGraph(n);

		// 2) e���� ������ �Է¹޾� �׷����� ���� ����(�� ������ ���� ��ȣ 2���� �������� ����)
		for (int i = 0; i < e; i++) {
			String[] nums2 = bf.readLine().split(" ");
			int v1 = Integer.parseInt(nums2[0]);
			int v2 = Integer.parseInt(nums2[1]);
			arr.put(v1, v2);
		}
		// 3) �ݺ����� �̿��Ͽ� �� ������ ������ ���� ��ȣ���� ���
		for (int i = 1; i <= n; i++) {
			bw.write(i + "�� ������ ���� = ");
			bw.flush();
			arr.printGraph(i);
			bw.write("\n");
		}
	}
}

// Ŭ���� �̸� ���� �ؾ���.
    class MyGraph {
	// private �ν��Ͻ� ����
	private int[][] array;
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	// public �޼ҵ��:
	// ������- ���� �� n�� �Ű������� �޾� �׷��� ����
	public MyGraph(int n) {
		this.array = new int[n + 1][n + 1]; // ������ ��� ��������� ��� ���� 1�� ���ؼ� �ʱ�ȭ.
	}

	// ���� ����- ���� ��ȣ v1, v2�� �Ű������� �޾� ���� ����(v1, v2) ����
	// �����
	public void put(int v1, int v2) {
		array[v1][v2] = array[v2][v1] = 1;
	}

	// ���� ���� ��ȣ ��� - ���� ��ȣ v�� �Ű������� �޾� v�� ������ ���� ��ȣ�� ������������ ���
	public void printGraph(int v) throws IOException {
		for (int i = 1; i < array.length; i++) {
			if (array[v][i] == 1) {
				bw.write(String.valueOf(i) + " ");
			}
			bw.flush();
		}
	}
}