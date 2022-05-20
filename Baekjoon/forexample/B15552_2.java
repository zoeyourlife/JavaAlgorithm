package forexample;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//문제 출처: https://www.acmicpc.net/problem/15552
//문제 내용: B15552, 반복문, 빠른 A+B
//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// StringTokenizer를 이용한 방법.

public class B15552_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(bf.readLine()); // 테스트의 개수
		
		for(int i = 1; i<=C; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," "); //띄어쓰기 기준으로 문자열 분리.
			
			int a = Integer.parseInt(st.nextToken()); //객체에서 다음 토큰을 반환해서 a에 넣고
			int b = Integer.parseInt(st.nextToken()); //그다음 토큰은 b에 넣는다.
			
			bw.write(a+b+"\n");
		}
		
		bf.close();
		bw.flush();
		bw.close();

	}

}

//StringTokenizer 클래스란? BufferedReader 클래스의 메서드로 입력을 읽어들이면, 라인 단위로 읽을 수밖에 없다.
//스페이스 기준으로 문자열을 분리한다던가 필요할때가 많은데 그때 컴마로 구분되는 문자열들을 분리한다던가, 특정문자에 따라 문자열을 분리
//토큰은 분리된 문자열 조각으로, StringTokenizer 클래스는 하나의 문자열을 여러개의 토큰으로 분리하는 클래스!

//StringTokenizer st = new StringTokenizer(문자열); --> 띄어스끼 기준으로 문자열을 분리
//StringTokenizer st = new StringTokenizer(문자열, 구분자); --> 구분자를 기준으로 문자열을 분리
//StringTokenizer st = new StringTokenizer(문자열, 구분자, true/false); --> true: 구분자도 토큰으로 넣을지

//nextToken() --> 객체에서 다음 토큰을 반환
//hasMoreTokens() --> 남아있는 토큰이 있으면 true , 없으면 false 리턴
//countTOkens() --> 총 토큰의 개수를 리턴.

//구분자는 하나의 문자로 구성될 필요가 없다. 하나 문자가 아닌, 여러개의 문자를 구분자로 토큰을 만들 수도 있다.
//StringTokenizer와 Split 차이?
//전자는 java.util에 포함된 클래스, 후자는 String클래스에 포함된 메소드
//전자는 빈 문자열을 토큰으로 인식 X, 후자는 빈 문자열도 토큰으로 인식 O
//전자는 결과값이 문자열이라면 후자는 결과 값이 문자열 배열.
//즉 StringTokenizer를 이용하면 전체 토큰을 볼때 반복문을 이용해서 하나하나 뽑을 수밖에 없다.