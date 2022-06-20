package array1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//문제 : B1546, 평균 , 1차원 배열
//출처 : https://www.acmicpc.net/problem/1546
//문제 : 첫째 줄에 새로운 평균 출력. 실제 정답과 출력값의 절대오차 또는 상대오차가 10 -2 이하이면 정답이다.

//고급자바로 표현해보기
//점수를 한줄로 입력해야된다 음 입력을 받을때 공백을 기준으로 나눠주면 되려나?
public class B1546_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); //과목의 개수 n
		int arr[] = new int[n];
		double newScore[] = new double[n];
		double result = 0 ;

		for(int i = 0 ; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		//br.readLine은 입력을 한줄로 받는 버퍼이다.
		
		double max = arr[0];
		
		for(int i = 0 ; i <n; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		for(int j = 0; j<n; j++) {
			newScore[j] = arr[j]/max*100;
		}
		
		for(int k = 0; k<n; k++) {
			result = result+ newScore[k];
		}
		double avg = result/n;
		
		bw.write(String.valueOf(avg));
		bw.flush();
		bw.close();
	}

}
