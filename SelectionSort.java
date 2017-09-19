/**
 * SelectionSort
 */
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int n = a.length;
		
		for (int i = 0; i < n; i++) {
			int min = i;
			
			for (int j = (i + 1); j < n; j++) {
				if (SortingAlgorithm.findLessValue(a[j], a[min])) {
					min = j;
				}
			}
			
			SortingAlgorithm.exchangeValue(a, i, min);
		}
	}

}