/**
 * InsertionSort
 */
public class InsertionSort implements SortingAlgorithm {
	public void exchangeValue(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public boolean findLessValue(int x, int y) {
		return x < y;
	}
	
	@Override
	public void sort(int[] a) {
		int n = a.length;
		
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0 && findLessValue(a[j], a[j-1]); j--) {
				exchangeValue(a, j, j-1);
			}
		}
	}
}
