package numbercombine;
// 출처 : https://www.acmicpc.net/problem/5086
// 문제 : 정수론과 조합론/ 5086번: 배수와 약수
// 방법 : Scanner + StringBUilder

import java.util.Scanner;

public class B5086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String f = "factor\n";
		String m = "multiple\n";
		String n = "neither\n";
		
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int first = sc.nextInt();
			int second = sc.nextInt();
			
			if(first == 0 && second ==0) break;
			
			if(second % first == 0 ) {
				sb.append(f);
			}
			else if(first % second == 0) {
				sb.append(m);
			}
			else {
				sb.append(n);
			}
		}
		
		System.out.println(sb);
		sc.close();
		
	}

}
