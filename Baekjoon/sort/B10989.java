package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 출처: https://www.acmicpc.net/problem/10989
// 문졔: 10989: 수 정렬하기 3 
// 방법: Array.sort()

public class B10989 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n]; // 입력한 수만큼 배열 생성

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for (int num : arr) {
			sb.append(num).append('\n');
		}

		System.out.println(sb);
	}

}
