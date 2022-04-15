//****************
//파일명: TelevisionTest.java
//작성자: 최재훈
//작성일: 2022-04-15
//내용: 텔레비전의 정보를 알려주는 내용(main 부분)
//****************
package hw9_1;

public class TelevisonTest {

	public static void main(String[] args) {
		System.out.println("hw9_1: 최재훈");
		//numberOfTVs는 private 변수로 getter 방식을 이용해 static 메소드를
		//호출하려면 클래스.메소드이름(..)형식
		System.out.println(Television.getNumberOfTVs()); 
		Television tv1 = new Television(); //생성자 1 호출
		Television tv2 = new Television("Yourtv"); //생성자 2 호출
		Television tv3 = new Television("Ourtv", 20000); //생성자 3 호출
		System.out.println(tv1); //출력부분
		System.out.println(tv2);
		System.out.println(tv3);
		System.out.println(Television.getNumberOfTVs()); //한번더 증가된 tv수를 세줌

	}

}
