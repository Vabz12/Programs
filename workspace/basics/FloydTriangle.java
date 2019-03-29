package basic;

public class FloydTriangle {

	public static void main(String[] args) {

		floydTriangle(4);
		
	}
	
	static int floydTriangle(int n){
		int value = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value + " ");
				value++;
			}
			System.out.println();
		}
		return value;
	}
}
