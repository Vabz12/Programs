package basic;

public class ReverseNumber {

	public static void main(String[] args) {

		reverseAndAdd(7325);
	}

	static int reverseNumber(int number) {

		int reverse = 0;
		int remainder = 0;

		while (number != 0) {
			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number / 10;
		}
		return reverse;
	}

	static boolean checkPalindrome(int number) {
		int rev = reverseNumber(number);
		if (rev == number) {
			return true;
		} else
			return false;

	}

	static void reverseAndAdd(int number) {
		if (checkPalindrome(number)) {
			System.out.println("No is Already a Palindrome");
		} else {
			while (!checkPalindrome(number)) {
				int rev = reverseNumber(number);
				int sum = rev + number;
				System.out.println(rev+" + " + number +" = " + sum);
				number = sum;
			}
		}
	}

}
