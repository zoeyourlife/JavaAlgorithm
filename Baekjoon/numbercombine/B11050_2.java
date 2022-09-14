package numbercombine;
// 팩토리얼 방식 말고 하나로 합쳐서 !

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* n+1Cr+1 = nCr + nCr+1
   (n+1 | r+1) = (n | r) + (n | r+1)
--> (n | r ) = (n-1 | r-1) + (n-1 | r)

n과 r이 같거나 r이 0이라면 1이다.
nC0 = nCn = 1
이 방식대로 짜보자.
 */

// 이 방식의 문제점: 재귀로 부분 문제를 풀 때 중복되는 부분 문제더라도 다시 풀어야 함
// 즉 memoization을 사용해야 함. 즉 동적계획법을 사용
// 이 방식은 배열을 초기에 선언하고, 재귀로 하위 문제로 접근, 문제가 풀리면 배열에 저장하면서 빠져나옴
// 내일 이어서.

public class B11050_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println(BinomalC(N, K));
	}

	static int BinomalC(int n, int k) {
		if (n == k || k == 0) {
			return 1;
		}
		return BinomalC(n - 1, k - 1) + BinomalC(n - 1, k);
	}

}
