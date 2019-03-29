package basic;

import java.util.LinkedHashMap;

public class LargestSubstring {

	public static void main(String[] args) {
		largestSubstring("javaconceptoftheday");
	}

	static void largestSubstring(String s) {

		char[] str = s.toLowerCase().toCharArray();

		String longestSubString = null;
		int longestSubStringLength = 0;

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		
		for (int i = 0; i < str.length; i++) {
			char c = str[i];
			if (!map.containsKey(c)) {
				map.put(c, i);
			
			} else {
				i = map.get(c);
				map.clear();
			}
		
			if (map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
			}
		}
		System.out.println(map);
		System.out.println(longestSubString);
		System.out.println(longestSubStringLength);

	}

}
