//*****************
//���ϸ�: Car2Test.java
//�ۼ���: ������
//�ۼ���: 2022-04-07
//���� : Car2Test main�޼ҵ� �κ�
//*****************
package hw7_1;

public class Car2Test {

	public static void main(String[] args) {
		Car2 myCar = new Car2(); // 1) myCar��� �ڵ��� ��ü �ϳ� ����
		
		myCar.color = "red"; // 2) myCar ���� red ����
		myCar.speed = 0; // 2) myCar �ӵ� 0 ����
		myCar.gear = 1; // 2) myCar ��� 1 ����
		
		myCar.print(); // 3) myCar �������

		for (int i = 0; i < 20; i++) { // 4) myCar�� �ӵ����� �޼ҵ� 20�� ȣ��
			myCar.speedUp();
		}

		myCar.print(); // 5) myCar �������

		int a = 2; //2�� ������ a��� �μ�
		myCar.gear = myCar.changeGear(a); // 6) myCar�� ���� �޼ҵ带 ȣ���Ͽ� �� 2�� ����

		myCar.print(); // 7) myCar �������

		for (int i = 0; i < 20; i++) { // 8) myCar�� �ӵ����� �޼ҵ带 20�� ȣ��
			myCar.speedUp();
		}

		myCar.print(); // 9) myCar �������

		for (int i = 0; i < 50; i++) { // 10) myCar�� �ӵ����� �޼ҵ带 50�� ȣ��
			myCar.speedDown();
		}

		myCar.print(); // 11) myCar ���� ���

	}

}
