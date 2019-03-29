package basic;

public class HarshadNumber {

	public static void main(String[] args) {
		harshadNumber(21);
	}

	static void harshadNumber(int number) {
		int copy = number;
		int sum = 0;
		while (number != 0) {
			int lastdig = number % 10;
			sum = sum + lastdig;
			number = number / 10;
		}

		if ((copy % sum) == 0) {
			System.out.println(copy + " is Harshad number .");
		} else {
			System.out.println(copy + " is not a Harshad number .");
		}
	}
}
