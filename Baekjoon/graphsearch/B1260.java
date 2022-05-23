package graphsearch;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

/*
 ��ó: https://www.acmicpc.net/problem/1260
 ����: DFS�� BFS, B1260����, �������α׷��� 
 ������� ������� �ذ�
 */

public class B1260 {
	
	static int arr[][]; //�������
	static boolean visited[]; //�湮���
	static int N, M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ������ ���� N, ������ ���� M, Ž�� ���� ���� ��ȣ V
		N = sc.nextInt();
		M = sc.nextInt();
		int V = sc.nextInt();
		
		visited = new boolean[N+1];
		arr = new int[N+1][N+1];
		
		// M���� �ٿ��� ������ �����ϴ� �� ������ ��ȣ. �������� ����, ����� ����.
		for(int i = 0; i<M; i++) {
			// ���� v1, v2, M����ŭ �Է¹ޱ�.
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			arr[v1][v2] = arr[v2][v1] = 1; //������� DFS�� �̿��ϱ� ����
		}
		
		DFS(V);
		System.out.println();
		for(int i = 0; i<N+1; i++) { //bfs�� ���� �湮����� ������
			visited[i] = false;
		}
		
		BFS(V);
		
		sc.close();
	}
	
	//DFS ����. ����� Ư�� �̿�.
	public static void DFS(int V) {
		visited[V] = true;
		System.out.print(V+" ");
		for(int i=1; i<=N; i++) {
			if(arr[V][i]==1 & visited[i] == false) {
				DFS(i);
			}
		}
	}
	
	//s�� ���� �������� �Ͽ� �׷��� G=(V,E)�� �ʺ�켱 Ž��(s�� ����� ������ �湮), ť�� �̿�.
	public static void BFS(int V) {
		//ť�� ���Ḯ��Ʈ�� ����.
		Queue<Integer> que = new LinkedList<>();
		
		que.add(V); // ť
		visited[V] = true; //���� ����
		
		//ť�� ��������
		while(!que.isEmpty()) {
			// ���� ������ ť���� �����ϰ� ���
			V = que.poll();
			System.out.print(V+ " ");
			// �ݺ����� ���ؼ� ����V�� ���� ���� ����
			for(int i = 1; i<=N; i++) {
				if(arr[V][i] == 1 & visited[i] == false) {
					que.add(i); //ť�� ����
					visited[i] = true; // �湮���
				}
			}
		}
	}

}


