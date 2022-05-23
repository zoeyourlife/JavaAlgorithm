package graphsearch;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

/*
 출처: https://www.acmicpc.net/problem/1260
 문제: DFS와 BFS, B1260문제, 동적프로그래밍 
 인접행렬 방법으로 해결
 */

public class B1260 {
	
	static int arr[][]; //인접행렬
	static boolean visited[]; //방문기록
	static int N, M;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정점의 개수 N, 간선의 개수 M, 탐색 시작 정점 번호 V
		N = sc.nextInt();
		M = sc.nextInt();
		int V = sc.nextInt();
		
		visited = new boolean[N+1];
		arr = new int[N+1][N+1];
		
		// M개의 줄에는 간선이 연결하는 두 정점의 번호. 여러개의 간선, 양방향 간선.
		for(int i = 0; i<M; i++) {
			// 간선 v1, v2, M개만큼 입력받기.
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			arr[v1][v2] = arr[v2][v1] = 1; //인접행렬 DFS를 이용하기 위함
		}
		
		DFS(V);
		System.out.println();
		for(int i = 0; i<N+1; i++) { //bfs를 위해 방문기록을 지워줌
			visited[i] = false;
		}
		
		BFS(V);
		
		sc.close();
	}
	
	//DFS 구현. 재귀적 특성 이용.
	public static void DFS(int V) {
		visited[V] = true;
		System.out.print(V+" ");
		for(int i=1; i<=N; i++) {
			if(arr[V][i]==1 & visited[i] == false) {
				DFS(i);
			}
		}
	}
	
	//s를 시작 정점으로 하여 그래프 G=(V,E)를 너비우선 탐색(s에 연결된 정점만 방문), 큐를 이용.
	public static void BFS(int V) {
		//큐를 연결리스트로 구현.
		Queue<Integer> que = new LinkedList<>();
		
		que.add(V); // 큐
		visited[V] = true; //시작 정점
		
		//큐가 빌때까지
		while(!que.isEmpty()) {
			// 인접 정점을 큐에서 제거하고 출력
			V = que.poll();
			System.out.print(V+ " ");
			// 반복문을 통해서 정점V의 인접 정점 집합
			for(int i = 1; i<=N; i++) {
				if(arr[V][i] == 1 & visited[i] == false) {
					que.add(i); //큐를 삽입
					visited[i] = true; // 방문기록
				}
			}
		}
	}

}


