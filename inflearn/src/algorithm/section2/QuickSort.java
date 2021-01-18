package algorithm.section2;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {15, 5, 3, 2, 9, 4, 7, 6};
		quickSort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	private static void quickSort(int[] A, int p, int r) {
		if(p < r) {
			int q = partition(A, p, r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}

	private static int partition(int[] data, int p, int r) {
		int x = data[r];
		int i = p - 1;
		for(int j=p ; j<r ; j++) {
			if(data[j]<=x) {
				i = i + 1;
				exchange(data, i, j);
			}
		}
		exchange(data, ++i, r);
		return i;
	}

	private static void exchange(int[] data, int i, int j) {
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
}
