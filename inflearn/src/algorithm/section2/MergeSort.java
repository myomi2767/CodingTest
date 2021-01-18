package algorithm.section2;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 2, 5, 4, 7, 9};
		mergeSort(arr, 0, arr.length-1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	private static void mergeSort(int[] A, int p, int r) {
		if(p<r) {
			int q = (p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	private static void merge(int[] data, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int k = p;
		int[] temp = new int[data.length];
		while(i <= q && j <= r) {
			if(data[i] <= data[j]) {
				temp[k++] = data[i++];
			}else {
				temp[k++] = data[j++];
			}
		}
		
		while(i <= q) {
			temp[k++] = data[i++];
		}
		
		while(j <= r) {
			temp[k++] = data[j++];
		}
		
		for(int z=p; z<=r; z++)
			data[z] = temp[z];
		
	}
}
