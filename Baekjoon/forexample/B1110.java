package baekjoon.baekjoon_practice;

import java.util.Scanner;

//더하기 사이클
public class B1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1~99 정수 n 입력
		int a = sc.nextInt();

		int copy = a; // copy에 a 복사
		int n = 1;// 횟수 n 초기화
		int check = a / 10 + a % 10; // 다음 수 = 10으로나눈 몫+나머지
		if (check >= 10) // 만약 그 수가 10보다 크면
			check %= 10; // 그 수를 10으로 나눈 나머지를 구함

		a = (a % 10) * 10 + check; // 그 후 a에 a를 10으로 나눈 몫에 10을 곱하고 아까 구한 뒷 수를 더해줌.

		while (copy != a) { // 초기 값 copy가 a랑 같아지면 루프 탈출
			check = a / 10 + a % 10; // check에 다음 더한 수 대입
			if (check >= 10) // 그 check 값이 10보다 크면 10으로 나눈 나머지 값을 check에 대입
				check %= 10;

			a = (a % 10) * 10 + check; // a에 그 수를 반복해서 대입해준다
			n += 1; // 그때마다 횟수 1회 증가.
		}
		System.out.println(n); // 그 횟수를 출력
		// 만약 while문을 돌지 않으면 첫 턴만에(n=1)인 경우이므로 바로 1을 출력.

		sc.close();

	}

}
