package lab10_1;

// undirected graph를 구현하는 클래스
// 인접 행렬, 인접 리스트, 인접 배열 등 원하는 방식으로 구현
public class MyGraph {
	// private 인스턴스 변수
	private int[][] array;

	// public 메소드들:
	// 생성자- 정점 수 n을 매개변수로 받아 그래프 생성
	public MyGraph(int n) {
		this.array = new int[n + 1][n + 1]; // 정점을 담는 인접행렬의 행과 열은 1을 더해서 초기화.
	}

	// 간선 삽입- 정점 번호 v1, v2를 매개변수로 받아 무향 간선(v1, v2) 삽입
	// 양방향
	public void put(int v1, int v2) {
		array[v1][v2] = array[v2][v1] = 1;
	}

	// 인접 정점 번호 출력 - 정점 번호 v를 매개변수로 받아 v에 인접한 정점 번호를 오름차순으로 출력
	public void printGraph(int v) {
		for (int i = 1; i < array.length; i++) {
			if (array[v][i] == 1) {
				System.out.print(i + " ");
			}
		}
	}
}