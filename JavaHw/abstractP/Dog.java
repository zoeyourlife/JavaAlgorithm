package hw12_1;

public class Dog extends Animal {
	
	Dog(String name) { //�̸��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
		super(name); // super Ű���带 �̿��Ͽ� ���� Ŭ������ �޼ҵ带 ȣ����
	}
	
	@Override
	public void sound() { //sound �޼ҵ� override
		System.out.println("�۸� "+ name);
	}
	
}
