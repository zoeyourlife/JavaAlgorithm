package numbercombine;
// 방법: BufferedReader

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1037_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while (t-- > 0) {
			int n = Integer.parseInt(st.nextToken());

			max = n > max ? n : max;
			min = n < min ? n : min;
		}
		System.out.println(max * min);
	}

}
