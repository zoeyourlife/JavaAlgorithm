//*******************
//파일명: Dog.java
//작성자: 최재훈
//작성일: 05/17
//내용: Dog 클래스의 Animal 클래스 상속 부분
//*******************

package hw12_2;
//Animal을 상속
public class Dog extends Animal{
	public double speed; // 속도 실수형.
	
	//이름, 속도를 매개변수로 받아 출력.
	Dog(String name, double speed){
		super(name);
		this.speed = speed;
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍 "+name);
	}

	// 한 해가 지나가면 속도가 5 상승.
	@Override
	public double newYear() {
		speed = speed +5;
		return speed;
	}
	
	//toString 오버라이드 해준 것. 이름과 속도 출력되게끔.
	@Override
	public String toString() {
		return super.toString() +" 시속"+ speed+"km";
	}


}
