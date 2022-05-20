//*******************
//파일명: Person.java
//작성자: 최재훈
//작성일: 05/17
//내용: Person 클래스의 Animal 클래스 상속 부분
//*******************

package hw12_2;

//Animal을 상속
public class Person extends Animal {
	public int age; //속성:나이
	
	// 이름,나이를 매개변수로 받아 초기화 !
	Person(String name, int age){
		super(name); //Animal클래스의 필드를 명시적으로 참조하기 위해 사용.
		this.age = age;
	}
	
	
	@Override
	public void sound() {
		System.out.println("안녕 "+ name);
	}

	//한 해가 지나면 나이가 1증가.
	@Override
	public double newYear() {
		return age+=1;
	}
	//toString 오버라이드
	@Override
	public String toString() {
		return super.toString() +" "+ age+ "세";
	}
		
}
// 이해가 가지 않는 부분, 추상클래스에서의 toString 오버라이드.

