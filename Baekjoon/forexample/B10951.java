package stringlist;

// 반복문: B10951번 , A+B -4
// 출처: https://www.acmicpc.net/problem/10951
// 문제: 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10951 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input;
		
		while((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int result = a+b;
			
			bw.write(result+"");
			bw.newLine();
		}
		bw.flush();
	}
}
