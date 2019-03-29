package basic;

import java.util.Arrays;

public class SwapStrings {
	public static void main(String[] args) {
		String str = "Vaibhav";
		reverse(str);
	}

	public static void reverse(String input) {
		char[] c = input.toLowerCase().toCharArray();
		System.out.println("original array : " + Arrays.toString(c));
		// handling null, empty and one element array
		for (int i = 0; i < c.length / 2; i++) {
			int temp = c[i]; // swap numbers
			c[i] = c[c.length - 1 - i];
			c[c.length - 1 - i] = (char) temp;
		}
		System.out.println("reversed array : " + Arrays.toString(c));
	}
}
