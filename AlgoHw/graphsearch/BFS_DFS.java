package dynamicPrograming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.io.*;

/*
��ó: https://www.acmicpc.net/problem/1260
����: DFS�� BFS, B1260����, �������α׷��� 
������� ������� �ذ�
*/
public class B1260 {
	static int arr[][];
	static boolean visited[];
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		// ������ ����:N, ������ ����:M, Ž�� ���� ���� ��ȣ:V
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		arr = new int[N + 1][N + 1];
		visited = new boolean[N + 1];

		for (int i = 0; i < M; i++) {
			// ���� a, b M����ŭ �Է¹ް� ����.
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}

		DFS(V);
		System.out.println();

		for (int i = 1; i <= N; i++) {
			visited[i] = false;
		}
		
		BFS(V);
	}

	public static void DFS(int V) {
		visited[V] = true;
		System.out.print(V + " ");
		for (int i = 1; i <= N; i++) {
			if (arr[V][i] == 1 & visited[i] == false) {
				DFS(i);
			}
		}
	}

	public static void BFS(int V) {
		Queue<Integer> que = new LinkedList<>();
		que.add(V);
		visited[V] = true;

		while (!que.isEmpty()) {
			V = que.poll();
			System.out.print(V + " ");
			for (int i = 1; i <= N; i++) {
				if (arr[V][i] == 1 & visited[i] == false) {
					que.add(i);
					visited[i] = true;
				}
			}
		}
	}
}
