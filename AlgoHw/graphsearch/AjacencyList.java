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
		// 정점 수 (n)
		// 간선 수 (e), 정점 수 n인 무향 그래프 생성.
		
		String[] nums = bf.readLine().split(" ");
		int n = Integer.parseInt(nums[0]);
		int e = Integer.parseInt(nums[1]);

		// MyGraph 클래스로 정점 수 만큼 arr 객체 생성.
		MyGraph arr = new MyGraph(n);

		// 2) e개의 간선을 입력받아 그래프에 간선 삽입(각 간선은 정점 번호 2개를 공백으로 구분)
		for (int i = 0; i < e; i++) {
			String[] nums2 = bf.readLine().split(" ");
			int v1 = Integer.parseInt(nums2[0]);
			int v2 = Integer.parseInt(nums2[1]);
			arr.put(v1, v2);
		}
		// 3) 반복문을 이용하여 각 정점에 인접한 정점 번호들을 출력
		for (int i = 1; i <= n; i++) {
			bw.write(i + "에 인접한 정점 = ");
			bw.flush();
			arr.printGraph(i);
			bw.write("\n");
		}
	}
}

// 클래스 이름 수정 해야함.
    class MyGraph {
	// private 인스턴스 변수
	private int[][] array;
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

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
	public void printGraph(int v) throws IOException {
		for (int i = 1; i < array.length; i++) {
			if (array[v][i] == 1) {
				bw.write(String.valueOf(i) + " ");
			}
			bw.flush();
		}
	}
}