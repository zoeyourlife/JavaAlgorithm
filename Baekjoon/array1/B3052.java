package array1;

import java.util.Scanner;

//1차원 배열/ 나머지
public class B3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		// 10번째 줄 까지 숫자 입력
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			arr[i] = a; 
		}
		//42로 나누니까 나머지는 0~41 총 42가지 나올 수 있음.
		int rest[] = new int[42];
		for(int i = 0 ; i<10; i ++) {
			rest[arr[i]%42]++; //rest[n]<-- 42로 나눈 나머지 값의 인덱스를 ++ 해줌.
		                       //무슨 반례가 존재할까 . . . . . arr[10]부터는 존재하지 않음.
		}
		// differ라는 다른 수 개수 변수 초기화
		int differ = 0;
		for (int i = 0; i < 42; i++) {
			if (rest[i] != 0) {
				differ = differ + 1;
			}
		}
		System.out.println(differ);
		sc.close();

	}

}
