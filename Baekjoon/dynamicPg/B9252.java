package dynamicPrograming;

//��ó: https://www.acmicpc.net/problem/9252
//B9252, �������α׷���, LCS(���� ���� �κ� ����) �� ���ϱ�. �˰��� ��������
//�Է�: ù° �ٰ� ��° �ٿ� �� ���ڿ��� �־�����. ���ڿ��� ���ĺ� �빮�ڷθ� �̷���� ������, �ִ� 1000���ڷ� �̷���� �ִ�
//���: ù° �ٿ� �Է����� �־��� �� ���ڿ��� LCS�� ���̸�, ��° �ٿ� LCS�� ����Ѵ�.
//     LCS�� ���� ������ ��쿡�� �ƹ��ų� ����ϰ�, LCS�� ���̰� 0�� ��쿡�� ��° ���� ������� �ʴ´�.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B9252 {

	public static void main(String[] args) throws IOException { // ����ó��.
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
		// �պκ��� B9251�� �Ȱ���.
		
		//���� ���ڸ� ������ֱ� ���� �κ�.
		int max = c[str1.length][str2.length]; // max�� c[����1][����2]���̿� ���� ���� �����ϰ�
		int left = str1.length; //left��� ������ str1�� ���̸�
		int right = str2.length; //right��� ������ str2�� ���̸�
		String str = String.valueOf(str1); //str1�� char[]���̹Ƿ� ���ڿ��� �̸� �ٲ��ش�..
		String tmp = new String(); //tmp��� String ��ü �ϳ� ����
		
		while(true) { //�ݺ��� true
			if(max==0) break; //max�� 0�̸� �ݺ��� ����.
			if(c[left-1][right] == max) { //c[str1�Ǳ���-1][str2�Ǳ���]�� max�� ���ٸ� left�ϳ� ����
				left --;
			}
			else if(c[left][right-1] == max) { //���� vice versa
				right --;
			}
			else { //���� �Ѵ� max�� �ƴ϶��, tmp�� str.charAt(left-1)�� ���� �ϳ��� ����.
				   // charAt(0) <-- ù��° ����. 
				tmp += str.charAt(left-1);
				left --;
				right --;
				max --; //left, right, max�� �ϳ��� ���ҽ����ְ�. �ݺ�<<
			}
		}
		
		String reverse = ""; //���ڿ� reverse �κ�.
		for(int i = tmp.length()-1; i>=0; i--) {
			reverse = reverse + tmp.charAt(i);
		}
		
		bw.write(reverse);

		bf.close();
		bw.close();
	}

}
