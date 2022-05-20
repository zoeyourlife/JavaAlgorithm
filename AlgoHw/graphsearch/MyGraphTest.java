package lab10_1;

import java.util.Scanner;

public class MyGraphTest {

	public static void main(String[] args) {
		System.out.println("lab10_1: 최재훈");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 정점 수 (n)
		int e = sc.nextInt(); // 간선 수 (e), 정점 수 n인 무향 그래프 생성.

		// MyGraph 클래스로 정점 수 만큼 arr 객체 생성.
		MyGraph arr = new MyGraph(n);

		// 2) e개의 간선을 입력받아 그래프에 간선 삽입(각 간선은 정점 번호 2개를 공백으로 구분)
		for (int i = 0; i < e; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			arr.put(v1, v2);
		}
		// 3) 반복문을 이용하여 각 정점에 인접한 정점 번호들을 출력
		for (int i = 1; i <= n; i++) {
			System.out.print(i + "에 인접한 정점 = ");
			arr.printGraph(i);
			System.out.println();
		}

		sc.close();
	}

}