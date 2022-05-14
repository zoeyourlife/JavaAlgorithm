package hw12_1;

public class Person extends Animal {
	
	Person(String name) { //이름을 매개변수로 받아 초기화하는 생성자
		super(name);
	}

	@Override
	public void sound() { //sound 메소드 구현
		System.out.println("안녕 "+ name);
	}

}
