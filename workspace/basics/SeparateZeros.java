package basic;

import java.util.Arrays;

public class SeparateZeros {

	public static void main(String[] args) {
		moveZerostoEnd(new int[] { 0, 1, 0, 3, 0, 2, 4, 5 });
	}

	static void moveZerostoEnd(int[] inputArray) {
		
		int counter = 0;
		for (int i = 0; i < inputArray.length; i++) {
			if(inputArray[i] !=0){
				inputArray[counter] = inputArray[i];
				counter++;
			}
		}
		while(counter < inputArray.length){
			inputArray[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
	}
}
