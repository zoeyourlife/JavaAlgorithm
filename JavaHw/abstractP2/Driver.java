//*******************
//파일명: Driver.java
//작성자: 최재훈
//작성일: 05/17
//내용: Driver 클래스의 main 메소드 부분
//*******************
package hw12_2;

public class Driver {

	public static void main(String[] args) {
		System.out.println("hw12_2: 최재훈");
		//1) 크기가 4인 Animal 배열을 생성,
		Animal[] animal = new Animal[4];
		// Dog객체 2개, Person객체 2개 생성후,
		Dog dog1 = new Dog("진돌이", 13.5);
		Dog dog2 = new Dog("진순이", 12.5);
		Person per1 = new Person("홍길동", 20);
		Person per2 = new Person("박길동", 25);
		// 배열에 저장.
		animal[0] = dog1;
		animal[1] = dog2;
		animal[2] = per1;
		animal[3] = per2;
		
		//2) 반복문을 이용하여 배열 원소들의 정보를 출력
		for(int i=0; i<=3; i++) {
			System.out.println(animal[i]);
		}
		//3) 반복문을 이용하여 배열 원소들의 sound() 메소드를 호출
		for(int i=0; i<=3; i++) {
			animal[i].sound();
		}
		//4) 1년후, 반복문을 이용하여 배열 원소들의 newYear() 메소드를 호출
		for(int i=0; i<=3; i++) {
			animal[i].newYear();
		}
		System.out.println("------1년 후------");
		
		//5) 반복문을 이용하여 배열 원소들의 정보를 출력
		for(int i=0; i<=3; i++) {
			System.out.println(animal[i]);
		}
		//6) 2년후, 반복문을 이용하여 배열 원소들의 newYear() 메소드를 호출
		for(int i=0; i<=3; i++) {
			animal[i].newYear();
		}
		System.out.println("------2년 후------");
		
		//7) 반복문을 이용하여 배열 원소들의 정보를 호출
		for(int i=0; i<=3; i++) {
			System.out.println(animal[i]);
		}
		
		

	}

}
