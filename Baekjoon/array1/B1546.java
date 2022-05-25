package array1;
//문제 : B1546, 평균 , 1차원 배열
//출처 : https://www.acmicpc.net/problem/1546
//문제 : 첫째 줄에 새로운 평균 출력. 실제 정답과 출력값의 절대오차 또는 상대오차가 10 -2 이하이면 정답이다.

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
