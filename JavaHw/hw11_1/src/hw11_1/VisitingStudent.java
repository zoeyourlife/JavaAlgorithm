//*******************
//���ϸ�: VisitingStudent.java
//�ۼ���: ������
//�ۼ���: 2022-05-12
//����: ��ȯ�л� ���� Ŭ����
//*******************
package hw11_1;
// Student Ŭ������ ���
public class VisitingStudent extends Student {
	private String schoolName; //�Ҽ��б��� �Ӽ� ����

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//��ϱݰ�� ������ �������̵�- ��û���� 1������ 10����
	@Override
	public int rqCredit() {
		return requestCredit * 100000;
	}
	//print()������ �������̵�- ��� �Ӽ�(�̸�, ��û������, �Ҽ��б���)�� ���
	@Override
	public void print() {
		System.out.println("�̸�: "+ name+"  ����: "+requestCredit+" �Ҽ��б�: "+schoolName);
	}
}
