package array1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//���� : B1546, ��� , 1���� �迭
//��ó : https://www.acmicpc.net/problem/1546
//���� : ù° �ٿ� ���ο� ��� ���. ���� ����� ��°��� ������� �Ǵ� �������� 10 -2 �����̸� �����̴�.

//����ڹٷ� ǥ���غ���
//������ ���ٷ� �Է��ؾߵȴ� �� �Է��� ������ ������ �������� �����ָ� �Ƿ���?
public class B1546_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine()); //������ ���� n
		int arr[] = new int[n];
		double newScore[] = new double[n];
		double result = 0 ;

		for(int i = 0 ; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		//br.readLine�� �Է��� ���ٷ� �޴� �����̴�.
		
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
