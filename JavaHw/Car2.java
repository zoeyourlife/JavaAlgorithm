//*****************
//���ϸ�: Car2.java
//�ۼ���: ������
//�ۼ���: 2022-04-07
//���� : Car2 Ŭ���� �κ�
//*****************
package hw7_1;

public class Car2 {
	// �ʵ�(�ν��Ͻ� ����): ����, �ӵ�, ������
	String color;
	int speed;
	int gear;

	// �޼ҵ�: �������(print)
	void print() {
		System.out.println("(" + color + "," + speed + "," + gear + ")");
	}

	// �޼ҵ�: �ӵ�����(speedUp)- �ӵ��� 1 �����ϰ� ����� �ӵ��� ����
	int speedUp() {
		return speed = speed + 1;
	}

	// �޼ҵ�: �ӵ�����(speedDown)- �ӵ��� 1�����ϰ� ����� �ӵ��� ����
	// ���� �ӵ��� 0�̸� �������� ���� �״�� 0
	int speedDown() {
		if (speed == 0) {
			return 0;
		}
		return speed = speed - 1;
	}

	// �޼ҵ�: ����(changeGear)- �Ű������� ���� ������ �� ����
	int changeGear(int gear) {
		return gear;
	}

}
