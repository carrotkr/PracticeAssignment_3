/**
 * BubbleSort
 */
public class BubbleSort implements SortingAlgorithm {
	public void exchangeValue(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	@Override
	public void sort(int[] a) {
		int n = a.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					exchangeValue(a, j - 1, j);
				}
			}
		}
	}
}
