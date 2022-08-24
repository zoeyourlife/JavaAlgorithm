package setandmap;

import java.util.*;

// 출처 : https://www.acmicpc.net/problem/11478
// 문제: 11478번 : 서로 다른 부분 문자열의 개수
// 방법: Scanner

public class B11478 {
	static HashSet<String> set;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		set = new HashSet<String>();

		String name = "";

		for (int i = 0; i < s.length(); i++) {
			name = "";

			for (int j = i; j < s.length(); j++) {
				name = name + s.substring(j, j + 1);
				set.add(name);
			}
		}

		System.out.println(set.size());
		sc.close();
	}

}
