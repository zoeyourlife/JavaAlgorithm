package normalMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ��ó: https://www.acmicpc.net/problem/1193
// ����: �⺻����1, �м�ã�� , 1193��
public class B1193 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		int cross_cnt = 1;
		int prev_cnt_sum = 0;

		while (true) { //�밢�� ������ + �ش� �밢�� ���� �̿�
			if (x <= prev_cnt_sum + cross_cnt) {

				if (cross_cnt % 2 == 1) { //�밢���� ������ Ȧ��
					System.out.print((cross_cnt - (x - prev_cnt_sum - 1)) + "/" + (x - prev_cnt_sum));
					break;
					// �и� ū ������
					// �и�� �밢�� ���� -(x��° - ���� �밢�������� ������ - 1)
					// ���ڴ� x��° - ���� �밢�������� ������
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
