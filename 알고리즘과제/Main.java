package hw1_2;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		System.out.println("hw1_2: ������");

		Reservation[] array = new Reservation[10];

		Random rd = new Random();
//		endTime�� ���� startTime+1 ~ 6 �̰Ÿ� ��� ��Ÿ����?
//      ���� ���۽ð��� 5���, ����ð��� 6
//      ���� ���۽ð��� 4���, ����ð��� 5~6���� �����Լ�.
//      ���� ���۽ð��� 3�̶��, ����ð��� 4~6
//      ���� ���۽ð��� 2���, ����ð��� 3~6
//      ���� ���۽ð��� 1�̶��, ����ð��� 2~6
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
		// ������ �迭 ���
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		// ���� ������ ���� ���� count �迭 ����
		int[] count = new int[5];
		// i�� 0~9���� array[]�迭�� �ð������ ���� ��, ������ count �迭�� ���������ش�.
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
		// count �迭�� ����� ������ ����ϴ� ����
		for (int j = 1; j <= count.length; j++) {
			System.out.println(j + "�ð� = " + count[j - 1]);
		}

	}

}

// Reservation Ŭ����
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
		return id + " " + startTime + "��~" + endTime + "�� " + getLength() + "�ð�";
	}

}
