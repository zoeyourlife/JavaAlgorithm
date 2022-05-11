//*******************
//파일명: VisitingStudent.java
//작성자: 최재훈
//작성일: 2022-05-12
//내용: 교환학생 내용 클래스
//*******************
package hw11_1;
// Student 클래스를 상속
public class VisitingStudent extends Student {
	private String schoolName; //소속학교명 속성 정의

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	//등록금계산 재정의 오버라이드- 신청학점 1학점당 10만원
	@Override
	public int rqCredit() {
		return requestCredit * 100000;
	}
	//print()재정의 오버라이드- 모든 속성(이름, 신청학점수, 소속학교명)을 출력
	@Override
	public void print() {
		System.out.println("이름: "+ name+"  학점: "+requestCredit+" 소속학교: "+schoolName);
	}
}
