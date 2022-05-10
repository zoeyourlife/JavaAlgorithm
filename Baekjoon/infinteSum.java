package stringlist;

public class infinteSum {

	public static void main(String[] args) {
		double[] arr = new double[10];
		double n = 0;

		for (int i = 0; i < 10; i++) {
			arr[i] = (double) (1 / fact(n));
			n++;
		}

		double sum = 0;

		for (int j = 0; j < 10; j++) {
			sum = sum + arr[j];
			String result = String.format("%.10f", sum);
			System.out.println(j + " " + result);
		}
	}

	public static double fact(double n) {
		if (n <= 1)
			return 1;
		else
			return n * fact(n - 1);
	}
}
