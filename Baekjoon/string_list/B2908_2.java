package string;
//출처: https://www.acmicpc.net/problem/2908
//문제: B2908, 문자열 상수(숫자를 뒤집어서 비교하는 문제)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//BufferedReader 사용
public class B2908_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//입력은 공백을 기준으로 두 수 A B가 주어진다.
		
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		// StringBuilder 객체를 생성하고, 각각의 토큰을 역순으로한 문자열을 StringBuilder객체를 통해 호출
		// 후에 두 수를 비교하기 위해 a, b 정수형으로 반환한 값을 넣어줌
		
		System.out.print(a>b?a:b);
	}

}
