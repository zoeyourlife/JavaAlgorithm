package math1;
// 출처 : https://www.acmicpc.net/problem/1712

// 문제 : 기본수학1, 1712번, 손익분기점 문제
// 문제 : 첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다.
// 출력 : 첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력
// 방법 : BufferedReader 방식

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1712 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int A = Integer.parseInt(st.nextToken()); // A = 고정 비용
		int B = Integer.parseInt(st.nextToken()); // B = 가변 비용 (인건비+재료비...)
		int C = Integer.parseInt(st.nextToken()); // C = 상품 비용 (책정)

		if (C <= B) { // 손익분기점 존재 X 
					  // A/(C-B)+1이 0보다 작다면 이익 발생하지 않음.
					  // A는 고정비용이니까 결국 C-B가 음수가 되면 이익발생하지 않는다는 뜻?
					  // 즉 C-B<0 이면 이익발생하지 않음. 즉 C<B이면 이익 발생하지 않는데, 
					  // 만약 C-B=0 이면 분모가 무한대로 가기 때문에 그러면 N도 무한대로 가기 때문에 손익분기점 발생 X
					  // 즉 C<=B 라면 손익분기점 발생 X!
			System.out.println("-1");
		} else {
			System.out.println((A / (C - B)) + 1);
		}
		// 상품 N개를 생산할때 손익분기점 시점의 N <<<< 구하는 문제
		// N * C(상품 비용) > 고정비용(A) + (N * B(가변 비용)) 이때의 N 구하기 .
		// 불변비용은 고정값이고, 가변비용이 상품의 개수에 따라 달라지므로 B*N을 A에 더해주면 이것이 총비용이고
		// 책정비용 * N 개의 값이 가변비용 * N + A 보다 많아지면 이익 발생--> 이 지점이 손익분기점.
		// 예제에 1000 70 170을 예로 들면, 10개를 생산할때. 총 C 비용은 1700만원,  1000+70*10 = 1700 같아지는 시점이
		// 손익분기점 0인 시점. 그 이상부터는 1870만원 > 1000+ 70* 11 = 1770만원 이때부터 손익분기점을 넘기는 시점.
		// 이때 N은 11 << 이걸 구하는 것.
		// 즉, N*C = A+(N*B)
		// 즉, (N*C)-(N*B)=A
		// 즉, N*(C-B)=A
		// 즉, N = A/(C-B)가 손익분기점 0인 시점 이때 + 1 을 해주면 그때부터가 손익분기점 발생 시점이므로.
		// 출력 (A/(C-B))+1; 하면 된다.
	}

}
