package selfstudy;

public class QueueStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/* �迭�� �̿��ؼ� Queue ����
queueIsEmpty(): ť ���� ������� �Ǵ��ϴ� �Լ�
queueIsFull(): �迭�� �ִ�ũ�⸦ ����� �ȵǱ⿡ ť�� ���̻� �� ������ ������ �Ǵ��ϴ� �Լ�
size(): queue�� ���� �� �ִ� �������� ������ return�ϴ� �Լ�
push(int value): ť �ȿ� �����͸� ����ִ� �Լ�
peek(): ť ���� �����͵��� ���� ���� ������ �����͸� return�ϴ� �Լ�
pop(): ť ���� �����͵� �߿� ���� ���� ���� �� �ִ� �����͸� return�ϰ� �����ϴ� �Լ�

�迭�� ������ Queue�� push pop�� ����, �迭�� ũ�Ⱑ ������ ť�� ũ�Ⱑ �� �������� ����� �� ����.
�׷� �� LinkedList�� Queue�� ����

LinkedList�� �̿��ؼ� Queue ����
�Ȱ��� Node�� �̿��ؼ� Queue�� ����. ���� �� Node�� Queue�� ������ NodeManager Ŭ���� �����.
ex) int value;
    QueueNode queueNode;
    public QueueNode(int value){
       this.value = value;
       queueNode = null;
    }
LinkedList�� Queue�� ����� �Ǹ� ������ ����, ť�� ũ�⵵ �����ϰ� Queue�ȿ� ���ϴ� ����� ���� �� ����.
*/