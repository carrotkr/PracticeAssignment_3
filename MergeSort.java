/**
 * MergeSort
 */
public class MergeSort implements SortingAlgorithm {

	private static int[] temp;
	
	private static void merge(int[] a, int low, int mid, int high) {
		int i = low;
		int j = (mid + 1);
		
		for (int k = low; k <= high; k++) {
			temp[k] = a[k];
		}
		
		for (int k = low; k <= high; k++) {
			if (i > mid) {
				a[k]	 = temp[j++];
			} else if (j > high) {
				a[k] = temp[i++];
			} else if (SortingAlgorithm.findLessValue(temp[j], temp[i])) {
				a[k] = temp[j++];
			} else {
				a[k] = temp[i++];
			}
		}
	}
	
	@Override
	public void sort(int[] a) {
		temp = new int[a.length];
		sort(a, 0, (a.length - 1));
	}
	
	private static void sort(int[] a, int low, int high) {
		if (high <= low) {
			return;
		}
		
		int mid = (low + (high-low) / 2);
		
		sort(a, low, mid);
		
		sort(a, (mid + 1), high);
		
		merge(a, low, mid, high);
	}

}