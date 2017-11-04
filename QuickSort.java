/**
 * QuickSort
 */
public class QuickSort implements SortingAlgorithm {
	public static void exchangeValue(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static boolean findLessValue(int x, int y) {
		return x < y;
	}
	
	@Override
	public void sort(int[] a) {
		sort(a, 0, (a.length - 1));
	}
	
	private static void sort(int[] a, int low, int high) {
		if (high <= low) {
			return;
		}
		
		int j = partition(a, low, high);
		
		sort(a, low, j-1);
		
		sort(a, j+1, high);
	}
	
	private static int partition(int[] a, int low, int high) {
		int i = low;
		int j = (high + 1);
		int partitionItem = a[low];
		
		while (true) {
			while (findLessValue(a[++i], partitionItem)) {
				if (i == high) {
					break;
				}
			}
			
			while (findLessValue(partitionItem, a[--j])) {
				if (j == low) {
					break;
				}
			}
			
			if (i >= j) {
				break;
			}
			
			exchangeValue(a, i, j);
		}
		
		exchangeValue(a, low, j);
		
		return j;
	}

}
