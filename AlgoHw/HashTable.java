package hw7_1;
// ������ �ؽ� ���̺��� MyHashTable Ŭ������ �����ϰ� ����ϴ� ���α׷�

public class HashTable {

	public static void main(String[] args) {
		System.out.println("hw7_1: ������");
		
		// �Է� ���� �����ϱ� ���� �ؽ� ���̺� ������ key���� �迭�� ������ ���� ����
		int[] addArray = {1, 5, 7, 9, 2, 4, 6, 8, 10, 30, 40};
		int[] searchArray = {4, 6, 8, 10, 30, 40, 1, 5, 7, 9, 2, 111, 333};
		
		// ���̺� ũ�Ⱑ 8�� MyHashTable ��ü�� ����(hashTable) 0~7
		MyHashTable hashTable = new MyHashTable(8);
		
		// hashTable�� addArray�� key�� ��� ����
		for(int key: addArray) {
			hashTable.add(key);
		}
		
		// hashTable�� ����� ���ԵǾ����� Ȯ���ϱ� ���� ���� ���̺� ���¿� �������� ���
		hashTable.printTable();
		
		System.out.println("load factor = "+ hashTable.getLoadFactor());
		
		// hashTable���� searchArray�� �� key�� ��ȸ�Ͽ� ��� true/false�� ���
		for(int key: searchArray) {
			System.out.print(hashTable.contains(key)+" ");
		}
		

	}

}
