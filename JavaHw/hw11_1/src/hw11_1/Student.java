//*******************
//파일명: Student.java
//작성자: 최재훈
//작성일: 2022-05-12
//내용: Student 클래스부분
//*******************
package hw11_1;

public class Student {
	public String name; // 속성: 이름, 신청학점수 필드정의
	public int requestCredit; //public으로 접근해야지 다른 클래스에서 사용할 수 있다.
	
	// 기능 getter/setter: 이름, 신청학점수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRequestCredit() {
		return requestCredit;
	}
	public void setRequestCredit(int requestCredit) {
		this.requestCredit = requestCredit;
	}
	
	//등록금 계산 메소드- 등록금 액수를 리턴
	public int rqCredit() {
		if(requestCredit>6) { //신청학점수가 6초과이면 300만원
			return 3000000;
		}
		else { //6 이하이면 1학점당 20만원
			return requestCredit * 200000;
		}
	}
	public void print() { // 모든 속성(이름, 신청학점수)을 출력
		System.out.println("이름: "+ name +"  학점: "+requestCredit);
	}
	
	
	
}
