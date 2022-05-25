package array1;
//���� : B1546, ��� , 1���� �迭
//��ó : https://www.acmicpc.net/problem/1546
//���� : ù° �ٿ� ���ο� ��� ���. ���� ����� ��°��� ������� �Ǵ� �������� 10 -2 �����̸� �����̴�.

import java.util.Scanner;

public class B1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N];
		double[] newScore= new double[N];
		double result = 0 ;
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		
		for(int i = 0; i<N; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		for(int i = 0; i<N; i++) {
			newScore[i] = (double)arr[i]/max*100;
		}
		
		for(int i = 0 ; i<N; i++) {
			result = result+ newScore[i];
		}
		double avg = result/N;
		
		System.out.println(avg);
		
		
		sc.close();
	}

}
