package normalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 출처: https://www.acmicpc.net/problem/1193
// 문제: 기본수학1, 분수찾기 , 1193번
public class B1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int cross_cnt = 1;
		int prev_cnt_sum = 0;

		while (true) { //대각선 누적합 + 해당 대각선 개수 이용
			if (x <= prev_cnt_sum + cross_cnt) {

				if (cross_cnt % 2 == 1) { //대각선의 개수가 홀수
					System.out.print((cross_cnt - (x - prev_cnt_sum - 1)) + "/" + (x - prev_cnt_sum));
					break;
					// 분모가 큰 수부터
					// 분모는 대각선 개수 -(x번째 - 직전 대각선까지의 누적합 - 1)
					// 분자는 x번째 - 직전 대각선까지의 누적합
				}

				else {
					System.out.print((x - prev_cnt_sum) + "/" + (cross_cnt - (x - prev_cnt_sum - 1)));
					break;
				}
			} else {
				prev_cnt_sum += cross_cnt;
				cross_cnt++;
			}
		}
	}

}
