package hw6_1;

import java.util.Scanner;

public class MonSea {

	public static void main(String[] args) {
		System.out.println("hw6_1: 최재훈");

		Scanner sc = new Scanner(System.in);
		int month;
		// 달 입력 받기, 만약 잘못 입력했을 경우 다시 입력받기.
		while (true) {
			System.out.println("달을 입력하세요: ");
			month = sc.nextInt();
			if (month > 0 && month <= 12) {
				break; //달의 조건에 만족하면 루프 탈출
			}
		}
		// switch-case 문을 사용, switch에 입력변수 month를 넣음
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄"); // month가 3,4,5인 경우 봄 출력
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름"); // month가 6,7,8인 경우 여름 출력
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을"); // month가 9,10,11인 경우 가을 출력
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울"); // month가 12,1,2인 경우 겨울 출력
			break; // 해당 case문을 수행하고 switch문을 빠져나가기 위한 것.
		}

		sc.close();

	}

}
