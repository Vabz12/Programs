package basic;

public class StringPermutations {
	public static void main(String[] args) {
		StringPermutation("JSP");
	}

   static void stringPermutes(String permutation, String s){
		
		if(s.length() == 0){
			System.out.println(permutation);
		}else{
			for(int i= 0 ; i< s.length();i++){
				stringPermutes(permutation + s.charAt(i), s.substring(0, i) + s.substring(i+1, s.length()));
			}
		}
		
	}
   static void StringPermutation(String input){
	   stringPermutes(" " ,input);
   }
}
