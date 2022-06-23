package string;
// 출처: https://www.acmicpc.net/problem/1316

// 문제: B1316: 그룹 단어 체커
// 문자열 그룹 단어 개수 확인 ex) aba x aaaaa, b  <O>

import java.util.Scanner;

public class B1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 단어 개수 입력
		int cnt = 0; // 그룹 단어 개수

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			boolean check[] = new boolean[26];
			boolean tmp = true; //그룹 단어 인지 아닌지

			for (int j = 0; j < str.length(); j++) {
				int index = str.charAt(j) - 'a'; 
				if (check[index]) { //이전에 사용 한적?
					if (str.charAt(j) != str.charAt(j - 1)) {
						tmp = false; //그룹 단어가 아님
						break;
					}
				} else {
					check[index] = true;
				}
			}
			if(tmp)
				cnt++;
		}

		System.out.print(cnt);
		sc.close();
	}

}
