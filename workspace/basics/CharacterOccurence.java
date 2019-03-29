package basic;

import java.util.HashMap;

public class CharacterOccurence {

	public static void main(String[] args) {

		countOccurence("Hello How are You ");

	}

	static void countOccurence(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] str = s.toLowerCase().toCharArray();
		for (char c : str) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}
