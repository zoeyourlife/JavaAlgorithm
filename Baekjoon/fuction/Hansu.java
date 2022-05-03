package function;

import java.util.Scanner;

// �Լ�, B1065
// � ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�, �� ���� �Ѽ���� �Ѵ�. 
// ���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�. N�� �־����� ��, 
// 1���� ũ�ų� ����, N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
public class Hansu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3]; // 1000������ ���ϱ� �� �ڸ��� ���� ���ϱ� ���� �迭 3ĭ¥�� ����
		int k;
		int t;
		int han = 0;
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) { //1���� 99������ ������ �Ѽ�.
			if (i < 100)
				han = i; // i��ŭ�� �Ѽ��� ����
			else if (i == 1000) // i�� ������ ���� 1000�̵Ǹ� ��.
				break;
			else { // 100~ 1000������ �� �� �Ѽ� ���ϱ�
				k = 0;
				t = i; // i�� 100�϶����� ~ 999���� .
				while (t > 1) { // t�� 0���� Ŭ����
					arr[k] = t % 10; // arr[0], arr[1], arr[2]�� ���ڸ��� ������ ���ڸ��� ���� �����
					                 // ex) 159: arr[0]=9, arr[1]= 5, arr[2]= 1 
					t /= 10;
					k++;
				}
				if (arr[0] - arr[1] == arr[1] - arr[2]) // ���������� �´��� ?
					han++;
			}
		}
		System.out.println(han);
		sc.close();

	}

}
