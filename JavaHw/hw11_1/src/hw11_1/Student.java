//*******************
//���ϸ�: Student.java
//�ۼ���: ������
//�ۼ���: 2022-05-12
//����: Student Ŭ�����κ�
//*******************
package hw11_1;

public class Student {
	public String name; // �Ӽ�: �̸�, ��û������ �ʵ�����
	public int requestCredit; //public���� �����ؾ��� �ٸ� Ŭ�������� ����� �� �ִ�.
	
	// ��� getter/setter: �̸�, ��û������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRequestCredit() {
		return requestCredit;
	}
	public void setRequestCredit(int requestCredit) {
		this.requestCredit = requestCredit;
	}
	
	//��ϱ� ��� �޼ҵ�- ��ϱ� �׼��� ����
	public int rqCredit() {
		if(requestCredit>6) { //��û�������� 6�ʰ��̸� 300����
			return 3000000;
		}
		else { //6 �����̸� 1������ 20����
			return requestCredit * 200000;
		}
	}
	public void print() { // ��� �Ӽ�(�̸�, ��û������)�� ���
		System.out.println("�̸�: "+ name +"  ����: "+requestCredit);
	}
	
	
	
}
