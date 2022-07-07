package math1;
// 출처 : https://www.acmicpc.net/problem/10250

// 문제 : 기본 수학, 10250번, ACM 호텔
// 방법 : Scanner 입력

import java.util.Scanner;

public class B10250 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i = 0 ; i < t; i ++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(c % a  == 0) {
				System.out.println((a*100)+(c/a));
			}
			
			else {
				System.out.println(((c%a)*100)+((c/a)+1));
			}
		}
		sc.close();
	}

}
