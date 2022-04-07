//*****************
//파일명: Car2.java
//작성자: 최재훈
//작성일: 2022-04-07
//내용 : Car2 클래스 부분
//*****************
package hw7_1;

public class Car2 {
	// 필드(인스턴스 변수): 색상, 속도, 현재기어
	String color;
	int speed;
	int gear;

	// 메소드: 정보출력(print)
	void print() {
		System.out.println("(" + color + "," + speed + "," + gear + ")");
	}

	// 메소드: 속도증가(speedUp)- 속도를 1 증가하고 변경된 속도를 리턴
	int speedUp() {
		return speed = speed + 1;
	}

	// 메소드: 속도감소(speedDown)- 속도를 1감소하고 변경된 속도를 리턴
	// 원래 속도가 0이면 감속하지 말고 그대로 0
	int speedDown() {
		if (speed == 0) {
			return 0;
		}
		return speed = speed - 1;
	}

	// 메소드: 기어변속(changeGear)- 매개변수로 받은 값으로 기어를 변경
	int changeGear(int gear) {
		return gear;
	}

}
