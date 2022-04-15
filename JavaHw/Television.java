//****************
//파일명: Television.java
//작성자: 최재훈
//작성일: 2022-04-15
//내용: 텔레비전의 정보를 알려주는 내용(class 부분)
//****************
package hw9_1;

public class Television { // private로 변수 선언
	private String model;
	private int price;
	private static int numberOfTVs = 0;
    //private 변수들을 사용하려면 getter setter(public)방식 
	public static int getNumberOfTVs() { 
		return numberOfTVs;
	}

	public static void setNumberOfTVs(int numberOfTVs) {
		Television.numberOfTVs = numberOfTVs;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
    // 매개변수 (디폴트 생성자). 모델명 , 가격, 텔레비전 수 증가
	public Television() {
		model = "MyTV";
		price = 0;
		numberOfTVs = numberOfTVs + 1;
	}

	// 모델명을 매개변수로 받고 초기화. 가격 0으로, 텔레비전 수 1 증가
	public Television(String model) {
		this.model = model; // 매개변수로 받은 모델 이름 설정 (this)
		price = 0;
		numberOfTVs = numberOfTVs + 1;
	}

	// 모델명과 가격을 매개변수로 받고 초기화. 텔레비전 수 1증가
	public Television(String model, int price) {
		this.model = model; //모델 명과 가격을 매개변수로 받아 설정(this)
		this.price = price;
		numberOfTVs = numberOfTVs + 1;
	}

	// 텔레비전의 정보를 문자열로 만들어 리턴
	public String toString() {
		return "모델명: " + model + "가격:" + price;
	}

}
