package setandmap;
// 출처: https://www.acmicpc.net/problem/14425
// 문제: 집합과맵 14425번: 문자열 집합
// 방법: BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B14425 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0 ; i <n ; i++) {
			map.put(br.readLine(), 0 );
		}
		
		int cnt = 0 ;
		for (int i = 0 ; i< m ; i++) {
			if(map.containsKey(br.readLine())) cnt ++;
		}
		System.out.println(cnt);
	}

}
