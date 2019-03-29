package basic;

public class SpacePositionReverse {

	public static void main(String[] args) {
		reverseString("Hello how are you doing today ? ");
	}
	
	static void reverseString(String str){
		
		char[] s = str.toCharArray();
		
		char[] result = new char[s.length];
		
		for(int i =0 ; i<s.length; i++){
			if(s[i] == ' '){
				result[i] = ' '; 
			}
			
		}
		
		int j = result.length-1;
		
		for(int i =0 ; i <s.length; i++){
			if(s[i]!= ' '){
				if(s[j] == ' '){
					j--;
				}
				result[j] = s[i];
				j--;
			}
		}
		System.out.println(result);
	}
	
}
