package forexample;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//���� ��ó: https://www.acmicpc.net/problem/15552
//���� ����: B15552, �ݺ���, ���� A+B
//Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�.
//BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.

// StringTokenizer�� �̿��� ���.

public class B15552_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(bf.readLine()); // �׽�Ʈ�� ����
		
		for(int i = 1; i<=C; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine()," "); //���� �������� ���ڿ� �и�.
			
			int a = Integer.parseInt(st.nextToken()); //��ü���� ���� ��ū�� ��ȯ�ؼ� a�� �ְ�
			int b = Integer.parseInt(st.nextToken()); //�״��� ��ū�� b�� �ִ´�.
			
			bw.write(a+b+"\n");
		}
		
		bf.close();
		bw.flush();
		bw.close();

	}

}

//StringTokenizer Ŭ������? BufferedReader Ŭ������ �޼���� �Է��� �о���̸�, ���� ������ ���� ���ۿ� ����.
//�����̽� �������� ���ڿ��� �и��Ѵٴ��� �ʿ��Ҷ��� ������ �׶� �ĸ��� ���еǴ� ���ڿ����� �и��Ѵٴ���, Ư�����ڿ� ���� ���ڿ��� �и�
//��ū�� �и��� ���ڿ� ��������, StringTokenizer Ŭ������ �ϳ��� ���ڿ��� �������� ��ū���� �и��ϴ� Ŭ����!

//StringTokenizer st = new StringTokenizer(���ڿ�); --> ���� �������� ���ڿ��� �и�
//StringTokenizer st = new StringTokenizer(���ڿ�, ������); --> �����ڸ� �������� ���ڿ��� �и�
//StringTokenizer st = new StringTokenizer(���ڿ�, ������, true/false); --> true: �����ڵ� ��ū���� ������

//nextToken() --> ��ü���� ���� ��ū�� ��ȯ
//hasMoreTokens() --> �����ִ� ��ū�� ������ true , ������ false ����
//countTOkens() --> �� ��ū�� ������ ����.

//�����ڴ� �ϳ��� ���ڷ� ������ �ʿ䰡 ����. �ϳ� ���ڰ� �ƴ�, �������� ���ڸ� �����ڷ� ��ū�� ���� ���� �ִ�.
//StringTokenizer�� Split ����?
//���ڴ� java.util�� ���Ե� Ŭ����, ���ڴ� StringŬ������ ���Ե� �޼ҵ�
//���ڴ� �� ���ڿ��� ��ū���� �ν� X, ���ڴ� �� ���ڿ��� ��ū���� �ν� O
//���ڴ� ������� ���ڿ��̶�� ���ڴ� ��� ���� ���ڿ� �迭.
//�� StringTokenizer�� �̿��ϸ� ��ü ��ū�� ���� �ݺ����� �̿��ؼ� �ϳ��ϳ� ���� ���ۿ� ����.