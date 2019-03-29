package basic;

public class ReverseString {

	public static void main(String[] args) {

		ReverseString rs = new ReverseString();

		// This will reverse each and every thing of String passed ..
		// rs.reverseString();

		// This will keep words same but in the reverse form ..
		// rs.reverseStringWord();

		// This is the Recursively Called method when we have a string .
		String str = "! hi how are you today !";
		System.out.print(rs.reverseRecursively(str));

		// String Buffer
		// rs.reverseUsingBuffer();

		// rs.reverseUsingBuilder();

	}

	public String reverseString(String s) {

		char[] str = s.toLowerCase().toCharArray();
		// reverses string the same way it was added .
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}
		return s;
	}

	public String reverseStringWord(String s) {
		String[] str = s.split(" ");
		// reverses string with the words at same position
		for (int i = str.length - 1; i >= 0; i--) {
			String finalString = "";
			finalString = finalString + str[i];
			System.out.print(str[i] + " ");
		}
		return s;
	}

	public String reverseRecursively(String str) {
		if ((str == null) || (str.length() <= 1)) {
			return str;
		}
		return reverseRecursively(str.substring(1)) + str.charAt(0);
	}

	public void reverseUsingBuffer() {
		StringBuffer sb = new StringBuffer("! hi how are you today !");
		System.out.println(sb.reverse());
	}

	public void reverseUsingBuilder() {
		StringBuilder sb = new StringBuilder("! hi how are you today !");
		System.out.println(sb.reverse());
	}
}
