package basic;

import java.util.HashSet;

public class FindCommonElements {

	public static void main(String[] args) {
		Integer [] arr1 = {1,2,5,3,6};
		Integer arr2[] = {6,4,2,1,5,3};
		
		HashSet< Integer> s = new HashSet<>();
		
		for(int i = 0 ; i<arr1.length-1;i++){
			for(int j = 0 ; j <arr2.length-1;j++){
				if(arr1[i].equals(arr2[j])){
					s.add(arr1[i]);
				}
			}
		}
		System.out.println(s);
	}
}
