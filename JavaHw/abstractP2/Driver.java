//*******************
//���ϸ�: Driver.java
//�ۼ���: ������
//�ۼ���: 05/17
//����: Driver Ŭ������ main �޼ҵ� �κ�
//*******************
package hw12_2;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw12_2: ������");
		//1) ũ�Ⱑ 4�� Animal �迭�� ����,
		Animal[] animal = new Animal[4];
		// Dog��ü 2��, Person��ü 2�� ������,
		Dog dog1 = new Dog("������", 13.5);
		Dog dog2 = new Dog("������", 12.5);
		Person per1 = new Person("ȫ�浿", 20);
		Person per2 = new Person("�ڱ浿", 25);
		// �迭�� ����.
		animal[0] = dog1;
		animal[1] = dog2;
		animal[2] = per1;
		animal[3] = per2;
		
		//2) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� ������ ���
		for(int i=0; i<=3; i++) {
			System.out.println(animal[i]);
		}
		//3) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� sound() �޼ҵ带 ȣ��
		for(int i=0; i<=3; i++) {
			animal[i].sound();
		}
		//4) 1����, �ݺ����� �̿��Ͽ� �迭 ���ҵ��� newYear() �޼ҵ带 ȣ��
		for(int i=0; i<=3; i++) {
			animal[i].newYear();
		}
		System.out.println("------1�� ��------");
		
		//5) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� ������ ���
		for(int i=0; i<=3; i++) {
			System.out.println(animal[i]);
		}
		//6) 2����, �ݺ����� �̿��Ͽ� �迭 ���ҵ��� newYear() �޼ҵ带 ȣ��
		for(int i=0; i<=3; i++) {
			animal[i].newYear();
		}
		System.out.println("------2�� ��------");
		
		//7) �ݺ����� �̿��Ͽ� �迭 ���ҵ��� ������ ȣ��
		for(int i=0; i<=3; i++) {
			System.out.println(animal[i]);
		}
		
		

	}

}
