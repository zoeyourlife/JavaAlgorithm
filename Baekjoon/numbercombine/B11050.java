package numbercombine;
// 출처: https://www.acmicpc.net/problem/11050

// 문제: 조합론1) 11050번: 이항계수1
// (a+b)^n 을 전개 했을 때, a^n-r b^r에 대한 계수
// ex) n=3, r=2, a^1b^2의 계수 -> 계수는 3
// b가 n개 있을 때 이들중에 r개를 뽑는다. 
// 즉, nCr <-- 조합 공식 사용 가능
// nCr = (n | r) = n!/ r!(n-r)! 그대로 수식 대입.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11050 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println(fact(N) / (fact(N - K) * fact(K)));
	}

	static int fact(int N) {
		if (N <= 1) {
			return 1;
		}
		return N * fact(N - 1);
	}

}
