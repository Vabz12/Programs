package basic;

public class Fibonnaci {

	public static void main(String[] args) {
		System.out.println(fibonnaciSeries(5));
		
	}
	
	static int fibonnaciSeries(int value){
		if(value == 1 || value == 2){
			return 1;
		}
		return fibonnaciSeries(value-1)+fibonnaciSeries(value-2);
	}
	
}
