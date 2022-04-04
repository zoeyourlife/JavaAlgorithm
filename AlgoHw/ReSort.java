package hw4_1;

import java.util.Random;

public class ReSort {

	public static void main(String[] args) {
		System.out.println("hw4_1: 최재훈");

		Random rd = new Random();
		int n = 10;
		//크기가 n인 예약 배열 생성
		Reservation[] array = new Reservation[n];
		
		// 예약 번호 1,2,3..., 시작시간, 종료시간 랜덤 값인 예약 객체 n개 생성 배열 저장
		for (int i = 0; i < array.length; i++) {
			int startTime = rd.nextInt(5) + 1;
			int endTime = rd.nextInt(6 - startTime) + startTime + 1;
			array[i] = new Reservation((i + 1), startTime, endTime);
		}
		
		//예약 출력
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}

		// 에약 배열을 길이 오름차순으로 정렬하는 정렬 메소드 호출
		countingSort(array);

		System.out.println("길이 오름차순 정렬 결과=");

		// 정렬된 n개의 예약 출력
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
	
	//정렬 메소드- 예약 배열을 매개변수로 받아 길이(1~5)를 기준으로 오름차순으로 정렬,O(n) 알고리즘 이용.
	private static void countingSort(Reservation[] list) { //배열 list의 원소들을 정렬하여 재배치
		int count[] = new int[5]; //크기가 5인 count 배열 생성
		Reservation result[] = new Reservation[list.length]; //list 배열크기가 10초과하더라도기 때문
		Reservation value[] = new Reservation[list.length];

		// count 배열로 1~5까지의 범위의 개수 찾아줌
		for (int i = 0; i < list.length; i++) {
			count[list[i].getLength() - 1]++;
		}

		// count 배열 누적 합
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		// Reservation형 value에 list배열 복사
		for (int i = 0; i < list.length; i++) {
			value[i] = list[i];
		}

		// value 배열의 getLength() 값에 따라 계수 정렬을 해줘야함.
		// result 배열에 value 배열을 계수 정렬 해줌
		for (int i = value.length - 1; i >= 0; i--) {
			if (value[i].getLength() == 1) {
				count[0]--;
				result[count[0]] = value[i];
			} else if (value[i].getLength() == 2) {
				count[1]--;
				result[count[1]] = value[i];
			} else if (value[i].getLength() == 3) {
				count[2]--;
				result[count[2]] = value[i];
			} else if (value[i].getLength() == 4) {
				count[3]--;
				result[count[3]] = value[i];
			} else if (value[i].getLength() == 5) {
				count[4]--;
				result[count[4]] = value[i];
			}
		}
		
		// 이제 나온 result 배열의 값들을 다시 list 배열에 넣어줌
		for (int i = 0; i < list.length; i++) {
			list[i] = result[i];
		}

	}

}

//그동안의 과제와 동일
class Reservation {
	private int id;
	private int startTime;
	private int endTime;

	public Reservation(int id, int startTime, int endTime) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public int getStartTime() {
		return startTime;
	}

	public int getEndTime() {
		return endTime;
	}

	public int getId() {
		return id;
	}

	public int getLength() {
		return endTime - startTime;
	}

	@Override
	public String toString() {
		return id + " " + startTime + "시~ " + endTime + "시 " + getLength() + "시간";
	}

}