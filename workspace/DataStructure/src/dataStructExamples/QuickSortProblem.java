package dataStructExamples;


public class QuickSortProblem {

	public static void main(String[] args) {

		int[] a = {8,3,1,0,11,2};
		int start = 0;
		int end = a.length -1; 
		sort(a, start, end);
		
		for(int al : a){
			System.out.println(al+ " ");
		}
		
	}

  private static void sort(int[] a, int start, int end) {
		if(start>=end)
			return;
		int i = divideArray(a, start, end);
		sort(a, start, i-1);
		sort(a, i+1, end);
	}

	static int divideArray(int[] a, int start, int end) {
		int pivot = a[start];
		int p = start + 1;
		int q = end;

		while(q>=p){
		if (p <= end) {
			while (a[p] < pivot) {
				p++;
				if(p>=end){
					break;
				}
			}
		}
		if (q >= 0) {
			while (a[q] > pivot) {
				q--;
				if (q < 0){
				break;
				}
			}
		}
		
		if (q > p) {
			int temp = a[p];
			a[p] = a[q];
			a[q] = temp;
		}
		}
		if(q < p){
			a[start] =a[q];
			a[q] = pivot;
		}
		return end;
	}
}
