package setandmap;
// 출처 : https://www.acmicpc.net/problem/1620

// 문제: 1620번: 나는야 포켓몬 마스터 이다솜, 집합과 맵
// 방법: BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1620 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> nameMap = new HashMap<String, Integer>();
		String[] nameArr = new String[n + 1];
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < n + 1; i++) {
			String name = br.readLine();
			nameMap.put(name, i);
			nameArr[i] = name;
		}

		while (m-- > 0) {
			String findStr = br.readLine();
			if (isStringNumber(findStr)) { // 숫자 입력 if
				int index = Integer.parseInt(findStr);
				sb.append(nameArr[index]);
			} else { // 문자를 입력받은 경우
				sb.append(nameMap.get(findStr));
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	// 이 문자열이 숫자인지 아닌지 판단하는 함수
	public static boolean isStringNumber(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
