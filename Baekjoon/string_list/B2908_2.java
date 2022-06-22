package string;
//��ó: https://www.acmicpc.net/problem/2908
//����: B2908, ���ڿ� ���(���ڸ� ����� ���ϴ� ����)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//BufferedReader ���
public class B2908_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		//�Է��� ������ �������� �� �� A B�� �־�����.
		
		int a = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		// StringBuilder ��ü�� �����ϰ�, ������ ��ū�� ���������� ���ڿ��� StringBuilder��ü�� ���� ȣ��
		// �Ŀ� �� ���� ���ϱ� ���� a, b ���������� ��ȯ�� ���� �־���
		
		System.out.print(a>b?a:b);
	}

}
