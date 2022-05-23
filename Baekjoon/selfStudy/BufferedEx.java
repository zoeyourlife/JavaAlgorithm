package selfstudy;
//B15552: 빠른 A+B
public class BufferedEx {

	public static void main(String[] args) {
		
	}

}

/*
BufferedReader: Scanner와 유사
BufferedWriter: System.out.println();과 유사
입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높임
많은 양의 데이터를 처리할 때 유리하다.
하지만 그에 반해 BufferedReader는 Enter만 경계로 인식하고 받은 데이터가 String으로
고정되기 때문에 입력받은 데이터를 가공하는 작업이 필요한 경우가 많다.
! 이둘을 사용하려면 import가 추가적으로 필요하다.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
*/

/*
BufferedReader 사용법
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
String s = bf.readLine(); // string
int i = Integer.parseInt(bf.readLine()); //Int

주의할 점: readLine()시 리턴값을 String으로 고정되기에 String이 아닌 다른 타입으로
입력을 받으려면 형변환을 꼭 해주어야 한다.
두번 째는 예외처리를 꼭 해주어야 한다. readLine을 할 때마다 try&catch를 활용하여
예외처리를 해주어도 되지만 대개 throws IOException을 통하여 작업한다.

throw 이용시
1) 클래스를 import해주어야 한다.
import java.io.IOException;
2) main 클래스 옆에 throws IOException을 작성한다.
public static void main(String[] args)throws IOException{}
*/

/* 
StringTokenizer st = new StringTokenizer(s); //StringTokenizer인자값에 입력 문자열
int a = Integer.parseInt(st.nextToken()); //첫번째 호출
int b = Integer.parseInt(st.nextToken()); //두번째 호출

String array[] = s.split(" "); //공백마다 데이터 끊어서 배열에 넣음

Read한 데이터는 Line단위로만 나눠지기에 공백단위로 데이터를 가공하려면 따로 작업을 해주어야하는데
첫번째 방법으로는 StringTokenizer에 nextToken()함수를 쓰면 readLine()을 통해
입력받은 값을 공백단위로 구분하여 순서대로 호출할 수 있다.
두번째 방법으로는 String.split()함수를 활용하여 배열에 공백단위로 끊어서 데이터를 넣고
사용하는 방식이다.
 */

/*
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.in));
String s = "abcdefg"; //출력할 문자열
bw.write(s+"\n"); // 버퍼에 있는 값 전부 출력
bw.flush(); //남아있는 데이터를 모두 출력시킴
bw.close(); //스트림을 닫음

BufferedWriter의 경우 버퍼를 잡아 놓았기 때문에 반드시 flush()/ close()를 반드시
호출해 주어 뒤처리를 해주어야 한다.
그리고 bw.write에는 System.out.println(); 과 같이 자동개행기능이 없기 때문에
개행을 해주어야할 경우에는 \n을 통해 따로 처리해주어야 한다.
 */



