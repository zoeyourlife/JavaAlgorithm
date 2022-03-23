package hw5_1;

import java.util.Scanner;

public class BirthDate {

	public static void main(String[] args) {
		System.out.println("hw5_1: 최재훈");

		Scanner sc = new Scanner(System.in);

		int firstNumber;
		int lastNumber;

		System.out.print("주민등록번호 앞자리 입력: ");
		firstNumber = sc.nextInt();

		System.out.print("주민등록번호 뒷자리 입력: ");
		lastNumber = sc.nextInt();

		System.out.println("생년월일은 다음과 같습니다.");
		int birth = (lastNumber >= 3000000) ? 20 : 19;
		String year = (firstNumber / 10000 < 10) ? "0" + firstNumber / 10000 : "" + firstNumber / 10000;

		System.out.println("" + birth + year);
		System.out.println(firstNumber % 10000 / 100);
		System.out.println(firstNumber % 100);
		
		sc.close();

	}

}
//***************
//파일명: BirthDate.java
//작성자: 최재훈
//작성일: 2022-03-23
//내용: 주민등록번호로 생년월일 출력하기
//***************