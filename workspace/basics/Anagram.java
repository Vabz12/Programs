package basic;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		isAnagram("Hello","hi");
		isAnagram("Vaibhav", "vahbvai");
	}	
	public static void isAnagram(String s1 , String s2){
		
		String str1 = s1.toLowerCase().replaceAll("\\s","");
		String str2 = s2.toLowerCase().replaceAll("\\s","");
		
		boolean isAnagram = true;
		
		if(str1.length() != str2.length()){
			isAnagram = false;
		}
		else{
			char[] arr1 = str1.toCharArray();
			char[] arr2 = str2.toCharArray();
			 
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			isAnagram = Arrays.equals(arr1, arr2);
		}
		if(isAnagram){
			System.out.println("String is Anagram");
		}else{
			System.out.println("String is not an Anagram");
		}
	}
}
