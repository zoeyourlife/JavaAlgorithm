package selfstudy;
//B15552: ���� A+B
public class BufferedEx {

	public static void main(String[] args) {
		
	}

}

/*
BufferedReader: Scanner�� ����
BufferedWriter: System.out.println();�� ����
�Էµ� �����Ͱ� �ٷ� ���޵��� �ʰ� ���۸� ���� ���޵ǹǷ� ������ ó�� ȿ������ ����
���� ���� �����͸� ó���� �� �����ϴ�.
������ �׿� ���� BufferedReader�� Enter�� ���� �ν��ϰ� ���� �����Ͱ� String����
�����Ǳ� ������ �Է¹��� �����͸� �����ϴ� �۾��� �ʿ��� ��찡 ����.
! �̵��� ����Ϸ��� import�� �߰������� �ʿ��ϴ�.
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
*/

/*
BufferedReader ����
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
String s = bf.readLine(); // string
int i = Integer.parseInt(bf.readLine()); //Int

������ ��: readLine()�� ���ϰ��� String���� �����Ǳ⿡ String�� �ƴ� �ٸ� Ÿ������
�Է��� �������� ����ȯ�� �� ���־�� �Ѵ�.
�ι� °�� ����ó���� �� ���־�� �Ѵ�. readLine�� �� ������ try&catch�� Ȱ���Ͽ�
����ó���� ���־ ������ �밳 throws IOException�� ���Ͽ� �۾��Ѵ�.

throw �̿��
1) Ŭ������ import���־�� �Ѵ�.
import java.io.IOException;
2) main Ŭ���� ���� throws IOException�� �ۼ��Ѵ�.
public static void main(String[] args)throws IOException{}
*/

/* 
StringTokenizer st = new StringTokenizer(s); //StringTokenizer���ڰ��� �Է� ���ڿ�
int a = Integer.parseInt(st.nextToken()); //ù��° ȣ��
int b = Integer.parseInt(st.nextToken()); //�ι�° ȣ��

String array[] = s.split(" "); //���鸶�� ������ ��� �迭�� ����

Read�� �����ʹ� Line�����θ� �������⿡ ��������� �����͸� �����Ϸ��� ���� �۾��� ���־���ϴµ�
ù��° ������δ� StringTokenizer�� nextToken()�Լ��� ���� readLine()�� ����
�Է¹��� ���� ��������� �����Ͽ� ������� ȣ���� �� �ִ�.
�ι�° ������δ� String.split()�Լ��� Ȱ���Ͽ� �迭�� ��������� ��� �����͸� �ְ�
����ϴ� ����̴�.
 */

/*
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.in));
String s = "abcdefg"; //����� ���ڿ�
bw.write(s+"\n"); // ���ۿ� �ִ� �� ���� ���
bw.flush(); //�����ִ� �����͸� ��� ��½�Ŵ
bw.close(); //��Ʈ���� ����

BufferedWriter�� ��� ���۸� ��� ���ұ� ������ �ݵ�� flush()/ close()�� �ݵ��
ȣ���� �־� ��ó���� ���־�� �Ѵ�.
�׸��� bw.write���� System.out.println(); �� ���� �ڵ��������� ���� ������
������ ���־���� ��쿡�� \n�� ���� ���� ó�����־�� �Ѵ�.
 */



