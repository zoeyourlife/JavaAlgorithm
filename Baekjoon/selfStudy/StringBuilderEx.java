package selfstudy;

public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(); //StringBuilder�� ��ü�� ������ ��
		sb.append("���ڿ� ").append("����"); // append() ���ڷ� �����ϰ��� �ϴ� ���ڿ��� �־
		// StringBuilder�� ��ü�� ���� ȣ���Ѵ�. 
//		  string str = stringBuilder; // string�� stringBuilder�� �״�� ���� �� ����.
		String str = sb.toString(); // ��� �ÿ��� toSring()�� �ٿ��� �ϰ�, String ������ ���� ����
//		  �� pringln()�� ���� ���� ����Ѵ�.
		System.out.println(sb);
		System.out.println(str);

	}

}

/* ���� ���� ���ڿ��� ���� �� �� String�� ���� ���ƾ� �ϴ� ������?
String�� immutable ��ü(���� �� ���� �Ұ��� ��ü)�̱� �����̴�. 
������ ������ ���ο� String Ŭ���� ��ü�� ��������� ���� ��ü�� �ʿ� ���� ������ ���� �Ǿ�
GC ����� �ȴ�. �̷� �۾��� �ݺ����� �Ǹ鼭 �޸𸮸� ���� ����ϰ� �ǰ�, ���� �ӵ�����
���� ������ ��ġ�� �ȴ�. �ݸ鿡 StringBuffer�� StringBuilder�� ���ο� ��ü�� �������� �ʰ�,
������ �ִ� ��ü�� ũ�⸦ ������Ű�鼭 ���� ���Ѵ�. */


/* StringBuffer�� ����ȭ ó���� ����. �� ���� ������ ���ÿ� ���� ���ڿ� �ν��Ͻ���
������ �� �ߺ� ������ ���� �� �ִ� ��ġ�� ������ �ִ�. �׷��� StringBuilder�� ���� ���̴�.*/
// multi thread ���¿��� ����ȭ�� �����ϴ� ���� �ٸ���.
// StringBuffer�� ��Ƽ ������ ȯ�濡�� �����ϴٴ� ������ �ְ�
// StringBuilder�� StringBuffer���� ������ ����� ������ �ִ�.
// ���� ����ȭ�� ����� �ʿ䰡 ���� ��Ȳ������ StringBuffer���� StringBuilder�� ����ϴ� ���� �����ϴ�.


/* String Ŭ������ ������ �޼���
{}.charAt(idx): Ư�� �ε��� ��ġ�� ���� ��ȯ
{}.indextOf("s")/lastIndexOf(): Ư�� ���ڿ� "s"�� �ε��� ��ġ ��ȯ. ������ -1 ��ȯ
{}.length(): ���ڿ� ���� ��ȯ
{}.replace("a", "b"): �˻��� ���ڿ� "a"�� "b"�� ��ü
{}.substring(a,b): Ư�� �ε��� ���� �� (a���� b-1����) ���ڿ� �����Ͽ� ���ο� �ν��Ͻ��� ��ȯ.
{}.toString(): ���ڿ��� ���
*/

/* #�߰��� ������ �޼���
{StringBuilder}.append("s"): ���ڿ� "s"�߰�
{StringBuilder}.capacity(): �����ְ� ��Ƶ� �ش� ���ڿ��� ������ (append() �� ���ڿ� ������ �迭 size�� �ڵ� �����)
{StringBuilder}.delete(a,b): Ư�� �ε��� ������ (a���� b-1����)���ڿ� ����
{StringBuilder}.deleteCharAt(a): Ư�� �ε����� �� ���� ����
{StringBUilder}.insert(idx, "s"): �ε��� ��ġ a�� ���ڿ� "s" ����
{StringBUilder}.reverse(): ���ڿ��� �Ųٷε����� ex) "Hello" ->"olleH"
{StringBuilder}.setCharAt(idx, 'c'): Ư�� ��ġ idx�� ���ڸ� 'c'�� ����
{StringBuilder}.setLength(a): ���ڿ��� ���̸� a�� ����(���� ���ڿ����� ��� ���� ��, �������� ä��)
{StringBUilder}.trimToSize(): ���ڿ��� ���� ������ �����Ͽ� ���� ���ڿ� ���̿� �����ϰ� ����.
*/