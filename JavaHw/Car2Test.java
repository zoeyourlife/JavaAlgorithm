//*****************
//파일명: Car2Test.java
//작성자: 최재훈
//작성일: 2022-04-07
//내용 : Car2Test main메소드 부분
//*****************
package hw7_1;

public class Car2Test {

	public static void main(String[] args) {
		Car2 myCar = new Car2(); // 1) myCar라는 자동차 객체 하나 생성
		
		myCar.color = "red"; // 2) myCar 색상 red 지정
		myCar.speed = 0; // 2) myCar 속도 0 지정
		myCar.gear = 1; // 2) myCar 기어 1 지정
		
		myCar.print(); // 3) myCar 정보출력

		for (int i = 0; i < 20; i++) { // 4) myCar의 속도증가 메소드 20번 호출
			myCar.speedUp();
		}

		myCar.print(); // 5) myCar 정보출력

		int a = 2; //2를 가지는 a라는 인수
		myCar.gear = myCar.changeGear(a); // 6) myCar의 기어변속 메소드를 호출하여 기어를 2로 변경

		myCar.print(); // 7) myCar 정보출력

		for (int i = 0; i < 20; i++) { // 8) myCar의 속도증가 메소드를 20번 호출
			myCar.speedUp();
		}

		myCar.print(); // 9) myCar 정보출력

		for (int i = 0; i < 50; i++) { // 10) myCar의 속도감소 메소드를 50번 호출
			myCar.speedDown();
		}

		myCar.print(); // 11) myCar 정보 출력

	}

}
