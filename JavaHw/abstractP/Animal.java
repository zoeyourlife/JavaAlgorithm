package hw12_1;

public abstract class Animal {
	public String name; //�Ӽ�: �̸�
	
	Animal(String name){ //�̸��� �Ű������� �޾� �ʱ�ȭ�ϴ� ������
		this.name=name;
	}
	
	public String getName() { //�̸��� ���� getter
		return name;
	}

	public abstract void sound(); //�߻�޼ҵ�

}
