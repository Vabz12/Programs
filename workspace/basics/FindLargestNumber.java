package basic;

public class FindLargestNumber {

	public static void main(String[] args) {
		System.out.println(findNum(123,2));

	}

	static int findNum(int num, int digit) {

		char c = Integer.toString(digit).charAt(0);
		
		for (int i = num; i > 0;i--) {
			if (Integer.toString(i).indexOf(c) == -1) {
				return i;
			}
		}
		return -1;
	}

}
