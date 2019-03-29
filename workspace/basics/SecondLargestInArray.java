package basic;

public class SecondLargestInArray {

	public static void main(String[] args) {
		System.out.println(secondLargest(new int[] { 41, 21, 8, 9, 24, 45 }));
	}

	static int secondLargest(int[] input) {
		int firstLargest = 0, secondLargest = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = input[i];
			} else if (input[i] < firstLargest && input[i] > secondLargest) {
				secondLargest = input[i];
			}
		}
		return secondLargest;
	}
}
