//*******************
//���ϸ�: StudentTest.java
//�ۼ���: ������
//�ۼ���: 2022-05-12
//����: �����Լ��κ�
//*******************
package hw11_1;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("hw11_1: ������");
		Student s1 = new Student(); //�л� ��ü ����
		ForeignStudent s2 = new ForeignStudent();   //�ܱ����л� ��ü ����
		VisitingStudent s3 = new VisitingStudent(); //��ȯ�л� ��ü ����
		
		// �л��� �̸�, ��û�������� "Kim", 20�� ����
		s1.name="Kim";
		s1.requestCredit = 20;
		
		// �ܱ��� �л��� �̸�, ��û������, ������ "Jobs", 5, "USA"�� ����
		s2.name="Jobs";
		s2.requestCredit = 5;
		s2.setCountry("USA");
		
		// ��ȯ�л��� �̸�, ��û������, �Ҽ��б����� "Lee", 8, "������"�� ����
		s3.name="Lee";
		s3.requestCredit = 8;
		s3.setSchoolName("������");
		
		// �� �л��� ������ ���
		s1.print();
		s2.print();
		s3.print();
		
		// �� �л����� ����� ������ ��ϱݾ׼��� �˾Ƴ��� ��ϱ� ���� ���.
		int creditSum = s1.rqCredit() + s2.rqCredit() + s3.rqCredit();
		System.out.println("��ϱ� ��= " +creditSum);
	}

}
