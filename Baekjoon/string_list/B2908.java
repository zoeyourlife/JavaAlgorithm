package string;
//출처: https://www.acmicpc.net/problem/2908

//문제: B2908, 문자열 상수(숫자를 뒤집어서 비교하는 문제)

import java.util.Scanner;

//StringBuilder를 이용한 방법
public class B2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		a = Integer.parseInt(new StringBuilder().append(a).reverse().toString());
		b = Integer.parseInt(new StringBuilder().append(b).reverse().toString());
		// StringBuilder 객체 생성후 append()로 a, b를 각각 호출하고 출력시에는 toString 붙여야함
		// 하지만 각각 수를 비교하기 위해 Integer.parseInt()로 정수형으로 변환한 값을 넣어줌
		
		System.out.print(a > b ? a : b);
	}

}
