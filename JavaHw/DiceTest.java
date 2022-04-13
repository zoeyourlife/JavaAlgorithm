package hw8_1;

//Dice Ŭ����
class Dice {
	int face = 1; // ��-���� ����� ���ÿ� 1�� �ʱ�ȭ

	public int getFace() { // �鿡 ���� getter ! setter�� ���� ���� ����? �ֻ��� ���� �������� ��� �޴� ���̱� ������
		return face;
	}

	public void rollDice() { // �ֻ����� ������ �޼ҵ�. 1~6������ ���� �ѹ��� ����.
		face = (int) (Math.random() * 6) + 1; // Math.random() ���� 0.0�̻� 1.0 �̸� ������ ��.
	}
}

public class DiceTest {

	public static void main(String[] args) {
		Dice dice1 = new Dice(); // �ֻ��� ��ü dice1 ����
		Dice dice2 = new Dice(); // �ֻ��� ��ü dice2 ����

		int faceSum = dice1.face + dice2.face; // �ֻ��� �ΰ��� ��.

		System.out.println("�ֻ���A = " + dice1.face + " �ֻ���B = " + dice2.face + " �� = " + faceSum);
		System.out.println("�ֻ��� �ΰ��� �����ϴ�.");
		while (faceSum != 7) { // �ֻ��� ���� ���� 7�� ���ö� ���� �ֻ����� ������ ���� ������.
			dice1.rollDice();
			dice2.rollDice();
			faceSum = dice1.face + dice2.face;
			System.out.println("�ֻ���A = " + dice1.face + " �ֻ���B = " + dice2.face + " �� = " + faceSum);
		}
	}

}
//*******************
//���ϸ�: DiceTest.java
//�ۼ���: ������
//�ۼ���: 2022-04-13
//����: �ֻ����� ��Ÿ���� Dice Ŭ������ �����ϰ� �̸� �̿��ϴ� ���α׷� �ۼ�
//*******************
