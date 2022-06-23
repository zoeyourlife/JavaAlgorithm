package function;

public class B4673 {

	public static void main(String[] args) {
		boolean[] num = new boolean[10001];

		for (int i = 1; i < 10001; i++) {
			int n = d(i);

			if (n < 10001) {
				num[n] = true;
			}
		}
		for (int i = 1; i < 10001; i++) {
			if (num[i] == false)
				System.out.println(i);
		}
	}

	public static int d(int number) {
		int sum = number;
		while (number != 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
}


