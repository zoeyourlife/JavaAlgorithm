package lab10_1;

// undirected graph�� �����ϴ� Ŭ����
// ���� ���, ���� ����Ʈ, ���� �迭 �� ���ϴ� ������� ����
public class MyGraph {
	// private �ν��Ͻ� ����
	private int[][] array;

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
	public void printGraph(int v) {
		for (int i = 1; i < array.length; i++) {
			if (array[v][i] == 1) {
				System.out.print(i + " ");
			}
		}
	}
}