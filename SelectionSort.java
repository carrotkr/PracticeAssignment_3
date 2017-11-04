/**
 * SelectionSort
 */
public class SelectionSort implements SortingAlgorithm {
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
		
		for (int i = 0; i < n; i++) {
			int min = i;
			
			for (int j = (i + 1); j < n; j++) {
				if (findLessValue(a[j], a[min])) {
					min = j;
				}
			}
			
			exchangeValue(a, i, min);
		}
	}
}
