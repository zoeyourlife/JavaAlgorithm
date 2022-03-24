package baekjoon;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// 입력 스캐너, 문자열 입력받기
		Scanner sc = new Scanner(System.in);
		String str;
		str = sc.nextLine();
		// 문자열의 역순 생각
		int j;
		j = str.length();
		String result = "";
		// i가 문자 끝에서부터 첫 스펠링까지 char형으로 하나씩 쌓아줌
		for (int i = j - 1; i >= 0; i--) {
			result += str.charAt(i);
		} // 문자열끼리 같은지 찾는 것이므로 equals로 str과 result가 같은지 비교해서 같으면 '1'
		if (str.equals(result)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		sc.close();

	}

}
