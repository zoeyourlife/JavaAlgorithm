package hw8_1;

class Test {
	void print(int... v) {
		System.out.println("인수 개수: " + v.length);
		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	void printMult(double a, int... v) {
		for (int i = 0; i < v.length; i++)
			System.out.print(a * v[i] + " ");
		System.out.println();
	}
}

public class VariableLength {

	public static void main(String[] args) {
		Test c = new Test();
		c.print();
		c.print(2, 3, 4, 5, 6);
		c.printMult(0.1, 15, 26);
	}

}
