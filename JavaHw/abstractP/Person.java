package hw12_1;

public class Person extends Animal {
	
	Person(String name) { //�̸��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
		super(name);
	}

	@Override
	public void sound() { //sound �޼ҵ� ����
		System.out.println("�ȳ� "+ name);
	}

}
