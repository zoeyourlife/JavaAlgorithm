//*******************
//���ϸ�: Animal.java
//�ۼ���: ������
//�ۼ���: 05/17
//����: Animal Ŭ������ �߻� Ŭ���� �κ�.
//*******************

package hw12_2;

//Animal �߻� Ŭ���� �κ�
public abstract class Animal {
	public String name; //�Ӽ�: �̸�
	
	//�ʱ�ȭ�ϴ� ������.
	Animal(String name){
		this.name = name;
	}
	//�̸��� ���� getter
	public String getName() {
		return name;
	}
	
	//�߻� �޼ҵ� sound(), newYear().
	public abstract void sound();
	public abstract double newYear();
	//toString �������̵�
	public String toString() {
		return name;
	}
}
//toString�� ~~�� �ü�: ~km
//toString�� ȫ�浿: 20�� <-- �ӵ��� ���� ��������.
