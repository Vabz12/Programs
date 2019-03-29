package basic;

public class PalindromeString {

	public static void main(String[] args) {
		isStringPalindrome("helleh");
		isStringPalindrome("kanak");
	}

	static void isStringPalindrome(String s) {
		char[] str = s.toLowerCase().toCharArray();

		String rev = "";
		for (int i = str.length - 1; i >= 0; i--) {
			rev = rev + str[i];
		}
		if (s.equals(rev)) {
			System.out.println("P");
		} else {
			System.out.println("NP");
		}
	}
}
