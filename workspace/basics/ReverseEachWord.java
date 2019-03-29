package basic;

public class ReverseEachWord {

	public static void main(String[] args) {
		reverseWordOfString("Hello how are you ");
	}
	
	static void reverseWordOfString(String s){
		
		String[] st = s.split(" ");
		String revString = "";
		
		for(int i = 0 ; i<st.length;i++){
			String word = st[i];
			String revWords = "";
			for(int j = word.length()-1; j>=0 ; j--){
				revWords += word.charAt(j);				
			}
			revString = revString + revWords + " ";
			
		}System.out.println(revString);
		
	}
	
}
