package hw12_1;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw12_1: ������");
		
		// ������ �̸����� �ʱ�ȭ�Ͽ� Dog ��ü�� Person ��ü�� �����Ѵ�.
		Dog dog = new Dog("������");
		Person human = new Person("ȫ�浿");
		
		// DOg��ü, Person��ü ������ ���� sound �޼ҵ带 ȣ���Ѵ�.
		dog.sound();
		human.sound();
		
	}

}
