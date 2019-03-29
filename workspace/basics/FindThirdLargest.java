package basic;

public class FindThirdLargest {

	public static void main(String[] args) {
		System.out.println(thirdLargest(new int[] { 1, 6, 5, 3, 11, 12, 10 }));
	}
	public static int thirdLargest(int[] arr) {

		int largest = 0, secondLargest = 0, thirdLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (largest < arr[i]) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			} else if (secondLargest < arr[i]) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			} else if (thirdLargest < arr[i]) {
				thirdLargest = arr[i];
			}
		}
		return thirdLargest;
	}
}
