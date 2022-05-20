//*******************
//���ϸ�: Dog.java
//�ۼ���: ������
//�ۼ���: 05/17
//����: Dog Ŭ������ Animal Ŭ���� ��� �κ�
//*******************

package hw12_2;
//Animal�� ���
public class Dog extends Animal{
	public double speed; // �ӵ� �Ǽ���.
	
	//�̸�, �ӵ��� �Ű������� �޾� ���.
	Dog(String name, double speed){
		super(name);
		this.speed = speed;
	}
	
	@Override
	public void sound() {
		System.out.println("�۸� "+name);
	}

	// �� �ذ� �������� �ӵ��� 5 ���.
	@Override
	public double newYear() {
		speed = speed +5;
		return speed;
	}
	
	//toString �������̵� ���� ��. �̸��� �ӵ� ��µǰԲ�.
	@Override
	public String toString() {
		return super.toString() +" �ü�"+ speed+"km";
	}


}
