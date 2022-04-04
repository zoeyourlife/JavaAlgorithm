package hw4_1;

import java.util.Random;

public class ReSort {

	public static void main(String[] args) {
		System.out.println("hw4_1: ������");

		Random rd = new Random();
		int n = 10;
		//ũ�Ⱑ n�� ���� �迭 ����
		Reservation[] array = new Reservation[n];
		
		// ���� ��ȣ 1,2,3..., ���۽ð�, ����ð� ���� ���� ���� ��ü n�� ���� �迭 ����
		for (int i = 0; i < array.length; i++) {
			int startTime = rd.nextInt(5) + 1;
			int endTime = rd.nextInt(6 - startTime) + startTime + 1;
			array[i] = new Reservation((i + 1), startTime, endTime);
		}
		
		//���� ���
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}

		// ���� �迭�� ���� ������������ �����ϴ� ���� �޼ҵ� ȣ��
		countingSort(array);

		System.out.println("���� �������� ���� ���=");

		// ���ĵ� n���� ���� ���
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i].toString());
		}
	}
	
	//���� �޼ҵ�- ���� �迭�� �Ű������� �޾� ����(1~5)�� �������� ������������ ����,O(n) �˰��� �̿�.
	private static void countingSort(Reservation[] list) { //�迭 list�� ���ҵ��� �����Ͽ� ���ġ
		int count[] = new int[5]; //ũ�Ⱑ 5�� count �迭 ����
		Reservation result[] = new Reservation[list.length]; //list �迭ũ�Ⱑ 10�ʰ��ϴ��󵵱� ����
		Reservation value[] = new Reservation[list.length];

		// count �迭�� 1~5������ ������ ���� ã����
		for (int i = 0; i < list.length; i++) {
			count[list[i].getLength() - 1]++;
		}

		// count �迭 ���� ��
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}
		// Reservation�� value�� list�迭 ����
		for (int i = 0; i < list.length; i++) {
			value[i] = list[i];
		}

		// value �迭�� getLength() ���� ���� ��� ������ �������.
		// result �迭�� value �迭�� ��� ���� ����
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
		
		// ���� ���� result �迭�� ������ �ٽ� list �迭�� �־���
		for (int i = 0; i < list.length; i++) {
			list[i] = result[i];
		}

	}

}

//�׵����� ������ ����
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
		return id + " " + startTime + "��~ " + endTime + "�� " + getLength() + "�ð�";
	}

}