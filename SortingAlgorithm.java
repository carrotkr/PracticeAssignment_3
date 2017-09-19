/**
 * SortingAlgorithm is just a decorator for sorting.
 * (A real implementation would require a comparator and sort any object using a template.)
 * @author dgbrizan
 */
public interface SortingAlgorithm {

	public void sort(int[] a);
	
	public static boolean findLessValue(int x, int y) {
		return x < y;
	}
	
	public static void exchangeValue(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
