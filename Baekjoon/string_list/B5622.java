package string;
// 출처: https://www.acmicpc.net/problem/5622

// 문제: 문자열, 다이얼문제 전화걸기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		int count = 0;
		int t = s.length();

		for (int i = 0; i < t; i++) {
			switch (s.charAt(i)) {
			case 'A':
			case 'B':
			case 'C':
				count += 3;
				break;

			case 'D':
			case 'E':
			case 'F':
				count += 4;
				break;

			case 'G':
			case 'H':
			case 'I':
				count += 5;
				break;

			case 'J':
			case 'K':
			case 'L':
				count += 6;
				break;

			case 'M':
			case 'N':
			case 'O':
				count += 7;
				break;

			case 'P':
			case 'Q':
			case 'R':
			case 'S':
				count += 8;
				break;

			case 'T':
			case 'U':
			case 'V':
				count += 9;
				break;

			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
				count += 10;
				break;
			}
		}
		System.out.print(count);
	}

}
/* if-else 문으로 풀면?
 * while(true) {
 * 	value = System.in.read();
 * 	if(value == '\n'){
 * 		break;
 * 	}
 * 	if(value < 68) count += 3;
 *	else if(value < 71) count += 4;
 *	....
 *	else count+= 10;
 * 	이런 식으로 알파벳의 int값의 범위로 설정도 가능
 */
