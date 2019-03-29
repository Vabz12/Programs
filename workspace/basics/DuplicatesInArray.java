package basic;

import java.util.HashMap;

public class DuplicatesInArray {

	public static void findDuplicates() {
		String[] array = { "abc", "def", "efg", "def", "xyz", "abc" };
		int length = array.length - 1;
		int i, j;
		for (i = 0; i <= length; i++) {
			for (j = i + 1; j <= length; j++) {
				if ((array[i].equals(array[j])) && (i != j)) {
					System.out.println("Duplicate elements in array are : " + array[j]);
				}
			}
		}
	}

	static void duplicatesUsingHashMap() {
		int[] ch = {12, 13, 15, 15, 17};
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int v : ch) {
			if (map.containsKey(v)) {
				map.put(v, map.get(v) + 1);
				System.out.println(" Duplicates in array are : " + v);
			} else {
				map.put(v, 1);
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
	//	findDuplicates();
		duplicatesUsingHashMap();
	}
}
