package hw1_2;

import java.util.Random;

public class Reser {

	public static void main(String[] args) {
		Random random = new Random();
		int n = 10;

		Reservation[] array = new Reservation[n];

		for (int i = 0; i < array.length; i++) {
			int startTime = random.nextInt(5) + 1;
			int endTime = random.nextInt(6 - startTime) + startTime + 1;
			array[i] = new Reservation((i + 1), startTime, endTime);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}

		int count[] = new int[5];

		for (int i = 0; i < array.length; i++) {
			count[array[i].getLength() - 1]++;
		}

		for (int i = 0; i < count.length; i++) {
			System.out.println((i + 1) + "시간 =" + count[i]);
		}

	}

}

class Reserva {
	private int id;
	private int startTime;
	private int endTime;

	public Reserva(int id, int startTime, int endTime) {
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
		return id + " " + startTime + "시~ " + endTime + "시" + getLength() + "시간";
	}

}
