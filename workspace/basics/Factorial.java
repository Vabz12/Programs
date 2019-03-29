package basic;

public class Factorial {

	public static void main(String[] args) {
	System.out.println(factorial(4));
		
	}

	static int factorial(int n){
		int result ; 
		if(n == 1){
			return 1 ;
		}else{
			result = factorial(n-1)*n;
			return result;
		}
		
	}
}
