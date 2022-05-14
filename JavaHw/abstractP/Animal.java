package hw12_1;

public abstract class Animal {
	public String name; //속성: 이름
	
	Animal(String name){ //이름을 매개변수로 받아 초기화하는 생성자
		this.name=name;
	}
	
	public String getName() { //이름에 대한 getter
		return name;
	}

	public abstract void sound(); //추상메소드

}
