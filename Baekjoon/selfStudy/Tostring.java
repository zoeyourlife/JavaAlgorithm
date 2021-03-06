package selfstudy;

public class Tostring {

	public static void main(String[] args) {
	}

}

/* toString()--> java.lang.Object 클래스의 toString 메서드는 일반적으로
사용자가 보려는 문자열이 아니다.
"사람이 읽기 쉽도록 간략하지만 유용한 정보를 제공해야 한다."
toString을 잘 구현한 클래스는 사용하기 즐겁고, 시스템을 디버깅하기 쉽다.
실전에서 toString은 그 객체가 가진 주요 정보 모두를 반환하는게 좋다.
객체가 거대하거나 객체의 상태를 문자열로 표현하기 어렵다면, 요약 정보를 담아야 함.
예) "맨해튼 거주자 전화번호부(총 12414개)", Thread[main,5,main]
toString을 구현할 때면 반환값의 포맷을 문서화할지 정해야 한다.
 -포맷을 명시하면 그 객체는 표준적이고, 명확하고, 사람이 읽을 수 있게 됨.
 -다만, 포맷을 한번 명시하면 평생 그 포맷에 얽매이게 됨(이에 의존적인 다른 코드들을 포함)
 포맷을 명시하든 아니든 의도는 명확히 밝혀야 한다.
 
 정적 유틸리티 클래스는 toString을 제공할 이유가 없고, 대부분의 열거 타입도
 자바가 이미 완벽한 toString을 제공하니 따로 재정의하지 않아도 된다.

결론: 모든 구체 클래스에서 Object의 toString을 재정의하자.
   - 단, 상위클래스에서 알맞게 재정의한 경우는 예외
   : toString을 재정의한 클래스는 그 클래스를 사용한 시스템을 디버깅하게 쉽게 함.
   : toString은 해당 객체에 관한 명확하고 유용한 정보를 읽기 좋은 형태로 반환해야함.
   
*/