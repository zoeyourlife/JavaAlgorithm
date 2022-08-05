package sort;
// 출처: https://www.acmicpc.net/problem/18870
// 문제: 18870번: 좌표 압축 (정렬)
// 방법: Scanner

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class B18870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] origin = new int[n]; //원본 배열
		int[] sort = new int[n]; //정렬 할 배열
		
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>(); //rank 매길 HashMap
		
		for(int i = 0 ; i < n; i++) {
			// 정렬할 배열이랑 원본 배열에 값을 넣어줌
			sort[i] = origin[i] = sc.nextInt();
		}
		
		Arrays.sort(sort); //정렬 수행

		
		int rank = 0 ; 
		for(int v: sort) { //정렬 된 배열을 돌면서 map에 넣어주기
			if(!rankingMap.containsKey(v)) { // 앞선 원소가 이미 순위가 매겨졌을때 중복 x
				rankingMap.put(v, rank);  //원소 중복 안될때만 map에 원소랑 그에 대응되는 순위 넣기
				rank++; //map에 넣고나면 다음 순위를 가리키도록
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int key : origin) {
			int ranking = rankingMap.get(key); //원본 배열 원소(key)에 대한 value(순위)를 갖고옴
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
		sc.close();
	}

}
