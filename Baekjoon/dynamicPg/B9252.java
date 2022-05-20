package dynamicPrograming;

//출처: https://www.acmicpc.net/problem/9252
//B9252, 동적프로그래밍, LCS(최장 공통 부분 수열) 값 구하기. 알고리즘 과제용임
//입력: 첫째 줄과 둘째 줄에 두 문자열이 주어진다. 문자열은 알파벳 대문자로만 이루어져 있으며, 최대 1000글자로 이루어져 있다
//출력: 첫째 줄에 입력으로 주어진 두 문자열의 LCS의 길이를, 둘째 줄에 LCS를 출력한다.
//     LCS가 여러 가지인 경우에는 아무거나 출력하고, LCS의 길이가 0인 경우에는 둘째 줄을 출력하지 않는다.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B9252 {

	public static void main(String[] args) throws IOException { // 예외처리.
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] str1 = bf.readLine().toCharArray();
		char[] str2 = bf.readLine().toCharArray();

		int[][] c = new int[str1.length + 1][str2.length + 1];

		for (int i = 1; i <= str1.length; i++) {
			for (int j = 1; j <= str2.length; j++) {
				if (str1[i - 1] != str2[j - 1]) {
					c[i][j] = Math.max(c[i][j - 1], c[i - 1][j]);
				} else
					c[i][j] = c[i - 1][j - 1] + 1;
			}
		}
		
		bw.write(String.valueOf(c[str1.length][str2.length]) + "\n");
		// 앞부분은 B9251과 똑같다.
		
		//이제 문자를 출력해주기 위한 부분.
		int max = c[str1.length][str2.length]; // max에 c[문자1][문자2]길이에 들어가는 수를 저장하고
		int left = str1.length; //left라는 변수에 str1의 길이를
		int right = str2.length; //right라는 변수에 str2의 길이를
		String str = String.valueOf(str1); //str1은 char[]형이므로 문자열로 미리 바꿔준다..
		String tmp = new String(); //tmp라는 String 객체 하나 생성
		
		while(true) { //반복문 true
			if(max==0) break; //max가 0이면 반복문 종료.
			if(c[left-1][right] == max) { //c[str1의길이-1][str2의길이]가 max와 같다면 left하나 빼줌
				left --;
			}
			else if(c[left][right-1] == max) { //위와 vice versa
				right --;
			}
			else { //만약 둘다 max가 아니라면, tmp에 str.charAt(left-1)한 것을 하나씩 저장.
				   // charAt(0) <-- 첫번째 문자. 
				tmp += str.charAt(left-1);
				left --;
				right --;
				max --; //left, right, max를 하나씩 감소시켜주고. 반복<<
			}
		}
		
		String reverse = ""; //문자열 reverse 부분.
		for(int i = tmp.length()-1; i>=0; i--) {
			reverse = reverse + tmp.charAt(i);
		}
		
		bw.write(reverse);

		bf.close();
		bw.close();
	}

}
