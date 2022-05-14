package hw12_1;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw12_1: 최재훈");
		
		// 적당한 이름으로 초기화하여 Dog 객체와 Person 객체를 생성한다.
		Dog dog = new Dog("진돌이");
		Person human = new Person("홍길동");
		
		// DOg객체, Person객체 각각에 대해 sound 메소드를 호출한다.
		dog.sound();
		human.sound();
		
	}

}
