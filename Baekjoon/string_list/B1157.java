package string;
//출처: https://www.acmicpc.net/problem/1157

//B1157, 문자열 ,단어공부
//알파벳 대소문자로 된 단어가 주어지면, 
//이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
//단, 대문자와 소문자를 구분하지 않는다.

import java.util.Scanner;

public class B1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		str = str.toUpperCase();

		int[] abcArr = new int[26]; // a~z까지 알파벳 개수

		for (int i = 0; i < str.length(); i++) {
			abcArr[str.charAt(i) - 65]++; // 대문자인 범위 65를 빼주면 값이 나옴
		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < 26; i++) {
			if (abcArr[i] > max) {
				max = abcArr[i];
				ch = (char) (i + 65); // 대문자 출력<<
			} else if (abcArr[i] == max) {
				ch = '?';
			}
		}
		System.out.print(ch);

		sc.close();
	}

}
