//*******************
//파일명: Animal.java
//작성자: 최재훈
//작성일: 05/17
//내용: Animal 클래스의 추상 클래스 부분.
//*******************

package hw12_2;

//Animal 추상 클래스 부분
public abstract class Animal {
	public String name; //속성: 이름
	
	//초기화하는 생성자.
	Animal(String name){
		this.name = name;
	}
	//이름에 대한 getter
	public String getName() {
		return name;
	}
	
	//추상 메소드 sound(), newYear().
	public abstract void sound();
	public abstract double newYear();
	//toString 오버라이드
	public String toString() {
		return name;
	}
}
//toString은 ~~의 시속: ~km
//toString은 홍길동: 20세 <-- 속도와 나이 나오도록.
