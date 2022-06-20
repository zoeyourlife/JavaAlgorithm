package array1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1546_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double arr[] = new double[Integer.parseInt(br.readLine())];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i= 0 ; i<arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		double max = 0;
		
		for(int j = 0; j<arr.length; j++) {
			if(arr[j] > max) {
				max = arr[j];
			}
		}
		
		double sumScore =0;
		for(double result : arr) {
			sumScore = sumScore + result/max *100;
		}
		bw.write(String.valueOf(sumScore/arr.length));
		br.close();
		bw.flush();
		bw.close();
	}

}
