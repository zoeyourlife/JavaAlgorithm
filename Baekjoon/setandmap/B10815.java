package setandmap;
// 출처: https://www.acmicpc.net/problem/10815

// 문제: 10815번: 숫자 카드
// 방법: 이분 탐색

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B10815 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[] card = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(card); //이분탐색할 배열 정렬
		int m = Integer.parseInt(br.readLine()); //구별할 수 개수

		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int temp = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(card, n, temp) + " ");
		}

		bw.write(sb.toString() + "\n");
		bw.flush();
		bw.close();
	}

	public static int binarySearch(int[] card, int n, int search) {
		int first = 0;
		int last = n - 1;
		int mid = 0;

		while (first <= last) {
			mid = (first + last) / 2;

			if (card[mid] == search) {
				return 1;
			}
			if (card[mid] < search) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}
		return 0;
	}
}

// 시간복잡도가 O(log N)인 이분탐색을 사용해서 O(m log n )만큼 줄여야 가능
// 이분탐색? 어떠한 요소 N을 찾으려고 할 때 모든 배열을 보지 않고, 배열의 중간값이 N보다 큰 지 작은 지 검사
// 만약 N보다 작으면 중간값 이하는 모두 볼 필요 X
