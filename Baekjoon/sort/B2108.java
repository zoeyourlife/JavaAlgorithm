package sort;

import java.util.Scanner;
// 출처 : https://www.acmicpc.net/problem/2108
// 문제 : 2108번: 통계학

public class B2108 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[8001];

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		// median 과 mode 는 -4000~4000 을 제외한 수로 초기화하면 된다.
		int median = 10000;
		int mode = 10000;
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			sum += value;
			arr[value + 4000]++;
		
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		int count = 0;	// 중앙값 빈도 누적 수 
		int mode_max = 0; 	// 최빈값의 최댓값  
		
		boolean flag = false;	 
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			
			if(arr[i] > 0) {
				
				
				if(count < (n + 1) / 2) {
					count += arr[i];	// i값의 빈도수를 count 에 누적
					median = i - 4000;
				}
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		System.out.println((int)Math.round((double)sum / n));	// 산술평균 
		System.out.println(median);	// 중앙값 
		System.out.println(mode);	// 최빈값 
		System.out.println(max - min);	// 범위 
		sc.close();
	}
 
}