package hw7_1;
//������ key���� �����ϴ� �ؽ� ���̺� Ŭ����

//�ؽ��Լ��� ���ϱ� ���(A=0.6180339887), �浹�ذ��� ü�̴��� �̿�

public class MyHashTable { // ���Ḯ��Ʈ ��� ����
	private class Node {
		int key;
		Node link;
	}

	private Node[] table; // ���̺� ��带 �������ν� collision�� �߻��� �� �ڿ� �̾����.
	private int m; // ���̺� ũ��
	private int n; // ���� ��
	private static final double A = 0.6180339887; // ���ϱ� ������� ����� ���

	// (1) ���̺� ũ�⸦ �Ű������� �޾� ���� �ؽ����̺��� ����
	public MyHashTable(int m) {
		this.m = m;
		table = new Node[m];
		n = 0;
		// (table, m, n�� ������ �ʱ�ȭ�� ��)
	}

	// (2) �ؽ� �Լ� - ���ϱ� ����� �̿��Ͽ� key�� �ؽð��� ��� : O(1)
	private int hash(int key) {
		return (int) (((key * A) % 1) * m);
		// (key�� �̿��Ͽ� �ؽð�, �� �ؽ����̺� �ε����� ����Ͽ� �����ϵ��� �� ��)
	}

	// (3) ���̺� key�� ���� - key �ߺ� ���δ� �˻����� �ʾƵ� ��: ��� O(1)
	// �ؽ��Լ��� �̿��ؼ� �ؽð��� ���ϰ�, ���̺� �ε����� ��带 ������ �ȴ�? .
	public void add(int key) {
		int index = hash(key); // �ؽð� ���ؼ�
		if (table[index] == null) { // table[index]�� ��� �ִٸ�
			table[index] = new Node();
			table[index].key = key; // table[index] ��带 �����ؼ�, �־��� key ����.

		} else {// ������� �ʴٸ�
			Node t1 = new Node(); // t1�̶�� ��庯�� �ϳ��� �����ؼ�
			t1.key = table[index].key; // �ű⿡ ������ table[index]�� Ű���� �����س���
			t1.link = table[index]; // table[index]�� ������ѳ��´�.
			table[index] = new Node(); // ���ο� table[index] ��带 ����
			table[index].key = key; // �ű⿡ ���ο� �־��� key���� �����ϰ�
			table[index].link = t1.link; // �� ����� ��ũ�� ���̺��� ��ũ�� �������ش�.
		}

		n++;
	}
	// key�� �ؽð��� ���Ͽ� �� ��ġ�� ���Ḯ��Ʈ �� �տ� key���� ������ ��� ����)
	
	// (4) �������� ����Ͽ� ���� : O(1)
	public double getLoadFactor() {
		return (double) n / m;
		// ���̺� ũ��� ���� ���� ���� �̿��Ͽ� ������ ���
	}

	// (5) ���̺��� key�� �˻��Ͽ� �����ϸ� true ����: ��� O(1)
	public boolean contains(int key) {
		int index = hash(key);
		Node temp = table[index];

		while (temp != null) {
			if (key == temp.key) {
				return true;
			} else
				temp = temp.link;
		}
		return false;
		// key�� �ؽð��� ���Ͽ� �� ��ġ�� ���Ḯ��Ʈ �� �տ� key���� ������ ��� ����
	}

	// ���� ����� Ű ���� �ùٸ� ��ġ�� ���ԵǾ����� Ȯ���ϱ� ���� �޼ҵ�
	public void printTable() {
		for (int i = 0; i < table.length; i++) {
			System.out.print("table[" + i + "] = ");
			Node temp = table[i];
			while (temp != null) {
				System.out.print(temp.key + " ");
				temp = temp.link;
			}
			System.out.println();
		}
	}

}
