package function;

import java.util.Scanner;

// 함수, B1065
// 어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
// 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 
// 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
public class Hansu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3]; // 1000이하의 수니까 각 자리의 수를 비교하기 위해 배열 3칸짜리 생성
		int k;
		int t;
		int han = 0;
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) { //1부터 99까지는 무조건 한수.
			if (i < 100)
				han = i; // i만큼이 한수의 개수
			else if (i == 1000) // i가 루프를 돌다 1000이되면 끝.
				break;
			else { // 100~ 1000까지의 수 중 한수 구하기
				k = 0;
				t = i; // i가 100일때부터 ~ 999까지 .
				while (t > 1) { // t가 0보다 클동안
					arr[k] = t % 10; // arr[0], arr[1], arr[2]에 세자리수 정수의 각자리의 수를 담아줌
					                 // ex) 159: arr[0]=9, arr[1]= 5, arr[2]= 1 
					t /= 10;
					k++;
				}
				if (arr[0] - arr[1] == arr[1] - arr[2]) // 등차수열이 맞는지 ?
					han++;
			}
		}
		System.out.println(han);
		sc.close();

	}

}
