package numbercombine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11050_3 {

	static int[][] bp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		bp = new int[N + 1][K + 1];

		System.out.println(BC(N, K));
	}

	static int BC(int n, int k) {

		// 이미 풀었던 내용이면 값 재사용
		if (bp[n][k] > 0) {
			return bp[n][k];
		}

		if (k == 0 || n == k) {
			return bp[n][k] = 1;
		}

		return bp[n][k] = BC(n - 1, k - 1) + BC(n - 1, k);
	}

}
