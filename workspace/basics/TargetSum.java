package basic;

import java.util.HashMap;

public class TargetSum {

	public static void main(String[] args) {
		// sumOfTwoConsecutive(new int[] { 1, 2, 3, 4, 1, 5, 6 }, 7);

		int[] a = {2, 45, 7, 3, 5, 1, 8, 9};
		sumOfTwoConsecutive(a, 10);
		sumOnTarget(a, 10);
	}

	static void sumOfTwoConsecutive(int[] array, int target) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[i] + array[j]) == target) {
					System.out.println("[" + i + "," + j + "]");
				}
			}
		}
	}

	static void sumOnTarget(int[] array, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : array) {
			if (map.containsKey(i))
				System.out.println("[" + i + "," + map.get(i) + "]");
			else
				map.put(target - i, i);
		}
	}
}
