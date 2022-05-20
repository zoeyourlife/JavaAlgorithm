package dynamicPrograming;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// ��ó: https://www.acmicpc.net/submit/9251/43198519
// B9251, LCS(���� ���� �κ� ����)���� , �˰��� ������
public class B9251 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		char[] str1 = br.readLine().toCharArray();
		char[] str2 = br.readLine().toCharArray(); //���ڿ��� �� ���ھ� �ɰ��� charŸ���� �迭�� ����־���
		
		//c��� ������ 2���迭�� �������ְ� 0���� ä���ִ� �κ��� �־ +1�� ����
		// int������ �迭�� ���� ���ڸ����� 0���� default���� ä������.
		int[][] c = new int[str1.length+1][str2.length+1];
		
//		for(int i = 0; i<= str1.length; i++) { //������ 0���� ä���ֱ⶧���� 0�����ϰ�, 0�� ä���� �ʿ䰡 ����.
//			c[i,0]= 0;
//		}
//		for(int j = 0; j<= str2.length; j++) {
//			c[0,j]= 0;
//		}
		for(int i = 1; i<= str1.length; i++) { // ��ø for������
			for(int j = 1; j<= str2.length; j++) { //2��° ���� ���ڿ����̸�ŭ �����鼭
				if(str1[i-1] != str2[j-1]) { //str1[0] != str2[0],str2[1]...str2[j-1] ����
                                             //���ϸ鼭 �ٸ��� C�迭���� �� ū ���� ���� c[i][j]�� �־��ش�.
					c[i][j] = Math.max(c[i][j-1], c[i-1][j]);
				}
				else //���� ���ٸ�, c[i][j]�� c[i-1][j-1]�� ��ġ�� ������ +1�� ���� ���� �־��ش�.
					c[i][j] = c[i-1][j-1] + 1;
			}
		}
		
		bw.write(String.valueOf(c[str1.length][str2.length])+ "\n");
		// ���޹��� �Ķ���Ͱ� null�� ���޵� ��� ���ڿ� "null"�� ��ȯ�Ѵ�.
		
//		for(int a[]:c) { ��ü �迭�� Ȯ���غ��� ���� �˰���.
//			for(int b:a)
//				bw.write(String.valueOf(b)+" ");
//			bw.newLine();
//		}
		br.close();
		bw.close();
	}

}
