package bruteforce;

import java.util.Scanner;

public class B1018 {

	public static boolean[][] arr;
	public static int min = 64;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		arr = new boolean[N][M];

		for (int i = 0; i < n; i++) {
			String str = sc.next();

			for (int j = 0; j < m; j++) {
				if (str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}

		int n_row = n - 7;
		int m_col = m - 7;

		for (int i = 0; i < n_row; i++) {
			for (int j = 0; j < m_col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}

	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int cnt = 0;

		boolean TF = arr[x][y];

		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
				if (arr[i][j] != TF) {
					cnt++;
				}

				TF = (!TF);
			}

			TF = !TF;
		}

		cnt = Math.min(cnt, 64 - cnt);

		min = Math.min(min, cnt);
	}
}
