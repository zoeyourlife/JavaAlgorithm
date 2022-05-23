package selfstudy;

public class QueueStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/* 배열을 이용해서 Queue 구현
queueIsEmpty(): 큐 안이 비었는지 판단하는 함수
queueIsFull(): 배열의 최대크기를 벗어나면 안되기에 큐에 더이상 들어갈 공간이 없는지 판단하는 함수
size(): queue에 현재 들어가 있는 데이터의 개수를 return하는 함수
push(int value): 큐 안에 데이터를 집어넣는 함수
peek(): 큐 안의 데이터들중 가장 먼저 나오는 데이터를 return하는 함수
pop(): 큐 안의 데이터들 중에 가장 먼저 나올 수 있는 데이터를 return하고 삭제하는 함수

배열로 구현한 Queue는 push pop이 간단, 배열의 크기가 유한해 큐의 크기가 다 차버리면 사용할 수 없다.
그럴 땐 LinkedList로 Queue를 구현

LinkedList을 이용해서 Queue 구현
똑같이 Node를 이용해서 Queue를 구현. 값이 들어갈 Node와 Queue를 관리할 NodeManager 클래스 만들기.
ex) int value;
    QueueNode queueNode;
    public QueueNode(int value){
       this.value = value;
       queueNode = null;
    }
LinkedList로 Queue를 만들게 되면 구현은 복잡, 큐의 크기도 무한하고 Queue안에 원하는 기능을 넣을 수 있음.
*/