package setandmap;

// 출처: https://www.acmicpc.net/problem/1764

// 문제: 듣보잡 1764번, 집합과 맵
// 방법: BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class B1764 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputs = br.readLine().split(" ");
		int n = Integer.parseInt(inputs[0]);
		int m = Integer.parseInt(inputs[1]);

		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			String tmp = br.readLine();
			if (set.contains(tmp)) {
				result.add(tmp);
			}
		}

		Collections.sort(result);

		System.out.println(result.size());
		for (String s : result) {
			System.out.println(s);
		}
	}

}
