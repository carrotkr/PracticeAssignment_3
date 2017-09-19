/**
 * BubbleSort
 */
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int n = a.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					SortingAlgorithm.exchangeValue(a, j - 1, j);
				}
			}
		}
	}

}