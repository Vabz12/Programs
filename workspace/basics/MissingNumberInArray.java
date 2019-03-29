package basic;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 3, 7, 8, 6 };
		int n = 8;
		int sum1 = sumOfNumber(n);
		int sum2 = sumOfElements(a);
		int miss = sum1 - sum2;
		System.out.println("Missing number is :  " + miss);

	}

	static int sumOfElements(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	static int sumOfNumber(int n) {
		int sum = (n * (n + 1)) / 2;
		return sum;
	}

}
