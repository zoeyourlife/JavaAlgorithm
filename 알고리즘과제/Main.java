package hw1_2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println("hw1_2: 최재훈");

		Reservation[] array = new Reservation[10];

		Random rd = new Random();
//		endTime의 범위 startTime+1 ~ 6 이거를 어떻게 나타낼까?
//      만약 시작시간이 5라면, 종료시간은 6
//      만약 시작시간이 4라면, 종료시간은 5~6으로 랜덤함수.
//      만약 시작시간이 3이라면, 종료시간은 4~6
//      만약 시작시간이 2라면, 종료시간은 3~6
//      만약 시작시간이 1이라면, 종료시간은 2~6
		for (int i = 1; i <= 10; i++) {
			int startTime = (rd.nextInt(5)) + 1;
			int endTime = 0;

			if (startTime == 1) {
				endTime = rd.nextInt(5) + 2;
			} else if (startTime == 2) {
				endTime = rd.nextInt(4) + 3;
			} else if (startTime == 3) {
				endTime = rd.nextInt(3) + 4;
			} else if (startTime == 4) {
				endTime = rd.nextInt(2) + 5;
			} else if (startTime == 5) {
				endTime = 6;
			}

			array[i - 1] = new Reservation(i, startTime, endTime);

		}
		// 저장한 배열 출력
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// 예약 갯수를 세기 위한 count 배열 생성
		int[] count = new int[5];
		// i가 0~9까지 array[]배열의 시간경과를 비교한 후, 각각의 count 배열을 증가시켜준다.
		for (int i = 0; i < array.length; i++) {
			if (array[i].getLength() == 1) {
				count[0]++;
			} else if (array[i].getLength() == 2) {
				count[1]++;
			} else if (array[i].getLength() == 3) {
				count[2]++;
			} else if (array[i].getLength() == 4) {
				count[3]++;
			} else if (array[i].getLength() == 5) {
				count[4]++;
			}
		}
		// count 배열에 저장된 갯수를 출력하는 문장
		for (int j = 1; j <= count.length; j++) {
			System.out.println(j + "시간 = " + count[j - 1]);
		}

	}

}

// Reservation 클래스
class Reservation {

	public int getStartTime() {
		return startTime;
	}

	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	public int getId() {
		return id;
	}

	private int id;
	private int startTime;
	private int endTime;

	public Reservation(int id, int startTime, int endTime) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getLength() {
		return endTime - startTime;
	}

	public String toString() {
		return id + " " + startTime + "시~" + endTime + "시 " + getLength() + "시간";
	}

}
