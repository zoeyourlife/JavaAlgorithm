package forexample;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// ���� ��ó: https://www.acmicpc.net/problem/15552
// ���� ����: B15552, �ݺ���, ���� A+B
// Java�� ����ϰ� �ִٸ�, Scanner�� System.out.println ��� BufferedReader�� BufferedWriter�� ����� �� �ִ�.
// BufferedWriter.flush�� �� �������� �� ���� �ϸ� �ȴ�.

// Split�� �̿��� ���.
public class B15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int C = Integer.parseInt(bf.readLine());
		
		for(int i = 0 ; i<C; i++) {
			String[] nums = bf.readLine().split(" ");
			//����(������) ����: split(" ")<-- ���ϴ� ������(����)�� �������� String�� ©�� �迭�� ����.
			
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			
//			bw.write(a+b+"\n");
			
			bw.write(Integer.toString(a + b) + '\n'); // ���ۿ��� ���ڿ��� ��ƾ� �ϹǷ�, toString()

		}
		bw.flush(); //���ۿ� ��Ƶ״� �����͵��� �Ѳ����� ���. ���ݱ��� ��Ƶ� �����͸� ���.
	}

}

// NumberFormatException ����: ���� ���� ����
// ���ڿ��� ���ڷ� ��ȯ�� ��, �� ���ڰ� ���ڷ� �̷���� ���� �ƴ϶� ���ڰ� ������ ��ȯ�� �� ���� ��
// �̷� ���� Exception ó���� ���־�� �Ѵ�. �̷� ����, try~catch~�� �̿��Ͽ� �����ش�.
// ex) try{ String str = "010"; System.out.println(Integer.parseInt(str));}
//     catch(NumberFormatException e){ NumberFormatException�� �߻��� ��� ó�� ���}
//     catch(Exception e){ Exception�� �߻��� ��� ó�� ���} << �̷� ��
// �̰ų� �Ǵ� ���� �Լ��� throws NumberFormatException�� �ٿ��ִ� ����� ���� �� �ִ�.
