package dynamicPrograming;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// 출처: https://www.acmicpc.net/submit/9251/43198519
// B9251, LCS(최장 공통 부분 수열)문제 , 알고리즘 과제용
public class B9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] str1 = br.readLine().toCharArray();
		char[] str2 = br.readLine().toCharArray(); //문자열을 한 글자씩 쪼개서 char타입의 배열에 집어넣어줌
		
		//c라는 정수형 2차배열을 생성해주고 0으로 채워주는 부분이 있어서 +1을 해줌
		// int형으로 배열을 만들어서 빈자리에는 0으로 default값이 채워진다.
		int[][] c = new int[str1.length+1][str2.length+1];
		
//		for(int i = 0; i<= str1.length; i++) { //어차피 0으로 채워주기때문에 0부터하고, 0을 채워줄 필요가 없다.
//			c[i,0]= 0;
//		}
//		for(int j = 0; j<= str2.length; j++) {
//			c[0,j]= 0;
//		}
		for(int i = 1; i<= str1.length; i++) { // 중첩 for문으로
			for(int j = 1; j<= str2.length; j++) { //2번째 받은 문자열길이만큼 돌리면서
				if(str1[i-1] != str2[j-1]) { //str1[0] != str2[0],str2[1]...str2[j-1] 까지
                                             //비교하면서 다르면 C배열에서 더 큰 쪽의 수를 c[i][j]에 넣어준다.
					c[i][j] = Math.max(c[i][j-1], c[i-1][j]);
				}
				else //만약 같다면, c[i][j]는 c[i-1][j-1]인 위치의 수에서 +1을 해준 값을 넣어준다.
					c[i][j] = c[i-1][j-1] + 1;
			}
		}
		
		bw.write(String.valueOf(c[str1.length][str2.length])+ "\n");
		// 전달받은 파라미터가 null이 전달될 경우 문자열 "null"을 반환한다.
		
//		for(int a[]:c) { 전체 배열을 확인해보기 위한 알고리즘.
//			for(int b:a)
//				bw.write(String.valueOf(b)+" ");
//			bw.newLine();
//		}
		br.close();
		bw.close();
	}

}
