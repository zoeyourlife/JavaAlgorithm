package hw12_1;

public class Dog extends Animal {
	
	Dog(String name) { //이름을 매개변수로 받아 초기화하는 생성자
		super(name); // super 키워드를 이용하여 수퍼 클래스의 메소드를 호출함
	}
	
	@Override
	public void sound() { //sound 메소드 override
		System.out.println("멍멍 "+ name);
	}
	
}
