package recursion;

import java.util.Scanner;

public class B10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n= sc.nextLong();
		sc.close();
		System.out.println(fact(n));
	}
	
	public static long fact(long n) {
		if (n <= 1)
			return 1;
		else
			return n * fact(n - 1);
	}


}
