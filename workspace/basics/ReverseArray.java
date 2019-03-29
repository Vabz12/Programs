package basic;

public class ReverseArray {

	public static void main(String[] args) {
		reverse("vaibhav");

	}

	static void reverse(String s) {

		char[] a = s.toLowerCase().toCharArray();
		
		for (int i = 0; i <= a.length-1; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1-i];
			a[a.length - 1-i] = (char) temp;
			System.out.print(a[i]);
		}
	}
}
