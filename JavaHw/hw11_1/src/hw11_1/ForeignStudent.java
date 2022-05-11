//*******************
//파일명: ForeignStudent.java
//작성자: 최재훈
//작성일: 2022-05-12
//내용: ForeignStudent 클래스 부분
//*******************
package hw11_1;

//Student 클래스를 상속
public class ForeignStudent extends Student{
	private String country; //국적 속성 정의

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	//print() 재정의- 모든 속성(이름, 신청학점수, 국적)을 출력.
	@Override
	public void print() {
		System.out.println("이름: "+ name+" 학점: "+requestCredit+" 국적: "+country);
	}

}
