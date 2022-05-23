package selfstudy;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //StringBuilder의 객체를 생성한 후
		sb.append("문자열 ").append("연결"); // append() 인자로 연결하고자 하는 문자열을 넣어서
		// StringBuilder의 객체를 통해 호출한다. 
//		  string str = stringBuilder; // string에 stringBuilder를 그대로 넣을 순 없다.
		String str = sb.toString(); // 출력 시에는 toSring()을 붙여야 하고, String 변수에 넣을 때도
//		  두 pringln()은 같은 값을 출력한다.
		System.out.println(sb);
		System.out.println(str);

	}

}

/* 많은 양의 문자열을 연산 할 때 String을 쓰지 말아야 하는 이유는?
String은 immutable 객체(생성 후 변경 불가한 객체)이기 때문이다. 
연산할 때마다 새로운 String 클래스 객체가 만들어지고 이전 객체는 필요 없는 쓰레기 값이 되어
GC 대상이 된다. 이런 작업이 반복수행 되면서 메모리를 많이 사용하게 되고, 응답 속도에도
많은 영향을 미치게 된다. 반면에 StringBuffer나 StringBuilder는 새로운 객체를 생성하지 않고,
기존에 있는 객체의 크기를 증가시키면서 값을 더한다. */


/* StringBuffer는 동기화 처리가 가능. 즉 여러 곳에서 동시에 같은 문자열 인스턴스에
접근할 때 중복 접근을 막을 수 있는 장치를 가지고 있다. 그래서 StringBuilder에 비해 무겁다.*/
// multi thread 상태에서 동기화를 지원하는 것이 다르다.
// StringBuffer는 멀티 스레드 환경에서 안전하다는 장점이 있고
// StringBuilder는 StringBuffer보다 성능이 우수한 장점이 있다.
// 따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuffer보다 StringBuilder를 사용하는 것이 유리하다.


/* String 클래스와 동일한 메서드
{}.charAt(idx): 특정 인덱스 위치의 문자 반환
{}.indextOf("s")/lastIndexOf(): 특정 문자열 "s"의 인덱스 위치 반환. 없으면 -1 반환
{}.length(): 문자열 길이 반환
{}.replace("a", "b"): 검색된 문자열 "a"를 "b"로 교체
{}.substring(a,b): 특정 인덱스 범위 내 (a부터 b-1까지) 문자열 복사하여 새로운 인스턴스로 반환.
{}.toString(): 문자열로 출력
*/

/* #추가로 가능한 메서드
{StringBuilder}.append("s"): 문자열 "s"추가
{StringBuilder}.capacity(): 여유있게 잡아둔 해당 문자열의 사이즈 (append() 등 문자열 조정시 배열 size가 자동 변경됨)
{StringBuilder}.delete(a,b): 특정 인덱스 사이의 (a부터 b-1까지)문자열 제거
{StringBuilder}.deleteCharAt(a): 특정 인덱스의 한 문자 삭제
{StringBUilder}.insert(idx, "s"): 인덱스 위치 a에 문자열 "s" 삽입
{StringBUilder}.reverse(): 문자열얼 거꾸로뒤집음 ex) "Hello" ->"olleH"
{StringBuilder}.setCharAt(idx, 'c'): 특정 위치 idx의 문자를 'c'로 변경
{StringBuilder}.setLength(a): 문자열의 길이를 a로 조정(현재 문자열보다 길게 조정 시, 공백으로 채움)
{StringBUilder}.trimToSize(): 문자열의 여유 공백을 제거하여 현재 문자열 길이와 동일하게 조정.
*/