//****************
//���ϸ�: TelevisionTest.java
//�ۼ���: ������
//�ۼ���: 2022-04-15
//����: �ڷ������� ������ �˷��ִ� ����(main �κ�)
//****************
package hw9_1;

public class TelevisonTest {

	public static void main(String[] args) {
		System.out.println("hw9_1: ������");
		//numberOfTVs�� private ������ getter ����� �̿��� static �޼ҵ带
		//ȣ���Ϸ��� Ŭ����.�޼ҵ��̸�(..)����
		System.out.println(Television.getNumberOfTVs()); 
		Television tv1 = new Television(); //������ 1 ȣ��
		Television tv2 = new Television("Yourtv"); //������ 2 ȣ��
		Television tv3 = new Television("Ourtv", 20000); //������ 3 ȣ��
		System.out.println(tv1); //��ºκ�
		System.out.println(tv2);
		System.out.println(tv3);
		System.out.println(Television.getNumberOfTVs()); //�ѹ��� ������ tv���� ����

	}

}
