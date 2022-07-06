package math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 출처: https://www.acmicpc.net/problem/2869
// 문제: 달팽이는 올라가고 싶다 B2869, 기본 수학 1
// 방식: Buffered방식

public class B2869 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());
		
		int day = (length - down) / (up - down);
		if((length - down) % (up-down) !=0)
			day ++;
		
		System.out.println(day);
	}

}
