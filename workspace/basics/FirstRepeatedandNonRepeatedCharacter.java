package basic;

import java.util.HashMap;

public class FirstRepeatedandNonRepeatedCharacter {

	public static void main(String[] args) {
		repeatedCharachters("HHHellooo");
	}

	static void repeatedCharachters(String s) {

		char[] str = s.toCharArray();

		HashMap<Character, Integer> m = new HashMap<>();
		for (char c : str) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		for (char c : str) {
			if (m.get(c) == 1) {
				System.out.println("Non Repeated Character  : " + s + " is " + c);
				break;
			}
		}
		for (char c : str) {
			if (m.get(c) > 1) {
				System.out.println("Most Repeated Character : " + s + " is " + c);
				break;
			}
		}
	}

}
