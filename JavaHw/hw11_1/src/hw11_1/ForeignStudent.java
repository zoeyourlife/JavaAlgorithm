//*******************
//���ϸ�: ForeignStudent.java
//�ۼ���: ������
//�ۼ���: 2022-05-12
//����: ForeignStudent Ŭ���� �κ�
//*******************
package hw11_1;

//Student Ŭ������ ���
public class ForeignStudent extends Student{
	private String country; //���� �Ӽ� ����

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	//print() ������- ��� �Ӽ�(�̸�, ��û������, ����)�� ���.
	@Override
	public void print() {
		System.out.println("�̸�: "+ name+" ����: "+requestCredit+" ����: "+country);
	}

}
