//*******************
//파일명: StudentTest.java
//작성자: 최재훈
//작성일: 2022-05-12
//내용: 메인함수부분
//*******************
package hw11_1;

public class StudentTest {

	public static void main(String[] args) {
		System.out.println("hw11_1: 최재훈");
		Student s1 = new Student(); //학생 객체 생성
		ForeignStudent s2 = new ForeignStudent();   //외국인학생 객체 생성
		VisitingStudent s3 = new VisitingStudent(); //교환학생 객체 생성
		
		// 학생의 이름, 신청학점수를 "Kim", 20로 지정
		s1.name="Kim";
		s1.requestCredit = 20;
		
		// 외국인 학생의 이름, 신청학점수, 국적을 "Jobs", 5, "USA"로 지정
		s2.name="Jobs";
		s2.requestCredit = 5;
		s2.setCountry("USA");
		
		// 교환학생의 이름, 신청학점수, 소속학교명을 "Lee", 8, "강원대"로 지정
		s3.name="Lee";
		s3.requestCredit = 8;
		s3.setSchoolName("강원대");
		
		// 각 학생의 정보를 출력
		s1.print();
		s2.print();
		s3.print();
		
		// 세 학생에게 물어보아 각자의 등록금액수를 알아내어 등록금 합을 출력.
		int creditSum = s1.rqCredit() + s2.rqCredit() + s3.rqCredit();
		System.out.println("등록금 합= " +creditSum);
	}

}
