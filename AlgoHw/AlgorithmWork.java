package lab1_1;

import java.util.Scanner;

public class AlgorithmWork {

	public static void main(String[] args) {
		System.out.println("lab1_1 : 최재훈");
		
		//정수 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 입력: ");
		int n = sc.nextInt();
		
        // iterativePrint(n) 호출
		System.out.print("반복 출력 = ");
		iterativePrint(n);
		// recursivePrint(n) 호출
		System.out.print("\n재귀 출력 = ");
		recursivePrint(n);

		sc.close();

	}
	
    // 반복문을 이용하여 n을 매개변수로 받아 1부터 n까지 정수값 출력
	public static void iterativePrint(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
    // 재귀 호출 이용하여 n을 매개변수로 1부터 n까지 정수값을 출력
	public static void recursivePrint(int n) {
		if (n > 0) {
			recursivePrint(n - 1);
			System.out.print(n + " ");
		}

	}

}
