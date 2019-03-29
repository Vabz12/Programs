package basic;

import java.util.Arrays;

public class ArrayEquality {
	public static void main(String[] args) {
		isEqualArray();
		String[] strArray1 = { "Hello", "Hi", "Vaibhav", "How ", "Are", "You" };
		String[] strArray2 = { "Hello", "Hi", "Vaibhav", "How ", "Are", "You" };
		
		boolean isEqual = false;
		
		if (strArray1.length == strArray2.length) {
			for (int i = 0; i < strArray1.length; i++) {
				if (strArray1[i] == strArray2[i]) {
					isEqual = true;
				}
			}
		}
		else {
			isEqual = false;
		}
		if (isEqual) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
	}
	
	static boolean isEqualArray(){
		
		String [] s1 = {"java","j2ee","spring","c++"};
		String [] s2 = {"java","hibernate","spring","c++"};
		String [] s3 = {"java","j2ee","spring","c++"};
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		Arrays.sort(s3);
		
		System.out.println(Arrays.equals(s1, s2));
		System.out.println(Arrays.equals(s2, s3));
		System.out.println(Arrays.deepEquals(s1, s3));
		
		return false;
	
	}
}
