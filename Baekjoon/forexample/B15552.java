package forexample;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 문제 출처: https://www.acmicpc.net/problem/15552
// 문제 내용: B15552, 반복문, 빠른 A+B
// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.

// Split을 이용한 방법.
public class B15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int C = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i<C; i++) {
			String[] nums = bf.readLine().split(" ");
			//띄어스기(구분자) 존재: split(" ")<-- 원하는 구분자(공백)을 기준으로 String을 짤라 배열에 삽입.
			
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			
//			bw.write(a+b+"\n");
			
			bw.write(Integer.toString(a + b) + '\n'); // 버퍼에는 문자열을 담아야 하므로, toString()

		}
		bw.flush(); //버퍼에 모아뒀던 데이터들을 한꺼번에 출력. 지금까지 모아둔 데이터를 출력.
	}

}

// NumberFormatException 설명: 숫자 형식 오류
// 문자열을 숫자로 변환할 때, 그 문자가 숫자로 이루어진 것이 아니라 문자가 섞여서 변환할 수 없을 때
// 이럴 때는 Exception 처리를 해주어야 한다. 이럴 때는, try~catch~를 이용하여 감싸준다.
// ex) try{ String str = "010"; System.out.println(Integer.parseInt(str));}
//     catch(NumberFormatException e){ NumberFormatException이 발생한 경우 처리 방법}
//     catch(Exception e){ Exception이 발생한 경우 처리 방법} << 이런 식
// 이거나 또는 메인 함수에 throws NumberFormatException을 붙여주는 방법도 있을 수 있다.
