package dataStructExamples;

public class QuickSortEx {

	public static void main(String args[]) {

		// Array Declared ...
		int[] a = {8,7,6,5,4,3,2,1};
		
		// Variables defined ...
		int start = 0;
		int end = a.length - 1;

		// Sort method Called ...
		sort(a, start, end);
		
		// For Loop Iterator
		System.out.print("[");
		for (int al : a)
			System.out.print(al + ",");
		System.out.println("]");
	}
	
	// Method to Sort the elements of array ...
	static void sort(int[] a, int start, int end) {

		// If Pivot value is greater than the Q ...
		if (start >= end)	
			return;	
		int i = divide(a, start, end);
		sort(a, start, i - 1); // Left SubArray Recursion
		sort(a, i + 1, end); // Right SubArray Recursion 

	}

	// This method will be called when the elements in the array are sorted on
	// right side but not the other side...
	static int divide(int[] a, int start, int end) {

		// The first index will be pivot .. a[start]
		int pivot = a[start];
		// Element P is the first element after pivot ...
		int p = start + 1;
		// Element Q is the last element in the list ...
		int q = end;

		// If element Q is greater than element P than this while loop will
		// execute ...
		// Step 4 : Repeat Step 1, 2, 3 . till Q value is greater than P...
	
		while (q >= p) {
			//
			if (p <= end) {
				// Step 1 : Increment P till the P > Pivot element.
				while (a[p] < pivot) {
					// Increment P value.
					p++;
					// If P is greater than or equal to
					if (p >= end)
						break;
				}
			}

			// Step 2 : Decrement Q till the Q < Pivot element and Q greater
			// than 0.
			if (q >= 0) {
				
				while (a[q] > pivot) {	
					q--;
					if (q < 0) {
						break;
					}
				}
			}

			// Step 3 : If value of Q is greater than P ... Swap values of Q
			// with P ...
			if (q > p) {
				// Temp variable t is used to swap the values ...
			
				int t = a[q];
				a[q] = a[p];
				a[p] = t;
				
			}
		}

		// Step 5: If value of Q is less than P than Swap the value of Q with
		// Pivot
		if (q < p)
		a[start] = a[q];
		a[q] = pivot;
		// Step 6 : This returned value will act as middle element ...
		return q;

	}
}
