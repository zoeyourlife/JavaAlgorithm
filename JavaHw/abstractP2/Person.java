//*******************
//���ϸ�: Person.java
//�ۼ���: ������
//�ۼ���: 05/17
//����: Person Ŭ������ Animal Ŭ���� ��� �κ�
//*******************

package hw12_2;

//Animal�� ���
public class Person extends Animal {
	public int age; //�Ӽ�:����
	
	// �̸�,���̸� �Ű������� �޾� �ʱ�ȭ !
	Person(String name, int age){
		super(name); //AnimalŬ������ �ʵ带 ��������� �����ϱ� ���� ���.
		this.age = age;
	}
	
	
	@Override
	public void sound() {
		System.out.println("�ȳ� "+ name);
	}

	//�� �ذ� ������ ���̰� 1����.
	@Override
	public double newYear() {
		return age+=1;
	}
	//toString �������̵�
	@Override
	public String toString() {
		return super.toString() +" "+ age+ "��";
	}
		
}
// ���ذ� ���� �ʴ� �κ�, �߻�Ŭ���������� toString �������̵�.

