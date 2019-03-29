package basic;

import java.util.Arrays;

public class ArraySumOfSubArray {
	public static void main(String[] args) {
		subArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
	}

	static void subArray(int[] arr, int number) {

		int sum = arr[0];
		int start = 0;

		for (int i = 1; i < arr.length; i++) {
			sum = sum + arr[i];
			while (sum > number && start <= i - 1) {
				sum = sum - arr[start];
				start++;
			}
			if (sum == number) {
				System.out.println(
						"Continuous sub array of " + Arrays.toString(arr) + " whose sum is " + number + " is ");
				for (int j = start; j <= i; j++) {
					System.out.print("["+arr[j]+"]");
				}
				System.out.println();
			}
		}
	}

}
