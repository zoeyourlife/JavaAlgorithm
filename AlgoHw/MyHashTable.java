package hw7_1;
//정수형 key값을 저장하는 해시 테이블 클래스

//해시함수는 곱하기 방법(A=0.6180339887), 충돌해결은 체이닝을 이용

public class MyHashTable { // 연결리스트 노드 구조
	private class Node {
		int key;
		Node link;
	}

	private Node[] table; // 테이블에 노드를 넣음으로써 collision이 발생할 시 뒤에 이어나간다.
	private int m; // 테이블 크기
	private int n; // 원소 수
	private static final double A = 0.6180339887; // 곱하기 방법에서 사용할 상수

	// (1) 테이블 크기를 매개변수로 받아 공백 해시테이블을 생성
	public MyHashTable(int m) {
		this.m = m;
		table = new Node[m];
		n = 0;
		// (table, m, n을 적절히 초기화할 것)
	}

	// (2) 해시 함수 - 곱하기 방법을 이용하여 key의 해시값을 계산 : O(1)
	private int hash(int key) {
		return (int) (((key * A) % 1) * m);
		// (key를 이용하여 해시값, 즉 해시테이블 인덱스를 계산하여 리턴하도록 할 것)
	}

	// (3) 테이블에 key를 삽입 - key 중복 여부는 검사하지 않아도 됨: 평균 O(1)
	// 해시함수를 이용해서 해시값을 구하고, 테이블 인덱스당 노드를 만들어야 된다? .
	public void add(int key) {
		int index = hash(key); // 해시값 구해서
		if (table[index] == null) { // table[index]가 비어 있다면
			table[index] = new Node();
			table[index].key = key; // table[index] 노드를 생성해서, 넣어줄 key 삽입.

		} else {// 비어있지 않다면
			Node t1 = new Node(); // t1이라는 노드변수 하나를 생성해서
			t1.key = table[index].key; // 거기에 기존의 table[index]의 키값을 삽입해놓고
			t1.link = table[index]; // table[index]를 연결시켜놓는다.
			table[index] = new Node(); // 새로운 table[index] 노드를 만들어서
			table[index].key = key; // 거기에 새로운 넣어줄 key값을 삽입하고
			table[index].link = t1.link; // 그 노드의 링크를 테이블의 링크로 연결해준다.
		}

		n++;
	}
	// key의 해시값을 구하여 그 위치의 연결리스트 맨 앞에 key값을 저장한 노드 삽입)
	
	// (4) 적재율을 계산하여 리턴 : O(1)
	public double getLoadFactor() {
		return (double) n / m;
		// 테이블 크기와 현재 원소 수를 이용하여 적재율 계산
	}

	// (5) 테이블에서 key를 검색하여 존재하면 true 리턴: 평균 O(1)
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
		// key의 해시값을 구하여 그 위치의 연결리스트 맨 앞에 key값을 저장한 노드 삽입
	}

	// 과제 수행시 키 값이 올바른 위치에 삽입되었는지 확인하기 위한 메소드
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
