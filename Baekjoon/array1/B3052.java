package array1;

import java.util.Scanner;

//1���� �迭/ ������
public class B3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		// 10��° �� ���� ���� �Է�
		for (int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			arr[i] = a; 
		}
		//42�� �����ϱ� �������� 0~41 �� 42���� ���� �� ����.
		int rest[] = new int[42];
		for(int i = 0 ; i<10; i ++) {
			rest[arr[i]%42]++; //rest[n]<-- 42�� ���� ������ ���� �ε����� ++ ����.
		                       //���� �ݷʰ� �����ұ� . . . . . arr[10]���ʹ� �������� ����.
		}
		// differ��� �ٸ� �� ���� ���� �ʱ�ȭ
		int differ = 0;
		for (int i = 0; i < 42; i++) {
			if (rest[i] != 0) {
				differ = differ + 1;
			}
		}
		System.out.println(differ);
		sc.close();

	}

}
