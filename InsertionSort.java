/**
 * InsertionSort
 */
public class InsertionSort implements SortingAlgorithm {
	
	@Override
	public void sort(int[] a) {
		int n = a.length;
		
		for (int i = 1; i < n; i++) {
			for (int j = i; j > 0 && SortingAlgorithm.findLessValue(a[j], a[j-1]); j--) {
				SortingAlgorithm.exchangeValue(a, j, j-1);
			}
		}
	}
	
}